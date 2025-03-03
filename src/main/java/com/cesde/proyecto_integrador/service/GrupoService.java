package com.cesde.proyecto_integrador.service;

import java.util.List;

import com.cesde.proyecto_integrador.model.Grupo;

public interface GrupoService {
    List<Grupo> getAllGrupos();

    Grupo getGrupoById(Long id);

    Grupo createGrupo(Grupo grupo);

    Grupo updateGrupo(Long id, Grupo grupo);

    void deleteGrupo(Long id);
}
