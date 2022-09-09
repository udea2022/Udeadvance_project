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

    @GetMapping("/{id}")
    public Empleado consultar(@PathVariable("id") Integer id) {
        return sie.consultarEmpleadoPorId(id);
    }

    @PostMapping
    public Empleado insertar(@RequestBody Empleado empleado) {
        return sie.guardarEmpleado(empleado);
    }

    @PutMapping
    public Empleado actualizar(@RequestBody Empleado empleado) {
        return sie.actualizarEmpleado(empleado);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Empleado empleado) {
        sie.eliminarEmpleado(empleado.getDocumento());
    }

    @PatchMapping("/{id}")
    public Empleado actualizarPor(@PathVariable("id") Integer id, @RequestBody Map<Object, Object> objectMap) {
        return sie.actualizarPorId(id, objectMap);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id, @RequestBody Empleado empleado) {
        sie.eliminarEmpleado(empleado.getDocumento());
    }
}
