package com.nava.desafio.demoApiRest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.nava.desafio.demoApiRest.models.Cliente;
import com.nava.desafio.demoApiRest.repository.ClienteRepository;

@SpringBootApplication
public class DemoApiRestApplication {

	public static void main(String[] args) {		
		SpringApplication.run(DemoApiRestApplication.class, args);
	}

}
