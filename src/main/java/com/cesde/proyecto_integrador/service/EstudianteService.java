package com.cesde.proyecto_integrador.service;

import java.util.List;

import com.cesde.proyecto_integrador.model.Estudiante;

public interface EstudianteService {
    List<Estudiante> getAllEstudiantes();

    Estudiante getEstudianteById(Long id);

    Estudiante createEstudiante(Estudiante estudiante);

    Estudiante updateEstudiante(Long id, Estudiante estudiante);

    void deleteEstudiante(Long id);
}
