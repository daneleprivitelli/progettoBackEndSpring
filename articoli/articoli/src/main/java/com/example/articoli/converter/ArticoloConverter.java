package com.example.articoli.converter;

import com.example.articoli.data.dto.ArticoloDTO;
import com.example.articoli.data.entity.Articolo;
import com.example.articoli.feign.RecensioneClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticoloConverter {

    @Autowired
    public RecensioneClient recensioneClient;

    public ArticoloDTO convertiArticolo(Articolo articolo) {

        ArticoloDTO dto=new ArticoloDTO();

        dto.setRecensioni(recensioneClient.recPerArticolo(articolo.getRecensioniId()));

        dto.setNome(articolo.getNome());

        dto.setPrezzo(articolo.getPrezzo());

        return dto;

    }
}
