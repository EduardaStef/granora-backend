package com.devduda.granora.service;

import com.devduda.granora.model.Usuario;
import com.devduda.granora.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario criarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

}
