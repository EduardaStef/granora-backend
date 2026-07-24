package com.devduda.granora.controller;

import com.devduda.granora.model.Genero;
import com.devduda.granora.model.dto.GeneroDto;
import com.devduda.granora.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/genero")
public class GeneroController {

    @Autowired
    private GeneroService service;

    @PostMapping
    private ResponseEntity<Genero> criarGenero(@RequestBody GeneroDto genero) {
        return ResponseEntity.ok(service.criarGenero(genero));
    }

    @PutMapping
    private ResponseEntity<Genero> editarGenero(@RequestBody Genero genero) {
        return ResponseEntity.ok(service.editarGenero(genero));
    }

    @GetMapping
    private ResponseEntity<List<Genero>> buscarGeneros() {
        List<Genero> generos = service.buscarGeneros();
        return ResponseEntity.ok(generos);
    }

    @GetMapping("/{id}")
    private ResponseEntity<Genero> buscarGenero(@PathVariable UUID id) {
        Genero genero = service.buscarGeneroPorId(id);
        return ResponseEntity.ok(genero);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Genero> deletarGenero(@PathVariable UUID id) {
        service.deletarGenero(id);
        return ResponseEntity.ok().build();
    }
}
