package com.nava.desafio.demoApiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nava.desafio.demoApiRest.models.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
