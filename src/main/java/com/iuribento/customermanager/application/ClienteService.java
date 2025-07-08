package com.iuribento.customermanager.application;

import com.iuribento.customermanager.application.exceptions.NotFoundException;
import com.iuribento.customermanager.core.domain.Cliente;
import com.iuribento.customermanager.core.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePorId(UUID id){
        return clienteRepository.findById(id).orElseThrow(
                ()-> new NotFoundException("Cliente não encontrado")
        );
    }

    public Cliente criarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
