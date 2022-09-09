package com.nomina.udeadvance.servicios;

import com.nomina.udeadvance.entidades.MovimientoDinero;

import java.util.List;
import java.util.Map;

public interface ServicioMovimientoDinero {
    public List<MovimientoDinero>listarMovimientoDinero();

    public MovimientoDinero guardarMovimientoDinero(MovimientoDinero movimientoDinero);

    public MovimientoDinero consultarMovimientoPorId(MovimientoDinero );
    public MovimientoDinero actualizarMovimientoDinero(MovimientoDinero movimientoDinero);
    public void eliminarMovimientoDinero(Long codigo);

    MovimientoDinero actualizarPorCodigo(Long codigo, Map<Object, Object> objectMap);
}