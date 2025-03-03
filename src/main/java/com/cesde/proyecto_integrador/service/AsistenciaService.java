package com.cesde.proyecto_integrador.service;

import java.util.List;

import com.cesde.proyecto_integrador.model.Asistencia;

public interface AsistenciaService {
    List<Asistencia> getAllAsistencias();

    Asistencia getAsistenciaById(Long id);

    Asistencia saveAsistencia(Asistencia asistencia);

    Asistencia updateAsistencia(Long id, Asistencia asistencia);

    void deleteAsistencia(Long id);
}
