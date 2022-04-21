package com.example.retosoftka.controller;

import com.example.retosoftka.model.dto.CategoriaDto;
import com.example.retosoftka.model.dto.PreguntaDto;
import com.example.retosoftka.model.entity.Categoria;
import com.example.retosoftka.model.entity.Pregunta;
import com.example.retosoftka.service.CategoriaService;
import com.example.retosoftka.service.PreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/preguntas")
public class PreguntasController {

    @Autowired
    private PreguntasService preguntasService;

    @GetMapping("/a")
    public String inicioPreguntas(Model model) {
        List<PreguntaDto> preguntas = preguntasService.listar();
        model.addAttribute("preguntas", preguntas);
        return "preguntasVista";
    }

    @GetMapping("/agregar")
    public String agregar(Pregunta preguntas) {
        return "modificarPreguntas";
    }

    @PostMapping("/guardar")
    public String guardar(PreguntaDto preguntaDto) {
        preguntasService.guardarPreguntaYOpciones(preguntaDto);
        return "redirect:/";
    }
}
