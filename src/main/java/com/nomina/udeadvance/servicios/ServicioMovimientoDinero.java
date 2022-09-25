package com.nomina.udeadvance.servicios;

import com.nomina.udeadvance.entidades.MovimientoDinero;

import java.util.List;
import java.util.Map;

public interface ServicioMovimientoDinero {
    public List<MovimientoDinero>listarMovimientoDinero();

    public MovimientoDinero guardarMovimientoDinero(MovimientoDinero movimientoDinero);

    public MovimientoDinero consultarMovimientoPorId(String id);
    public MovimientoDinero actualizarMovimientoDinero(MovimientoDinero movimientoDinero);
    public void eliminarMovimientoDinero(String id);

    MovimientoDinero actualizarPorCodigo(String id, Map<Object, Object> objectMap);
}