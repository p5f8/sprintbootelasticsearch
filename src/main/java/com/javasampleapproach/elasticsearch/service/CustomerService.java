package com.javasampleapproach.elasticsearch.service;

import java.util.List;

import com.javasampleapproach.elasticsearch.model.Customer;

public interface CustomerService {
	
	List<Customer> findByFirstname(String firstname);

	void carga();
	
	List<Customer> findByFirstnameAndLastname(String firstname, String lastname);
	
}