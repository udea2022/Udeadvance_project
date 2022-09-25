package com.nomina.udeadvance.servicios;

import com.nomina.udeadvance.entidades.MovimientoDinero;
import com.nomina.udeadvance.repositorio.RepositorioEmpleado;
import com.nomina.udeadvance.repositorio.RepositorioMovDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServicioImpMovimientoDinero implements ServicioMovimientoDinero {

    @Autowired
    private RepositorioMovDinero repositorioMovDinero;

    @Override
    public MovimientoDinero actualizarPorCodigo(String id, Map<Object, Object> objectMap) {
        MovimientoDinero movimientoDinero = repositorioMovDinero.findById(id).get();
        objectMap.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(MovimientoDinero.class, (String) key);
            ReflectionUtils.setField(field, movimientoDinero, value);
        });
        return repositorioMovDinero.save(movimientoDinero);
    }

    @Override
    public List<MovimientoDinero> listarMovimientoDinero() {
        return repositorioMovDinero.findAll();
    }

    @Override
    public MovimientoDinero guardarMovimientoDinero(MovimientoDinero movimientoDinero) {
        return repositorioMovDinero.save(movimientoDinero);
    }

    @Override
    public MovimientoDinero consultarMovimientoPorId(String id) {
        return repositorioMovDinero.findById(id).get();
    }

    @Override
    public MovimientoDinero actualizarMovimientoDinero(MovimientoDinero movimientoDinero) {
        return null;
    }

    @Override
    public void eliminarMovimientoDinero(String id) {
        repositorioMovDinero.deleteById(id);
    }

}
