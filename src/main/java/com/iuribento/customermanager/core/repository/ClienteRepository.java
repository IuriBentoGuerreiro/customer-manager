package com.iuribento.customermanager.core.repository;

import com.iuribento.customermanager.core.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}
