package com.example.articoli.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Articolo {

    @Id
    @GeneratedValue
    Integer id;

    @Column
    String nome;

    @Column
    double prezzo;

    @Transient
    List<Integer> recensioniId;
}
