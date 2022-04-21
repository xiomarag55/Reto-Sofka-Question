package com.example.retosoftka.model.dto;

import com.example.retosoftka.model.entity.Categoria;

import java.io.Serializable;

public class CategoriaDto implements Serializable {

    private Long id;
    private String nombre;
    private int dificultad;

    public CategoriaDto() {
    }

    public CategoriaDto(Categoria categoria) {
        this.id = categoria.getId();
        this.nombre = categoria.getNombre();
        this.dificultad = categoria.getDificultad();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
}
