package com.example.articoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ArticoliApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticoliApplication.class, args);
    }

}
