package com.devduda.granora.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.UUID;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "parcelamento")
public class Parcelamento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "qtd_parcela", nullable = false)
    private Integer qtdParcela;

    @Column(name = "vlr_parcela", nullable = false)
    private Double vlrParcela;

    @Column(name = "data_inicio", nullable = false)
    private Date dataInicio;

    public Parcelamento(Integer qtdParcela, Double vlrParcela, Date dataInicio) {
        setQtdParcela(qtdParcela);
        setVlrParcela(vlrParcela);
        setDataInicio(dataInicio);
    }
}
