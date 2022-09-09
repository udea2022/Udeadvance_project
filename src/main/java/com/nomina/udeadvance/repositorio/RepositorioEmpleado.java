package com.nomina.udeadvance.repositorio;

import com.nomina.udeadvance.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEmpleado extends JpaRepository<Empleado, Integer> {
}
