package com.javasampleapproach.elasticsearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.javasampleapproach.elasticsearch.model.Cliente;

@Repository
public interface ClienteRepository extends ElasticsearchRepository<Cliente, String> {
	
	List<Cliente> findByNomeCompleto(String nomeCompleto);
	
}