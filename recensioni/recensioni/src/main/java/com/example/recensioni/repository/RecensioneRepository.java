package com.example.recensioni.repository;

import com.example.recensioni.data.entity.Recensione;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecensioneRepository extends MongoRepository<Recensione,Integer> {
}
