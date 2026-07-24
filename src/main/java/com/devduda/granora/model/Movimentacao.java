package com.devduda.granora.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Getter
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

    public void setTitulo(String titulo) {
        if(Objects.nonNull(titulo) && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            throw new RuntimeException("Título inválido");
        }
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setSaida(boolean saida) {
        isSaida = saida;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setPago(boolean pago) {
        isPago = pago;
    }

    public void setParcelamento(Parcelamento parcelamento) {
        this.parcelamento = parcelamento;
    }

    public void setValor(Double valor) {
        if((Objects.nonNull(valor)) && valor > 0.0) {
            this.valor = valor;
        } else {
            throw new RuntimeException("Valor inválido");
        }
    }
}
