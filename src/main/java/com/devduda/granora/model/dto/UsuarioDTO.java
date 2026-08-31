package com.devduda.granora.model.dto;

import com.devduda.granora.model.enums.Perfil;
import lombok.Getter;

@Getter
public class UsuarioDTO {
    private String apelido;
    private String senha;
    private Perfil perfil;
}
