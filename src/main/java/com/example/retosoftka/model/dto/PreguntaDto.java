package com.example.retosoftka.model.dto;

import java.util.List;

public class PreguntaDto {

    private Long id;
    private String pregunta;
    private List<OpcionesDto> opcionesDto;
    private Long idCategoria;

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

    public List<OpcionesDto> getOpcionesDto() {
        return opcionesDto;
    }

    public void setOpcionesDto(List<OpcionesDto> opcionesDto) {
        this.opcionesDto = opcionesDto;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }
}
