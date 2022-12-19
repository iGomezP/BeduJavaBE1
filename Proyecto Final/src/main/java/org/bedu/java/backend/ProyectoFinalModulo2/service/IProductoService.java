package org.bedu.java.backend.ProyectoFinalModulo2.service;

import org.bedu.java.backend.ProyectoFinalModulo2.entity.Producto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

	List<Producto> getAll();

	Optional<Producto> getById(Long id);

	ResponseEntity<Producto> createProducto(Producto producto);

	ResponseEntity<Producto> updateProducto(Long id, Producto producto);

	ResponseEntity<Producto> deleteProducto(Long id);
}
