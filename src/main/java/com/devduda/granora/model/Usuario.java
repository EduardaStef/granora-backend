package com.devduda.granora.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "apelido", length = 300, nullable = false, unique = true)
    private String apelido;

    @Column(name = "email", length = 650)
    private String email;

    @Column(name = "senha", length = 250, nullable = false)
    private String senha;

    public Usuario(String apelido, String email, String senha) {
        setApelido(apelido);
        setEmail(email);
        setSenha(senha);
    }
}
