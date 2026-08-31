package com.devduda.granora.controller;

import com.devduda.granora.infra.security.TokenService;
import com.devduda.granora.model.Usuario;
import com.devduda.granora.model.dto.AutenticacaoDTO;
import com.devduda.granora.model.dto.RetornoLoginDTO;
import com.devduda.granora.model.dto.UsuarioDTO;
import com.devduda.granora.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/usuario")
    private ResponseEntity<Usuario> criarUsuario(@RequestBody UsuarioDTO usuario) {
        service.criarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity login (@RequestBody AutenticacaoDTO auth) {
        UsernamePasswordAuthenticationToken tokenUsuario = new UsernamePasswordAuthenticationToken(auth.getApelido(), auth.getSenha());
        var autorizacao = this.authenticationManager.authenticate(tokenUsuario);

        String token = tokenService.gerarToken((Usuario) autorizacao.getPrincipal());

        return ResponseEntity.ok(new RetornoLoginDTO(token, LocalDateTime.now()));
    }
}

