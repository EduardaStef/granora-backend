package com.devduda.granora.repository;

import com.devduda.granora.model.Parcelamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParcelamentoRepository extends JpaRepository<Parcelamento, UUID> {
}
