package com.cadastro.cliente.api.repository;

import java.util.List;

import com.cadastro.cliente.api.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNomeContaining(String nome);

}
