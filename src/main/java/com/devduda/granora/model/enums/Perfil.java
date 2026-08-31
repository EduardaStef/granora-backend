package com.devduda.granora.model.enums;

public enum Perfil {

    ADMIN("admin"),
    USUARIO("user");

    private String perfil;

    Perfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }
}
