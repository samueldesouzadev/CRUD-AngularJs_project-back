package com.cadastro.cliente.api.controller;

import java.util.List;

import com.cadastro.cliente.api.mapping.UriMappingConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.cliente.api.models.Contato;
import com.cadastro.cliente.api.repository.ContatoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@Api(value = "API REST Contatos")
@RequestMapping(value = UriMappingConstants.Controller.CONTATO)
public class ContatoController {

    @Autowired
    ContatoRepository repository;

    @GetMapping(UriMappingConstants.Standard.FINDALL)
    @ApiOperation(value = "Retorna uma lista de Contatos")
    public List<Contato> findAll() {
        return repository.findAll();
    }

    @PostMapping(UriMappingConstants.Standard.SAVE)
    @ApiOperation(value = "Salva um Contato ")
    public Contato save(@RequestBody Contato contato) {
        return repository.save(contato);
    }

    @DeleteMapping(UriMappingConstants.Standard.DELETE)
    @ApiOperation(value = "Deleta um Contato")
    public void delete(@RequestBody Contato contato) {
        repository.delete(contato);
    }

    @PutMapping(UriMappingConstants.Standard.EDIT)
    @ApiOperation(value = "Atualiza um Contato")
    public Contato edit(@RequestBody Contato contato) {
        return repository.save(contato);
    }

}
