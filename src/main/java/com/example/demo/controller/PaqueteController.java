package com.example.demo.controller;

import com.example.demo.model.Paquete;
import com.example.demo.service.PaqueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paquete")
public class PaqueteController {

    @Autowired
    private PaqueteService paqueteService;

    @GetMapping ("/buscarTodos")
    public List<Paquete> buscarTodos() {
        return paqueteService.buscarTodos();
    }

    @PostMapping("/nuevo")
    public Paquete crear(@RequestBody Paquete paquete) {
        return paqueteService.guardar(paquete);
    }

    @GetMapping("/buscar/{estado}")
    public List<Paquete> buscarEstado(@PathVariable String estado) {
        return paqueteService.buscarPorEstados(estado);
    }




}
