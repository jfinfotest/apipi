package com.cesde.proyecto_integrador.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesde.proyecto_integrador.model.Asistencia;
import com.cesde.proyecto_integrador.repository.AsistenciaRepository;
import com.cesde.proyecto_integrador.service.AsistenciaService;

@Service
public class AsistenciaServiceImpl implements AsistenciaService {

    @Autowired
    AsistenciaRepository asistenciaRepository;

    @Override
    public List<Asistencia> getAllAsistencias() {
        return asistenciaRepository.findAll();
    }

    @Override
    public Asistencia getAsistenciaById(Long id) {
        return asistenciaRepository.findById(id).get();
    }

    @Override
    public Asistencia saveAsistencia(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public Asistencia updateAsistencia(Long id, Asistencia asistencia) {
        Asistencia asistenciaActual = asistenciaRepository.findById(id).get();
        asistenciaActual.setFecha(asistencia.getFecha());
        asistenciaActual.setEstado(asistencia.getEstado());
        asistenciaActual.setEstudiante(asistencia.getEstudiante());       
        return asistenciaRepository.save(asistenciaActual);
    }

    @Override
    public void deleteAsistencia(Long id) {
        asistenciaRepository.deleteById(id);
    }
}