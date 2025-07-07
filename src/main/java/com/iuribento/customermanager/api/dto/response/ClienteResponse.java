package com.iuribento.customermanager.api.dto.response;

import com.iuribento.customermanager.core.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteResponse {

    private UUID id;
    private String nome;
    private String email;
    private LocalDate dataNascimento;

    public static ClienteResponse converterParaClienteResponse(Cliente cliente){
        return ClienteResponse.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .email(cliente.getEmail())
                .dataNascimento(cliente.getDataNascimento())
                .build();
    }
}
