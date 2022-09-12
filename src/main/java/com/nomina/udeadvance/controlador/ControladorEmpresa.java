package com.nomina.udeadvance.controlador;

import com.nomina.udeadvance.entidades.Empresa;
import com.nomina.udeadvance.servicios.ServicioImpEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/enterprises")
@RestController
public class ControladorEmpresa {

    @Autowired
    private ServicioImpEmpresa siem;

    /*GET/enterprises*/
    @GetMapping
    public List<Empresa> listar() {
        return siem.listarEmpresa();
    }
    /*POST/enterprises*/
    @PostMapping
    public Empresa insertar (@RequestBody Empresa empresa){
        return siem.guardarEmpresa(empresa);
    }

    /*@PutMapping
    public Empresa actualizar (@RequestBody Empresa empresa){
        return siem.actualizarEmpresa(empresa);}
        @DeleteMapping
    public void eliminar (@RequestBody Empresa empresa){siem.eliminarEmpresa(empresa.getNit());}*/


    /*GET/enterprises/nit*/
    @GetMapping("/enterprises/{nit}")
    public Empresa consultar (@PathVariable("nit") String nit){
        return siem.consultarEmpresaPorId(nit);
    }

    /*PATCH/enterprises/nit*/
    @PatchMapping("/enterprises/{nit}")
    public Empresa actualizarPor(@PathVariable("nit") String nit, @RequestBody Map<Object, Object> objectMap){
        return siem.actualizarPorId(nit, objectMap);
    }


    /*DELETE/enterprises/nit*/
    @DeleteMapping("/enterprises/{nit}")
    public void eliminar(@PathVariable("nit") String nit, @RequestBody Empresa empresa){
        siem.eliminarEmpresa(empresa.getNit());
    }
}