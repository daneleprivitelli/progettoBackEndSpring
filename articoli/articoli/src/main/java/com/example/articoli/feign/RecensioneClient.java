package com.example.articoli.feign;

import com.example.articoli.data.dto.RecensioneDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name="RecensioneService", url="localhost:8081/api/recensione")
public interface RecensioneClient {

    @PostMapping(value="/recperarticolo")
    public List<RecensioneDTO> recPerArticolo(@RequestBody List<Integer> ids);

}
