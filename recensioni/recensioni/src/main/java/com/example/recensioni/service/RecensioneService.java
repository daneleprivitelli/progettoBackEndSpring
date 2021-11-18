package com.example.recensioni.service;

import com.example.recensioni.data.dto.RecensioneDTO;
import com.example.recensioni.data.entity.Recensione;

import java.util.List;

public interface RecensioneService {
    List<Recensione> elencoRecensioni();
    void addRecensione(Recensione recensione);
    List<RecensioneDTO> recPerArticolo(List<Integer> listaid);
}
