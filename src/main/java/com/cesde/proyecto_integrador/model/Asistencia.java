package com.cesde.proyecto_integrador.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private Estado estado;

    public enum Estado {
        PRESENTE,
        FALTA,
        TARDE
    }

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

}
