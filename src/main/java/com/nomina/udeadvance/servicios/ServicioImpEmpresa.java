package com.nomina.udeadvance.servicios;

import com.nomina.udeadvance.entidades.Empleado;
import com.nomina.udeadvance.entidades.Empresa;
import com.nomina.udeadvance.repositorio.RepositorioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServicioImpEmpresa implements ServicioEmpresa{

    @Autowired
    private RepositorioEmpresa repositorioEmpresa;
    /*GET/enterprises*/
    @Override
    public List<Empresa> listarEmpresa() {return repositorioEmpresa.findAll(); }
    /*POST/enterprises*/
    @Override
    public Empresa guardarEmpresa(Empresa empresa) {
        return repositorioEmpresa.save(empresa);
    }
    /*GET/enterprises/nit*/
    @Override
    public Empresa consultarEmpresaPorId(String nit) {
        return repositorioEmpresa.getReferenceById(nit);
    }

    /*DELETE/enterprises/nit*/
    @Override
    public Empresa eliminarEmpresa(String nit) {
        repositorioEmpresa.deleteById(nit);
        return null;
    }
    /*PATCH/enterprises/nit*/
    @Override
    public Empresa actualizarPorId(String nit, Map<Object, Object> objectMap) {
        Empresa empresa = repositorioEmpresa.findById(nit).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empleado.class, (String) key );
            ReflectionUtils.setField(field, empresa, value);
        });
        return repositorioEmpresa.save(empresa);
    }

}