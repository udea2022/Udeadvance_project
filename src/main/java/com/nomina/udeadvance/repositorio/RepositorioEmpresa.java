package com.nomina.udeadvance.repositorio;

import com.nomina.udeadvance.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEmpresa extends JpaRepository <Empresa, Integer> {
}