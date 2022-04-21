package com.example.retosoftka.service;

import com.example.retosoftka.model.dto.CategoriaDto;

import java.util.List;

public interface CategoriaService {

    List<CategoriaDto> listar();

    void guardar(CategoriaDto categoriaDto);
}
