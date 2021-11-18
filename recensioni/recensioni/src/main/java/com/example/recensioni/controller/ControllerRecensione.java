package com.example.recensioni.controller;

import com.example.recensioni.data.dto.RecensioneDTO;
import com.example.recensioni.data.entity.Recensione;
import com.example.recensioni.service.RecensioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/recensione")
public class ControllerRecensione {
    @Autowired
    RecensioneService recService;

    @PostMapping(value = "/addrecensione")
    public void addRecensione(@RequestBody Recensione r){
        recService.addRecensione(r);
    }

    @GetMapping(value = "/listarecensioni")
    public List<Recensione> listRecensioni(){
        return recService.elencoRecensioni();
    }

    @PostMapping(value="/recperarticolo")
    public List<RecensioneDTO> recPerArticolo(@RequestBody List<Integer> listaid){
        return recService.recPerArticolo(listaid);
    }
}
