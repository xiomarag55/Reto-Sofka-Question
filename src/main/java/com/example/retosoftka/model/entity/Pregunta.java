package com.example.retosoftka.model.entity;

import javax.persistence.*;

@Entity
@Table
public class Pregunta {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String pregunta;

    @ManyToOne
    private Categoria categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
