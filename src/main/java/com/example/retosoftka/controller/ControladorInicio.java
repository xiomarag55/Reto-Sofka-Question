package com.example.retosoftka.controller;

import com.example.retosoftka.model.dto.CategoriaDto;
import com.example.retosoftka.model.entity.Categoria;
import com.example.retosoftka.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControladorInicio {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/")
    public String inicio(Model model){
        List<CategoriaDto> categorias = categoriaService.listar();
        model.addAttribute("categorias", categorias);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Categoria categoria){
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(CategoriaDto categoriaDto){
        categoriaService.guardar(categoriaDto);
        return "redirect:/";
    }
}
