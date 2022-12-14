package org.bedu.java.backend.Reto1;

import org.bedu.java.backend.Reto1.service.SaludoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto1Application implements CommandLineRunner {

	private final SaludoService saludoService;

	public Reto1Application(SaludoService saludoService){
		this.saludoService = saludoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Reto1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludoService.saluda());
	}
}
