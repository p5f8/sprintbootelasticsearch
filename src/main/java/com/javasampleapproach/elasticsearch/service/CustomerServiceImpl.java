package com.javasampleapproach.elasticsearch.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.elasticsearch.model.Customer;
import com.javasampleapproach.elasticsearch.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	CustomerRepository repository;

	@Override
	public List<Customer> findByFirstname(String firstname) {
		return repository.findByFirstname(firstname);
	}

	@Override
	public List<Customer> findByFirstnameAndLastname(String firstname, String lastname) {
		return repository.findByFirstnameAndLastname(firstname, lastname);
	}

	@Override
	public void carga() {

		Customer cust_1 = new Customer("1", "Peter", "Smith", 20, getBirth(1979, 2, 10));
		Customer cust_2 = new Customer("2", "Mary", "Taylor", 25, getBirth(1981, 1, 31));
		Customer cust_3 = new Customer("3", "Peter", "Brown", 30, getBirth(1992, 7, 20));
		Customer cust_4 = new Customer("4", "Lauren", "Taylor", 20, getBirth(1960, 12, 13));
		Customer cust_5 = new Customer("5", "Lauren", "Jones", 45, getBirth(1977, 5, 6));
		Customer cust_6 = new Customer("6", "Peter", "Williams", 20, getBirth(200, 3, 2));

		// save customers to ElasticSearch
		logger.info("===================Save Customers===================");
		repository.save(cust_1);
		repository.save(cust_2);
		repository.save(cust_3);
		repository.save(cust_4);
		repository.save(cust_5);
		repository.save(cust_6);
	}

	private Date getBirth(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	@Override
	public List<Customer> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Customer> findByBirth(Date birth) {
		return repository.findByBirth(birth);
	}

	public void outrosMetodos() {
		//
		// // find a Customer by Id
		// System.out.println("===================Find a customer by id =
		// 5===================");
		// Customer cust_id_5 = customerRepository.findOne("5");
		// System.out.println(cust_id_5);
		//
		// // findAll
		// System.out.println("===================Find All===================");
		// Iterable<Customer> customers = customerRepository.findAll();
		// customers.forEach(System.out::println);
		//
		// // find customers by firstname = Peter
		// System.out.println("===================Find by firstname is
		// Peter===================");
		// List<Customer> cust_Peters = customerRepository.findByFirstname("Peter");
		// cust_Peters.forEach(System.out::println);
		//
		// // find a first page customers with size = 2
		// System.out.println("===================Find by firstname is Peter with
		// PageRequest(0, 2)================");
		// Page<Customer> page_Peters = customerRepository.findByFirstname("Peter", new
		// PageRequest(0, 2));
		// page_Peters.forEach(System.out::println);
		//
		// // find all customer having age = 20
		// System.out.println("===================Find by age = 20===================");
		// List<Customer> cust_age_20 = customerRepository.findByAge(20);
		// cust_age_20.forEach(System.out::println);
		//
		// // delete a customer having age = 20
		// System.out.println("===================Delete a Customer having age =
		// 20===================");
		// customerRepository.delete(cust_age_20.get(0));
		//
		// // again: find all customer with age = 20
		// // => result list with size = 2
		// System.out.println("===================Find by age = 20===================");
		// cust_age_20 = customerRepository.findByAge(20);
		// cust_age_20.forEach(System.out::println);

	}

}
