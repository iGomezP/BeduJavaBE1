package org.bedu.java.backend.Ejemplo1.controller;

import org.bedu.java.backend.Ejemplo1.model.Cliente;
import org.bedu.java.backend.Ejemplo1.persistence.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	private final IClienteRepository iClienteRepository;

	@Autowired
	public ClienteController(IClienteRepository iClienteRepository){
		this.iClienteRepository = iClienteRepository;
	}

	// Crea un método POST que reciba un objeto Cliente como parámetro y regrese un código de respuesta 201
	/*@PostMapping
	public ResponseEntity<Void> creaCliente(@RequestBody Cliente cliente){
		return ResponseEntity.created(URI.create("")).build();
	}*/

	// Dentro del método creaCliente usa el objeto clienteRepository para guardar el objeto cliente en base de datos.
	// Usa el id del objeto almacenado para regresarlo en la respuesta del método.
	@PostMapping
	public ResponseEntity<Void> creaCliente(@RequestBody Cliente cliente){
		Cliente clienteDB = iClienteRepository.save(cliente);

		return ResponseEntity.created(URI.create(clienteDB.getId().toString())).build();
	}
}
