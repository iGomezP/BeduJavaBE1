package org.bedu.java.backend.Reto1.persistence;

import org.bedu.java.backend.Reto1.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, Long> {
}
