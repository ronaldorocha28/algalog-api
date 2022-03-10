package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setName("João");
		cliente1.setEmail("joao@gmail.com");
		cliente1.setPhone("99 9999-9999");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setName("Maria");
		cliente2.setEmail("maria@gmail.com");
		cliente2.setPhone("88 8888-8888");
		return Arrays.asList(cliente1, cliente2);
	}

}
