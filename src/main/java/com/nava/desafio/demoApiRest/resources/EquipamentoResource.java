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

import com.nava.desafio.demoApiRest.models.Equipamento;
import com.nava.desafio.demoApiRest.repository.EquipamentoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Equipamentos")
@CrossOrigin(origins = "*")
public class EquipamentoResource {
	
	@Autowired
	EquipamentoRepository equipamentoRepository;

	@GetMapping("/equipamento")
	@ApiOperation(value = "Retorna uma lista de Equipamentos")
	public List<Equipamento> find() {
		return equipamentoRepository.findAll();
	}

	@PostMapping("/equipamento")
	@ApiOperation(value = "Salva um Equipamento ")
	public Equipamento save(@RequestBody Equipamento equipamento) {
		return equipamentoRepository.save(equipamento);
	}

	@DeleteMapping("/equipamento")
	@ApiOperation(value = "Deleta um Equipamento")
	public void delete(@RequestBody Equipamento equipamento) {
		equipamentoRepository.delete(equipamento);
	}

	@PutMapping("/equipamento")
	@ApiOperation(value = "Atualiza um Equipamento")
	public Equipamento update(@RequestBody Equipamento equipamento) {
		return equipamentoRepository.save(equipamento);
	}	
}
