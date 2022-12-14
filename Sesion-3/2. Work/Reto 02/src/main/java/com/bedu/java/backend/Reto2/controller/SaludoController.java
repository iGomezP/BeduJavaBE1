package com.bedu.java.backend.Reto2.controller;

import com.bedu.java.backend.Reto2.model.Saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

	@GetMapping("/saludo/{nombre}")
	public Saludo saluda(@PathVariable String nombre){
		Saludo saludo = new Saludo(nombre);
		saludo.setMensaje("!!Hola Mundo!!");
		return saludo;
	}
}
