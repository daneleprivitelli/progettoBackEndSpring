package com.example.recensioni.data.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import javax.validation.constraints.NotNull;

@Document
@Data
public class Recensione {

    @Field("id")
    @NotNull
    Integer id;

    @Field
    String contenuto;
}
