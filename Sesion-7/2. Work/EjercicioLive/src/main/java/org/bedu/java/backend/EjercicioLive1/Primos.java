package org.bedu.java.backend.EjercicioLive1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Primos implements CommandLineRunner {
	private static Logger logger = LoggerFactory.getLogger(Primos.class);

	@Override
	public void run(String... args) throws Exception {
		int numero = 2;

		if (!numeroPrimo(numero) && numero < 0){
			logger.error("El número: {} <-> es negativo", numero);
		} else if (numeroPrimo(numero)){
			logger.info("El número: {} <-> Es primo", numero);
		} else {
			logger.warn("El número: {} <-> no es primo", numero);
		}
	}

	private boolean numeroPrimo(int numero){
		if (numero < 0){
			return false;
		}

		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}

		for (int i = 2; i <= numero / 2; i++) {
			if (numero % i == 0)
				return false;
		}
		return true;
	}
}
