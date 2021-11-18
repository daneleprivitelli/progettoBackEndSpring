package com.example.recensioni.service;

import com.example.recensioni.converter.ConverterRecensione;
import com.example.recensioni.data.dto.RecensioneDTO;
import com.example.recensioni.data.entity.Recensione;
import com.example.recensioni.repository.RecensioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RecensioneServiceImpl implements RecensioneService{
    @Autowired
    RecensioneRepository recensioneRepository;

    @Autowired
    ConverterRecensione converter;

    @Override
    public List<Recensione> elencoRecensioni() {
        return recensioneRepository.findAll();
    }

    @Override
    public void addRecensione(Recensione recensione){

        recensione.setId(sequenceGeneratorService.generateSequence(Recensione.SEQUENCE_NAME));
        recensioneRepository.save(recensione);
    }


    @Override
    public List<RecensioneDTO> recPerArticolo(List<Integer> listaid) {
        List<Recensione> lista=new ArrayList<>();
        for(Integer i:listaid){
            lista.add(recensioneRepository.findById(i).get());
        }
        List<RecensioneDTO> dtos=converter.convertRecensione(lista);
        return dtos;
    }



    //    @Override
//    public String findContentById(Integer id){
//        return recRepo.findById(id).get().getContenuto();
//    }

}
