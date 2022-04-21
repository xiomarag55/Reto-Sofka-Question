package com.example.retosoftka.service;

import com.example.retosoftka.model.dto.OpcionesDto;
import com.example.retosoftka.model.dto.PreguntaDto;
import com.example.retosoftka.model.entity.Categoria;
import com.example.retosoftka.model.entity.Pregunta;
import com.example.retosoftka.model.entity.Respuesta;
import com.example.retosoftka.repository.PreguntaRepository;
import com.example.retosoftka.repository.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PreguntaServiceImpl implements PreguntasService{

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Autowired
    private RespuestaRepository respuestaRepository;

    @Override
    public void guardarPreguntaYOpciones(PreguntaDto preguntaDto) {
        Pregunta pregunta = new Pregunta();
        pregunta.setPregunta(preguntaDto.getPregunta());
        pregunta.setCategoria(new Categoria(preguntaDto.getIdCategoria()));
        preguntaRepository.save(pregunta);

        for (OpcionesDto opcionesDto: preguntaDto.getOpcionesDto()){
            Respuesta respuesta = new Respuesta();
            respuesta.setPregunta(pregunta);
            respuesta.setRespuesta(opcionesDto.getRespuesta());
            respuesta.setEsCorrecta(opcionesDto.isEsCorrecta());
            respuestaRepository.save(respuesta);
        }
    }

    @Override
    public List<PreguntaDto> listar() {
        return new ArrayList<>();
    }
}
