package com.example.articoli.controller;

import com.example.articoli.data.dto.ArticoloDTO;
import com.example.articoli.data.entity.Articolo;
import com.example.articoli.service.ArticoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/api/articoli/")
public class ControllerArticolo {
    @Autowired
    ArticoloService aService;

    @PostMapping(value="/addarticolo")
    public void addArticolo(@RequestBody Articolo a){
        aService.salvaArticolo(a);
    }

    @GetMapping(value="/listaarticoli")
    public List<Articolo> listArticoli(){
        return aService.listArticoli();
    }

    @GetMapping(value="/recensioniarticolo/{id}")
    public ArticoloDTO recensioniArticolo(@PathVariable("id")Integer id){
        return aService.recensioniArticolo(id);
    }

}
