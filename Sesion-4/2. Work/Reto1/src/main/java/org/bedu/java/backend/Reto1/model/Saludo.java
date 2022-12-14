package org.bedu.java.backend.Reto1.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Saludo {
	private final String nombre;

	public Saludo() {
		this.nombre = "Nacho";

		System.out.println("Creando una instancia de Saludo");
	}

	public String getNombre() {
		return nombre;
	}
}
