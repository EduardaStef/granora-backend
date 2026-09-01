package com.devduda.granora.model;

import jakarta.persistence.*;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
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
}
