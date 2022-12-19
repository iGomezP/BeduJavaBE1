package org.bedu.java.backend.ProyectoFinalModulo2.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.bedu.java.backend.ProyectoFinalModulo2.entity.Producto;
import org.bedu.java.backend.ProyectoFinalModulo2.repository.IProductoRepository;
import org.bedu.java.backend.ProyectoFinalModulo2.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProductoServiceImpl implements IProductoService {

	private IProductoRepository productoRepository;

	@Autowired
	public ProductoServiceImpl (IProductoRepository productoRepository){
		this.productoRepository = productoRepository;
	}

	@Override
	public List<Producto> getAll(){
		return productoRepository.findAll();
	}

	@Override
	public Optional<Producto> getById(Long id) {
		Optional<Producto> existProduct = productoRepository.findById(id);
		if (existProduct.isPresent()){
			log.info("Producto encontrado - {}", existProduct.get().getName());
			return existProduct;
		}
		log.warn("El producto no existe en la BD.");
		return null;
	}

	@Override
	public ResponseEntity<Producto> createProducto(Producto producto){
		Producto existProducto = productoRepository.findOneByName(producto.getName());

		if (existProducto == null){
			log.info("Creando nuevo producto...");
			productoRepository.save(producto);
			return new ResponseEntity<>(producto, HttpStatus.CREATED);
		}
		log.warn("El producto ya existe en la BD.");
		return new ResponseEntity<>(existProducto, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Producto> updateProducto(Long id, Producto producto){
		Optional<Producto> existProduct = productoRepository.findById(id);
		if (existProduct.isEmpty() || existProduct == null){
			log.warn("El producto no existe.");
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		log.info("Actualizando producto...");
		Producto actualProducto = existProduct.get();

		// Stock - apartado.
		int newLayaway = 0;
		int newStock = 0;
		if (actualProducto.getStock() >= 0) {
			newStock = existProduct.get().getStock() + producto.getStock();
			newLayaway = newStock - producto.getLayaway();
		}
		if (actualProducto.getStock() < 0){
			newStock = 0;
			newLayaway = 0;
			log.warn("Producto sin stock, no se puede apartar");
		}

		// Nombre
		if (producto.getName() == ""){
			actualProducto.setName(existProduct.get().getName());
		} else {
			actualProducto.setName(producto.getName());
		}

		// Precio
		if(producto.getPrice() == 0){
			actualProducto.setPrice(existProduct.get().getPrice());
		} else {
			actualProducto.setPrice(producto.getPrice());
		}

		// Stock
		if(producto.getStock() > 0){
			actualProducto.setStock(newStock);
		} else if (producto.getStock() == 0){
			actualProducto.setStock(producto.getStock());
		}

		// Photo
		actualProducto.setPhoto(producto.getPhoto());

		// Apartado (layaway)
		if (producto.getLayaway() > 0){
			actualProducto.setStock(newLayaway);
			actualProducto.setLayaway(producto.getLayaway());
		} else if (actualProducto.getStock() == 0 || actualProducto.getStock() < 0) {
			log.warn("Producto sin stock, no se puede apartar");
			actualProducto.setStock(0);
			actualProducto.setLayaway(0);
		} else {
			actualProducto.setLayaway(producto.getLayaway());
		}

		productoRepository.save(actualProducto);

		log.info("Producto actualizado: {}",actualProducto.getName());
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@Override
	public ResponseEntity<Producto> deleteProducto(Long id){
		Optional<Producto> existProduct = productoRepository.findById(id);

		if(existProduct.isEmpty()){
			log.warn("El producto no existe.");
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		log.info("Producto eliminado.");
		productoRepository.deleteById(id);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
}
