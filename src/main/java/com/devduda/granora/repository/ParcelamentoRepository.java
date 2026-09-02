package com.devduda.granora.repository;

import com.devduda.granora.model.Parcelamento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelamentoRepository extends JpaRepository<Parcelamento, UUID> {
}
