package com.devduda.granora.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.UUID;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "movimentacao")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "titulo", length = 300, nullable = false)
    private String titulo;

    @Column(name = "descricao", length = 650)
    private String descricao;

    @Column(name = "data", nullable = false)
    private Date data;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @Column(name = "is_saida")
    private boolean isSaida;

    @JoinColumn(name = "id_genero")
    @ManyToOne(optional = false, cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Genero genero;

    @Column(name = "is_pago")
    private boolean isPago;

    @JoinColumn(name = "id_parcelamento")
    @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Parcelamento parcelamento;

    public Movimentacao(String titulo, String descricao, Date data, Double valor, boolean isSaida, Genero genero, boolean isPago, boolean isCredito, Integer qtdParcela, Double vlrParcela, Parcelamento parcelamento) {
        setTitulo(titulo);
        setDescricao(descricao);
        setData(data);
        setValor(valor);
        setSaida(isSaida);
        setGenero(genero);
        setPago(isPago);
        setParcelamento(parcelamento);
    }
}
