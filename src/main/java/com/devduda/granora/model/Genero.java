package com.devduda.granora.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "titulo", length = 300, nullable = false)
    private String titulo;

    @Column(name = "descricao", length = 650)
    private String descricao;

    @JoinColumn(name = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Genero(String titulo, String descricao, Usuario usuario) {
        setTitulo(titulo);
        setDescricao(descricao);
        setUsuario(usuario);
    }

    public void setTitulo(String titulo) {
        if (Objects.nonNull(titulo) && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            throw new RuntimeException("Título inválido");
        }
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
