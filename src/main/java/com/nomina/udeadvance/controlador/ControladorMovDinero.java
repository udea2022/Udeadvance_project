package com.nomina.udeadvance.controlador;


import com.nomina.udeadvance.entidades.MovimientoDinero;
import com.nomina.udeadvance.servicios.ServicioImpMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RequestMapping
@RestController
public class ControladorMovDinero {

    @Autowired
    public ServicioImpMovimientoDinero smd;

    @GetMapping("/dinero")
    public List<MovimientoDinero> listar(){
        return smd.listarMovimientoDinero();
    }

    @PostMapping
    public MovimientoDinero guardar(@RequestBody MovimientoDinero movimientodinero){
        return smd.guardarMovimientoDinero(movimientodinero);
    }
    @GetMapping("/{id}")
    public MovimientoDinero consultar(@PathVariable("id") String id) {
        return smd.consultarMovimientoPorId(id);
    }
    @PatchMapping("/{id}")
    public MovimientoDinero actualizarPor(@PathVariable("id") String id, @RequestBody Map<Object, Object> objectMap) {
        return smd.actualizarPorCodigo(id, objectMap);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") String id) {
        smd.eliminarMovimientoDinero(id);
    }
}




