package com.example.retosoftka.controller;


import com.example.retosoftka.model.dto.CategoriaDto;
import com.example.retosoftka.model.entity.Categoria;

import com.example.retosoftka.repository.CategoriaRepository;
import com.example.retosoftka.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/all")
    public List<CategoriaDto> listaCategorias() {
        return categoriaService.listar();
    }

    @PostMapping("/")
    public void crearCategoria(CategoriaDto categoriaDto) {
        categoriaService.guardar(categoriaDto);
    }

}
