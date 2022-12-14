package org.bedu.java.backend.Ejemplo2;

import org.bedu.java.backend.Ejemplo2.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejemplo2Application implements CommandLineRunner {

	private final SaludoService saludoService;

	public Ejemplo2Application (@Autowired SaludoService saludoService){
		this.saludoService = saludoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludoService.saluda());
	}
}
