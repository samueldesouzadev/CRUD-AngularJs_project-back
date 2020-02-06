package com.cadastro.cliente.api.controller;

import java.util.List;
import java.util.Optional;

import com.cadastro.cliente.api.models.Cliente;
import com.cadastro.cliente.api.mapping.UriMappingConstants;
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

import com.cadastro.cliente.api.repository.ClienteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@Api(value = "API REST")
@RequestMapping(value = UriMappingConstants.Controller.API)
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @ApiOperation(value = "Lista Clientes")
    @GetMapping(UriMappingConstants.Cliente.FINDALL)
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @ApiOperation(value = "Salva Cliente")
    @PostMapping(UriMappingConstants.Cliente.SAVE)
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @ApiOperation(value = "Atualiza Cliente")
    @PutMapping(UriMappingConstants.Cliente.EDIT)
    public Cliente update(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @ApiOperation(value = "Deleta Cliente")
    @DeleteMapping(UriMappingConstants.Cliente.DELETE)
    public void delete(@PathVariable(value = "id") Long id) {
        clienteRepository.deleteById(id);
    }

    @ApiOperation(value = "Retorna um cliente unico")
    @GetMapping(UriMappingConstants.Cliente.FINDBYID)
    public Optional<Cliente> findByIdClientes(@PathVariable(value = "id") Long id) {
        return clienteRepository.findById(id);
    }

    @ApiOperation(value = "Retorna lista de clientes (Buscando pelo Nome)")
    @GetMapping(UriMappingConstants.Cliente.FINDBYNAME)
    public List<Cliente> findByNome(@PathVariable(value = "nome") String nome) {
        return clienteRepository.findByNomeContaining(nome);
    }

}
