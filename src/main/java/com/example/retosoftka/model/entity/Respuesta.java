package com.example.retosoftka.model.entity;

import javax.persistence.*;

@Entity
@Table
public class Respuesta {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String respuesta;

    @ManyToOne
    private Pregunta pregunta;

    @Column
    private boolean esCorrecta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public boolean isEsCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }
}
