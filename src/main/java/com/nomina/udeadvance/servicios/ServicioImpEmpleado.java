package com.nomina.udeadvance.servicios;

import com.nomina.udeadvance.entidades.Empleado;
import com.nomina.udeadvance.repositorio.RepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServicioImpEmpleado implements ServicioEmpleado{

    @Autowired
    private RepositorioEmpleado repositorioEmpleado;

    @Override
    public List<Empleado> listarEmpleado() {
        return repositorioEmpleado.findAll();
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }

    /*@Override
    public Empleado consultarEmpleadoPorId(Integer documento) {
        return repositorioEmpleado.findById(documento).get();
    }*/

    @Override
    public Empleado actualizarEmpleado(Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Integer documento) {
        repositorioEmpleado.deleteById(documento);
    }

    @Override
    public Empleado actualizarPorId(Integer id, Map<Object, Object> objectMap) {
        Empleado empleado = repositorioEmpleado.findById(id).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empleado.class, (String) key );
            ReflectionUtils.setField(field, empleado, value);
        });
        return repositorioEmpleado.save(empleado);
    }
}
