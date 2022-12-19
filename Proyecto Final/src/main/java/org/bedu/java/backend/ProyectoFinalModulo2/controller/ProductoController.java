package org.bedu.java.backend.ProyectoFinalModulo2.controller;

import org.apache.coyote.Response;
import org.bedu.java.backend.ProyectoFinalModulo2.entity.Producto;
import org.bedu.java.backend.ProyectoFinalModulo2.service.IProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funkos")
public class ProductoController {
	private IProductoService productoService;

	public ProductoController (IProductoService productoService){
		this.productoService = productoService;
	}

	@GetMapping
	public List<Producto> getAll(){
		return productoService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<Producto> getById(@PathVariable("id") Long id){
		return productoService.getById(id);
	}

	@PostMapping
	public ResponseEntity<Producto> createProducto (@RequestBody Producto producto){
		return productoService.createProducto(producto);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Producto> updateProducto(@PathVariable("id") Long id, @RequestBody Producto producto){
		return productoService.updateProducto(id, producto);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Producto> deleteProducto(@PathVariable("id") Long id){
		return productoService.deleteProducto(id);
	}
}
