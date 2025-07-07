package com.iuribento.customermanager.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ClienteRequest {

    @NotBlank
    private String nome;
    @Email
    @NotBlank
    private String email;
    @NotNull
    private LocalDate dataNascimento;
}
