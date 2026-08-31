package com.devduda.granora.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class RetornoLoginDTO {

    private String token;
    private LocalDateTime dataLogin;
}
