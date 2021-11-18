package com.example.articoli.service;


import com.example.articoli.converter.ArticoloConverter;
import com.example.articoli.data.dto.ArticoloDTO;
import com.example.articoli.data.entity.Articolo;
import com.example.articoli.repository.ArticoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticoloServiceImpl implements ArticoloService {
    @Autowired
    ArticoloRepository articoloRepository;

    @Autowired
    ArticoloConverter converter;

    @Override
    public List<Articolo> listArticoli() {
        return articoloRepository.findAll();
    }

    @Override
    public void salvaArticolo(Articolo a) {
        articoloRepository.save(a);
    }


    @Override
    public ArticoloDTO recensioniArticolo(Integer id) {


        Articolo a = articoloRepository.findById(id).get();

        ArticoloDTO dto = converter.convertiArticolo(a);

        return dto;
    }

}
