package org.bedu.java.backend.Ejemplo1.persistence;

import org.bedu.java.backend.Ejemplo1.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
