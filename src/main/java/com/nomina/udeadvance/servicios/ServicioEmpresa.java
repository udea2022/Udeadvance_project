package com.nomina.udeadvance.servicios;

import com.nomina.udeadvance.entidades.Empresa;

import java.util.List;
import java.util.Map;

public interface ServicioEmpresa {
    public List<Empresa> listarEmpresa();
    public Empresa guardarEmpresa(Empresa empresa);
    public Empresa consultarEmpresaPorId(Integer nit);
    public Empresa eliminarEmpresa (Integer nit);
    Empresa actualizarPorId(Integer nit, Map<Object, Object> objectMap);
}