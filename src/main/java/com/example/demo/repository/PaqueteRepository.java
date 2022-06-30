package com.example.demo.repository;

import com.example.demo.model.Paquete;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PaqueteRepository extends MongoRepository<Paquete, String> {


    List<Paquete>  findByEstado(String estado);
}
