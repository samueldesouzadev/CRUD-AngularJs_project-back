package com.nava.desafio.demoApiRest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nava.desafio.demoApiRest.models.Contato;
import com.nava.desafio.demoApiRest.repository.ContatoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Contatos")
@CrossOrigin(origins = "*")
public class ContatoResource {

	@Autowired
	ContatoRepository contatoRepository;

	@GetMapping("/contato")
	@ApiOperation(value = "Retorna uma lista de Contatos")
	public List<Contato> find() {
		return contatoRepository.findAll();
	}

	@PostMapping("/contato")
	@ApiOperation(value = "Salva um Contato ")
	public Contato save(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}

	@DeleteMapping("/contato")
	@ApiOperation(value = "Deleta um Contato")
	public void delete(@RequestBody Contato contato) {
		contatoRepository.delete(contato);
	}

	@PutMapping("/contato")
	@ApiOperation(value = "Atualiza um Contato")
	public Contato update(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}

}
