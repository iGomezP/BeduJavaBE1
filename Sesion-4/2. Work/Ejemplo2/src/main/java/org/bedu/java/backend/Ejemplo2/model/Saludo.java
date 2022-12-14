package org.bedu.java.backend.Ejemplo2.model;

import org.springframework.stereotype.Component;

@Component
public class Saludo {
	private final String nombre;

	public Saludo() {
		this.nombre = "Nacho";
	}

	public String getNombre() {
		return nombre;
	}
}
