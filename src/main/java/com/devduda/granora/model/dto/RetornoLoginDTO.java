package com.devduda.granora.model.dto;

import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RetornoLoginDTO {

    private String token;
    private LocalDateTime dataLogin;
}
