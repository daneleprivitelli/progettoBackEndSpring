package com.example.recensioni.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "database_sequences")
public class DatabaseSequence {

    @Id
    private String id;

    private long sequence;

    public  DatabaseSequence() {}

    public String getId() {return  id;}

    public void setId(String id){ this.id = id;}

    public long getSequence(){ return  sequence;}

    public void setSequence(long sequence){ this.sequence = sequence; }
}
