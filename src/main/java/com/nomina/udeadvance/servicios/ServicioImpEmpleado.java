package com.nomina.udeadvance.servicios;

import com.nomina.udeadvance.entidades.Empleado;
import com.nomina.udeadvance.entidades.Empresa;
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

    /*GET /users */
    @Override
    public List<Empleado> listarEmpleado() { return repositorioEmpleado.findAll();
    }
    /*POST /users */
    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }
    /*GET /users/documento */
    @Override
    public Empleado consultarEmpleadoPorId(Integer documento) {
        return repositorioEmpleado.findById(documento).get();
    }
    /*PATCH/users/documento
    @Override
    public Empleado actualizarEmpleadoPorId(Integer documento, Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }*/

    /*DELETE/users/documento*/
    @Override
    public void eliminarEmpleadoPorId(Integer documento) {
        repositorioEmpleado.deleteById(documento);
    }

    /*PATCH/users/documento*/
    @Override
    public Empleado actualizarEmpleadoPorId(Integer documento, Map<Object, Object> objectMap) {
        Empleado empleado = repositorioEmpleado.findById(documento).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empleado.class, (String) key );
            ReflectionUtils.setField(field, empleado, value);
        });
        return repositorioEmpleado.save(empleado);
    }



}
