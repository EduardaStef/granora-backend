package com.devduda.granora.service;

import com.devduda.granora.model.Genero;
import com.devduda.granora.model.dto.GeneroDto;
import com.devduda.granora.repository.GeneroRepository;
import com.devduda.granora.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository repository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Genero criarGenero(GeneroDto genero) {
        return repository.save(new Genero(genero.titulo(), genero.descricao(), usuarioRepository.findById(genero.usuario()).get()));
    }

    public Genero editarGenero(Genero genero) {
        return genero;
    }

    public List<Genero> buscarGeneros() {
        return repository.findAll();
    }

    public Genero buscarGeneroPorId(UUID id) {
        return repository.findById(id).get();
    }

    public void deletarGenero(UUID id) {
        repository.delete(buscarGeneroPorId(id));
    }
}
