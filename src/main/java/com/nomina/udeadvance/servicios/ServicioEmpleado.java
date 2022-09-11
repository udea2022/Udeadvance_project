package com.nomina.udeadvance.servicios;

import com.nomina.udeadvance.entidades.Empleado;

import java.util.List;
import java.util.Map;
public interface ServicioEmpleado {
    public List<Empleado>listarEmpleado();
    public Empleado guardarEmpleado(Empleado empleado);
    public Empleado consultarEmpleadoPorId(Integer documento);

    public void eliminarEmpleadoPorId(Integer documento);

    Empleado actualizarEmpleadoPorId(Integer documento, Map<Object, Object> objectMap);
}
