package com.nava.desafio.demoApiRest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nava.desafio.demoApiRest.models.Cliente;
import com.nava.desafio.demoApiRest.repository.ClienteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Clientes")
@CrossOrigin(origins = "*")
public class ClienteResource {

	@Autowired
	ClienteRepository clienteRepository;

	@GetMapping("/cliente")
	@ApiOperation(value = "Retorna uma lista de clientes")
	public List<Cliente> find() {
		return clienteRepository.findAll();
	}

	@PostMapping("/cliente")
	@ApiOperation(value = "Salva um cliente ")
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@DeleteMapping("/cliente/{id}")
	@ApiOperation(value = "Deleta um cliente")
	public void delete(@PathVariable(value = "id") Long id){
        clienteRepository.deleteById(id);
    }

	@PutMapping("/cliente")
	@ApiOperation(value = "Atualiza um cliente")
	public Cliente update(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@GetMapping("/findById/{id}")
	@ApiOperation(value = "Retorna um cliente unico")
	public Optional<Cliente> findByIdClientes(@PathVariable(value = "id") Long id) {
		return clienteRepository.findById(id);
	}

	@GetMapping("/findByNome/{nome}")
	@ApiOperation(value = "Retorna lista de clientes (Buscando pelo Nome)")
	public List<Cliente> findByNome(@PathVariable(value = "nome") String nome) {
		return clienteRepository.findByNomeContaining(nome);
	}

}
