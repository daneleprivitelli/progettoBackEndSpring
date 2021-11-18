package com.example.recensioni.converter;

import com.example.recensioni.data.dto.RecensioneDTO;
import com.example.recensioni.data.entity.Recensione;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ConverterRecensione {

    public List<RecensioneDTO> convertRecensione(List<Recensione> lista) {
        List<RecensioneDTO> dtos=new ArrayList<>();
        for(Recensione recensione:lista){
            RecensioneDTO dto=new RecensioneDTO();
            dto.setContenuto(recensione.getContenuto());
            dtos.add(dto);
        }
        return dtos;
    }

}
