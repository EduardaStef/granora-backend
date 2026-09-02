package com.devduda.granora.repository;

import com.devduda.granora.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    public UserDetails findByApelido(String apelido);
}
