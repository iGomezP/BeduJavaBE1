package com.bedu.java.backend.PostWork3.controller;


import com.bedu.java.backend.PostWork3.model.CrearFunko;
import com.bedu.java.backend.PostWork3.model.ProductosFunko;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.LinkedList;

@RestController
@RequestMapping("/funko")
public class FunkoController {

	private final List<ProductosFunko> funkos;
	private Long ultimoId = 1004L;

	public FunkoController(){
		funkos = new LinkedList<>();
		funkos.add(new ProductosFunko(1001L, "Vaporeon", 649, "Funko POP! Pokémon - Vaporeon Diamond"));
		funkos.add(new ProductosFunko(1002L, "Charmander", 950, "Funko POP! Pokémon - Charmander Diamond"));
		funkos.add(new ProductosFunko(1003L, "Flareon", 299, "Funko POP! Pokémon - Flareon"));
		funkos.add(new ProductosFunko(1004L, "Psyduck", 500, "Funko POP! Pokémon - Psyduck"));
	}

	@GetMapping("/obtenerFunkos")
	public List<ProductosFunko> obtenerFunkos(){
		return funkos;
	}

	@GetMapping("/obtenerFunko/{id}")
	public ProductosFunko obtenerFunko(@PathVariable Long id){
		// Tradicional
		// for (ProductosFunko funko : funkos){
		// 	if (funko.getId().equals(id)){
		// 		return funko;
		// 	}
		// }
		// return null;

		// Usando Stream
		return funkos.stream().filter(funko -> funko.getId().equals(id)).findFirst().orElse(null);
	}

	@PostMapping("/crearFunko")
	public ProductosFunko crearFunko(@RequestBody CrearFunko funko){
		ProductosFunko nuevoFunko = new ProductosFunko(++ultimoId, funko.getNombre(), funko.getPrecio(), funko.getDescripcion());
		funkos.add(nuevoFunko);
		return nuevoFunko;
	}

	@PatchMapping("/modificarFunko/{id}")
	public ProductosFunko modificarFunko(@PathVariable Long id, @RequestBody CrearFunko funko){
		for (ProductosFunko f : funkos ){
			if (f.getId().equals(id)){
				ProductosFunko funkoModificado = new ProductosFunko(
						id,
						(funko.getNombre() == null || funko.getNombre().equals("")) ? f.getNombre() : funko.getNombre(),
						(funko.getPrecio() == 0) ? f.getPrecio() : funko.getPrecio(),
						(funko.getDescripcion() == null || funko.getNombre().equals("")) ? f.getDescripcion() : funko.getDescripcion());
				funkos.set(funkos.indexOf(f), funkoModificado);
				return funkoModificado;
			}
		}
		return null;
	}

	@DeleteMapping("/borrarFunko/{id}")
	public List<ProductosFunko> borrarFunko (@PathVariable Long id){
		for (ProductosFunko f : funkos ){
			if (f.getId().equals(id)){
				funkos.remove(f);
				return funkos;
			}
		}
		return null;
	}
}

