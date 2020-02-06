package com.cadastro.cliente.api.repository;

import com.cadastro.cliente.api.models.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
