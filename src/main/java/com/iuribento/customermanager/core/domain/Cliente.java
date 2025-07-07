package com.iuribento.customermanager.core.domain;

import com.iuribento.customermanager.api.dto.request.ClienteRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "clientes")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    public static Cliente converterParaCliente(ClienteRequest clienteRequest){
        return Cliente.builder()
                .nome(clienteRequest.getNome())
                .email(clienteRequest.getEmail())
                .dataNascimento(clienteRequest.getDataNascimento())
                .build();
    }
}
