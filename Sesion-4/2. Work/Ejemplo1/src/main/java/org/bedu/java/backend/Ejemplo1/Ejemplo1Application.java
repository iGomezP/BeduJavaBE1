package org.bedu.java.backend.Ejemplo1;

import org.bedu.java.backend.Ejemplo1.model.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejemplo1Application  implements CommandLineRunner {

	/**
	 * 1ra forma: No recomendada
	 * //@Autowired
	 * private Saludo saludo;
	 */

	/**
	 * 2da forma: A veces puede usarse ya que ahora permitimos que alguna otra clase modifique en cualquier momento
	 * la instancia de Saludo que estamos usando. Esto, en algunos casos, puede ser algo que estemos buscando,
	 * pero en la mayoría de las ocasiones buscamos asegurar que siempre usemos una misma única instancia,
	 * y que una vez que esta se ha inyectado no sea modificado.
	 *
	 * private Saludo saludo;
	 *
	 * //@Autowired
	 * public void setSaludo(Saludo saludo) {
	 * 	this.saludo = saludo;
	 * }
	 */

	// 3ra forma y la más recomendada
	private Saludo saludo;

	@Autowired
	public Ejemplo1Application(Saludo saludo){
		this.saludo = saludo;
	}

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo1Application.class, args);
	}

	public void run(String... args) throws Exception{
		System.out.println(saludo.getNombre());
	}

}
