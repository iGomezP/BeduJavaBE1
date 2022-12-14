package org.bedu.java.backend.Ejemplo3;

import org.bedu.java.backend.Ejemplo3.model.Saludo;
import org.bedu.java.backend.Ejemplo3.service.SaludoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejemplo3Application implements CommandLineRunner {

	private SaludoService saludoService;

	public Ejemplo3Application (SaludoService saludoService){
		this.saludoService = saludoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludoService.saluda());
	}
}
