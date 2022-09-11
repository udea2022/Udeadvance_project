/*package com.nomina.udeadvance.servicios;

import com.nomina.udeadvance.entidades.MovimientoDinero;
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
    public List<MovimientoDinero> listarMovimientoDinero(MovimientoDinero codigo) {
        return repositorioMovDinero.findAll();
    }

    @Override
    public MovimientoDinero guardarMovimientoDinero(MovimientoDinero movimientoDinero) {
        return repositorioMovDinero.save(movimientoDinero);
    }

    public MovimientoDinero consultarMovimientoDineroPorId(MovimientoDinero codigo) {
        return repositorioMovDinero.findById(Long).get();
    }

    @Override
    public MovimientoDinero actualizarMovimientoDinero(MovimientoDinero movimientoDinero) {
        return repositorioMovDinero.save(movimientoDinero);
    }

    @Override
    public void eliminarMovimientoDinero(Long codigo) {
        repositorioMovDinero.deleteById(codigo);
    }

    @Override
    public MovimientoDinero actualizarPorCodigo(Long codigo, Map<Object, Object> objectMap) {
        MovimientoDinero movimientoDinero = repositorioMovDinero.findById(codigo).get();
        objectMap.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(MovimientoDinero.class, (String) key);
            ReflectionUtils.setField(field, movimientoDinero, value);
        });
        return repositorioMovDinero.save(movimientoDinero);
    }
}*/
