package com.example.retosoftka.service;

import com.example.retosoftka.model.dto.PreguntaDto;

import java.util.List;

public interface PreguntasService {

    void guardarPreguntaYOpciones(PreguntaDto preguntaDto);

    List<PreguntaDto> listar();
}
