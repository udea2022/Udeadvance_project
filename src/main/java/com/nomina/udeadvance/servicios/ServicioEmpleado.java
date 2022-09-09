package com.nomina.udeadvance.servicios;

import com.nomina.udeadvance.entidades.Empleado;

import java.util.List;
import java.util.Map;
public interface ServicioEmpleado {
    public List<Empleado>listarEmpleado();
    public Empleado guardarEmpleado(Empleado empleado);
    public Empleado consultarEmpleadoPorId(Integer documento);
    public Empleado actualizarEmpleado(Empleado empleado);
    public void eliminarEmpleado(Integer documento);

    Empleado actualizarPorId(Integer id, Map<Object, Object> objectMap);
}
