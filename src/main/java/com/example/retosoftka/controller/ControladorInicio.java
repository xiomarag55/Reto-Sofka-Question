package com.example.retosoftka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(Model model){
        var message = "Hola mundo thymeleaf";
        model.addAttribute("mensaje", message);
        return "index";
    }
}
