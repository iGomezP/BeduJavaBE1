package com.bedu.java.backend.Reto3.controller;

import com.bedu.java.backend.Reto3.model.Saludo;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

	@PutMapping("/saludo")
	public Saludo saluda(@RequestBody Saludo saludo){
		saludo.setFechaNacimiento(saludo.getFechaNacimiento().plusDays(1));
		return saludo;
	}
}
