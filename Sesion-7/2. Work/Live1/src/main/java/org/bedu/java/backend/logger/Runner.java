package org.bedu.java.backend.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

	// Para indicar donde se ejecuta el log
	private static Logger logger = LoggerFactory.getLogger(Runner.class);

	/**
	 * Niveles más comunes de log
	 * .debug: Mensajes de app. Se tiene que activar con "logging.level.root=debug" en application.properties
	 * .info: Cosas importantes que pasan en el código.
	 * .warning: Alertas, problemas recuperables.
	 * .error: Problemas irrecuperables.
	 */

	/**
	 * Ejercicio:
	 * Crear una clase llamada Primos que valide si un número N es primo.
	 * Un número primo es aquel que es divisible por la unidad y si mismo.
	 *
	 * Utilizar un logger info si el número es primo.
	 * Utilizar un logger error si el número es negativo.
	 * Utilizar un logger warn si el número no es primo.
	 *
	 * Crear un método CommandLineRunner para probar el código.
	 *
	 */

	@Override
	public void run(String... args) throws Exception {
		String name="Demo de Loggers";

		logger.info("Aplicación de Spring Boot inicializada");
		logger.warn("El método debe recibir una cadena no vacía");
		logger.error("Hubo un problema crítico en la aplicación");
		//logger.debug("Hello There!");
		logger.info("App: {}", name);
	}
}
