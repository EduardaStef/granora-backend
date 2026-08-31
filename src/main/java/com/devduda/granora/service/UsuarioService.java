package com.devduda.granora.service;

import com.devduda.granora.model.Usuario;
import com.devduda.granora.model.dto.UsuarioDTO;
import com.devduda.granora.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario criarUsuario(UsuarioDTO usuario) {
        if(Objects.nonNull(this.repository.findByApelido(usuario.getApelido()))) {
            throw new RuntimeException("Usuário já existente na base");
        } else {
            String senhaEncriptada = new BCryptPasswordEncoder().encode(usuario.getSenha());
            Usuario novoUsuario = new Usuario(usuario.getApelido(), senhaEncriptada, usuario.getPerfil());
            return repository.save(novoUsuario);
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByApelido(username);
    }
}
