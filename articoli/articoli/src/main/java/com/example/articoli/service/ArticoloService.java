package com.example.articoli.service;

import com.example.articoli.data.dto.ArticoloDTO;
import com.example.articoli.data.entity.Articolo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticoloService{

    List<Articolo> listArticoli();

    void salvaArticolo(Articolo articolo);

    ArticoloDTO recensioniArticolo(Integer id);
}
