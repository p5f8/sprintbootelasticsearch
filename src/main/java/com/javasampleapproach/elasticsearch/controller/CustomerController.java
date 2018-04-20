package com.javasampleapproach.elasticsearch.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.elasticsearch.model.Customer;
import com.javasampleapproach.elasticsearch.service.CustomerService;

@RestController
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	CustomerService service;

	@RequestMapping("/busca/{nome}")
	public List<Customer> buscaNome(@PathVariable("nome") String nome) {
		logger.info("BuscaNome: [" + nome + "]");
		return service.findByFirstname(nome);
	}

	@RequestMapping("/busca/{nome}/{sobrenome}")
	public List<Customer> buscaNomeEndereco(@PathVariable("nome") String nome,
			@PathVariable("sobrenome") String sobrenome) {
		logger.info("BuscaNomeEndereco: [" + nome + ", " + sobrenome + "]");
		return service.findByFirstnameAndLastname(nome, sobrenome);
	}

	@RequestMapping("/loaddata")
	public void carga() {
		logger.info("loaddata");
		service.carga();
	}

}