package com.cesde.proyecto_integrador.controller;

import com.cesde.proyecto_integrador.model.Asistencia;
import com.cesde.proyecto_integrador.service.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asistencias")
public class AsistenciaController {

    @Autowired
    private AsistenciaService asistenciaService;

    @GetMapping
    public ResponseEntity<List<Asistencia>> getAllAsistencias() {
        return ResponseEntity.ok(asistenciaService.getAllAsistencias());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asistencia> getAsistenciaById(@PathVariable Long id) {
        return ResponseEntity.ok(asistenciaService.getAsistenciaById(id));
    }

    @PostMapping
    public ResponseEntity<Asistencia> saveAsistencia(@RequestBody Asistencia asistencia) {
        return new ResponseEntity<>(asistenciaService.saveAsistencia(asistencia), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Asistencia> updateAsistencia(@PathVariable Long id, @RequestBody Asistencia asistencia) {
        return ResponseEntity.ok(asistenciaService.updateAsistencia(id, asistencia));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAsistencia(@PathVariable Long id) {
        asistenciaService.deleteAsistencia(id);
        return ResponseEntity.noContent().build();
    }
}