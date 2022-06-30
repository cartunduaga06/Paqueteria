package com.example.demo.service;

import com.example.demo.model.Paquete;
import com.example.demo.repository.PaqueteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaqueteService {

    private PaqueteRepository paqueteRepository;

    public PaqueteService(PaqueteRepository paqueteRepository) {
        this.paqueteRepository = paqueteRepository;
    }

    public Paquete guardar(Paquete p) {
        return paqueteRepository.save(p);
    }

    public Paquete buscar(String id) {
        return paqueteRepository.findById(id).get();
    }

    public List<Paquete> buscarTodos() {
        return paqueteRepository.findAll();
    }

    public void eliminar(String id) {
        paqueteRepository.deleteById(id);
    }

    public Paquete actualizar(Paquete p) {
        return paqueteRepository.save(p);
    }

    public List<Paquete> buscarPorEstados(String estado) {
        return paqueteRepository.findByEstado(estado);
    }


}
