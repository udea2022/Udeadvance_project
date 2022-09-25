package com.nomina.udeadvance.controlador;


import com.nomina.udeadvance.entidades.Empleado;
import com.nomina.udeadvance.servicios.ServicioImpEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//@RequestMapping
//@RestController
@Controller
public class ControladorEmpleado {

    @Autowired
    public ServicioImpEmpleado sie;

    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal OidcUser principal) {
        if(principal!=null){
            //System.out.print(principal.getClaims());
        }
        return "index";
    }

    @GetMapping("/usuario")
    public String listar(Model modelo) {
        modelo.addAttribute("usuario", sie.listarEmpleado());
        return ("usuario");}

        @GetMapping("usuario/nuevo")
        public String formularioRegistro (Model modelo){
            modelo.addAttribute("usuarioinsertar", new Empleado());
            return "frmusuario";
        }

        @PostMapping("usuario/guardar")
        public String insertar(Empleado empleado){
            sie.guardarEmpleado(empleado);
            return "redirect:/usuario";
        }

    @GetMapping("usuario/actualizar/{documento}")
    public String formularioActualizar(@PathVariable("documento")Integer documento, Model modelo){
        Empleado empleado=sie.consultarEmpleadoPorId(documento);
        modelo.addAttribute("usuarioactualizar", empleado);
        return "frmactualizar";
    }

    @PostMapping("usuario/actualizar")
    public String actualizar( Empleado empleado){
        sie.actualizarEmpleado(empleado);
        return "redirect:/usuario";
    }

    @GetMapping("usuario/eliminar/{documento}")
    public String eliminarporId(@PathVariable("documento") Integer documento){
        sie.eliminarEmpleadoPorId(documento);
        return ("redirect:/usuario");

    }
    }

