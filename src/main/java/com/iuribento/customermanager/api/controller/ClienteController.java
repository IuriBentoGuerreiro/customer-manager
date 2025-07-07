package com.iuribento.customermanager.api.controller;

import com.iuribento.customermanager.api.dto.request.ClienteRequest;
import com.iuribento.customermanager.api.dto.response.ClienteResponse;
import com.iuribento.customermanager.application.ClienteService;
import com.iuribento.customermanager.core.domain.Cliente;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteResponse> criarCliente(@RequestBody @Valid ClienteRequest clienteRequest){
        Cliente cliente = clienteService.criarCliente(Cliente.converterParaCliente(clienteRequest));
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ClienteResponse.converterParaClienteResponse(cliente));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> buscarClientePorId(@PathVariable UUID id){
        Cliente cliente = clienteService.buscarClientePorId(id);
        return ResponseEntity.ok(ClienteResponse.converterParaClienteResponse(cliente));
    }

    @GetMapping
    public ResponseEntity<List<ClienteResponse>> listarClientes(){
        List<ClienteResponse> clientes = clienteService.listarClientes().stream()
                .map(ClienteResponse::converterParaClienteResponse).toList();

        return ResponseEntity.ok().body(clientes);
    }
}
