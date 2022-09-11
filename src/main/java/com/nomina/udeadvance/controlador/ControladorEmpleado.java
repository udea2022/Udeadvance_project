package com.nomina.udeadvance.controlador;


import com.nomina.udeadvance.entidades.Empleado;
import com.nomina.udeadvance.servicios.ServicioImpEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/users")
@RestController
public class ControladorEmpleado {

    @Autowired
    public ServicioImpEmpleado sie;

    @GetMapping
    public List<Empleado> listar() {
        return sie.listarEmpleado();
    }

    @PostMapping
    public Empleado guardar(@RequestBody Empleado empleado) {
        return sie.guardarEmpleado(empleado);
    }
    /*@PatchMapping("/{documento}")
    public Empleado actualizar(@PathVariable("documento") Integer documento ) {
        return sie.consultarEmpleadoPorId(documento);
    }
    @DeleteMapping
    public void eliminar(@RequestBody Empleado empleado) {
        sie.eliminarEmpleado(empleado.getDocumento());
    }*/
    @GetMapping("/{documento}")
    public Empleado consultar(@PathVariable("documento") Integer documento) {
        return sie.consultarEmpleadoPorId(documento);
    }
    @PatchMapping("/{documento}")
    public Empleado actualizarPor(@PathVariable("documento") Integer documento, @RequestBody Map<Object, Object> objectMap) {
        return sie.actualizarEmpleadoPorId(documento, objectMap);
    }
    @DeleteMapping("/{documento}")
    public void eliminar(@PathVariable("documento") Integer documento) {
        sie.eliminarEmpleadoPorId(documento);
    }
}
