package com.example.retosoftka.service;

import com.example.retosoftka.model.dto.CategoriaDto;
import com.example.retosoftka.model.entity.Categoria;
import com.example.retosoftka.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public  class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaDto> listar() {
        List<CategoriaDto> categoriasList = new ArrayList<>();
        Iterable categorias = categoriaRepository.findAll();
        for (Object categoria : categorias) {
            categoriasList.add(new CategoriaDto((Categoria) categoria));
        }

        return categoriasList;
    }


    @Override
    public void guardar(CategoriaDto categoriaDto) {
        Categoria categoria = new Categoria();
        categoria.setNombre(categoriaDto.getNombre());
        categoria.setDificultad(categoriaDto.getDificultad());
        categoriaRepository.save(categoria);
    }
}
