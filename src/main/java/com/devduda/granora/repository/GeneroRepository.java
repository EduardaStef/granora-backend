package com.devduda.granora.repository;

import com.devduda.granora.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, UUID> {
}
