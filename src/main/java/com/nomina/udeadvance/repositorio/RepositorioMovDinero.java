package com.nomina.udeadvance.repositorio;

import com.nomina.udeadvance.entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMovDinero extends JpaRepository<MovimientoDinero, Long> {
}
