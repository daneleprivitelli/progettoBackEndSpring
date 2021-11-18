package com.example.articoli.data.dto;

import lombok.Data;

import java.util.List;

@Data
public class ArticoloDTO {

    String nome;

    double prezzo;

    List<RecensioneDTO> recensioni;
}
