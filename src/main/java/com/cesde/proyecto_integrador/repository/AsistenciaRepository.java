package com.cesde.proyecto_integrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesde.proyecto_integrador.model.Asistencia;
import java.util.List;
import java.time.LocalDate;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Long> {
    // List<Asistencia> findByFecha(LocalDate fecha);
    // List<Asistencia> findByfindByEstudianteId(Long estudianteId);
}
