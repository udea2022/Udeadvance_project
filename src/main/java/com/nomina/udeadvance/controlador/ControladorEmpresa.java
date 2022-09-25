package com.nomina.udeadvance.controlador;

import com.nomina.udeadvance.entidades.Empresa;
import com.nomina.udeadvance.servicios.ServicioImpEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//RequestMapping
//@RestController
@Controller
public class ControladorEmpresa {

    @Autowired
    private ServicioImpEmpresa siem;

    /*GET/enterprises*/
    @GetMapping("/enterprises")
        public String listar(Model modelo) {
        modelo.addAttribute("empresa", siem.listarEmpresa());
        return ("empresas");
    }
    /*POST/enterprises*/
    @GetMapping("empresas/nuevo")
    public String formularioRegistro(Model modelo){
        modelo.addAttribute("empresainsertar", new Empresa());
        return "frmempresas";
    }

    @PostMapping("empresas/guardar")
    public String insertar(Empresa empresa){
        siem.guardarEmpresa(empresa);
        return "redirect:/empresas";
    }

    @GetMapping("empresa/actualizar/{nit}")
    public String formularioActualizar(@PathVariable("nit")Integer nit, Model modelo){
        Empresa empresa=siem.consultarEmpresaPorId(nit);
        modelo.addAttribute("empresaactualizar", empresa);
        return "frmactualizarempresas";
    }

    @PostMapping("empresa/actualizar")
    public String actualizar( Empresa empresa){
        siem.guardarEmpresa(empresa);
        return "redirect:/empresas";
    }

    @GetMapping("empresas/eliminar/{nit}")
    public String eliminarporId(@PathVariable("nit") Integer nit){
        siem.consultarEmpresaPorId(nit);
        return ("redirect:/empresas");

    }
}
