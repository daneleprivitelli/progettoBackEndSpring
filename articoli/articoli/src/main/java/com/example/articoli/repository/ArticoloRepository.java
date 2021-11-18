package com.example.articoli.repository;

import com.example.articoli.data.entity.Articolo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticoloRepository extends JpaRepository<Articolo,Integer> {
}
