package org.bedu.java.backend.Reto1.controller;

import org.bedu.java.backend.Reto1.model.Producto;
import org.bedu.java.backend.Reto1.persistence.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	private final IProductoRepository iProductoRepository;

	@Autowired
	public ProductoController(IProductoRepository iProductoRepository){
		this.iProductoRepository = iProductoRepository;
	}

	@PostMapping
	public ResponseEntity<Void> crearProducto(@RequestBody Producto producto){
		Producto productoDB = iProductoRepository.save(producto);

		return ResponseEntity.created(URI.create(String.valueOf(productoDB.getId()))).build();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Producto> obtenerProducto(@PathVariable Long id){
		Optional<Producto> productoDB = iProductoRepository.findById(id);

		if (!productoDB.isPresent()){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encuentra el producto especificado.");
		}

		return ResponseEntity.ok(productoDB.get());
	}
}
