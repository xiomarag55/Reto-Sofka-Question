package com.example.retosoftka.controller;


import com.example.retosoftka.model.entity.Categoria;

import com.example.retosoftka.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;


    @GetMapping("/all")
   public List<Categoria> listaCategorias(){
        List<Categoria> actualList = new ArrayList<Categoria>();
        Iterable a = categoriaRepository.findAll();
        for (Object categoria: a){
            actualList.add((Categoria) categoria);
        }

        return actualList;
    }

}
