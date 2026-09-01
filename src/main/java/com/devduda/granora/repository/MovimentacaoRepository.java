package com.devduda.granora.repository;

import com.devduda.granora.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, UUID> {
}
