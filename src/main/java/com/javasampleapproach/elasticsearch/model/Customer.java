package com.javasampleapproach.elasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "customer", type = "_doc")
public class Customer {

	@Id
	private String id;
	
	private String firstname;
	private String lastname;
	private int age;
	
	public Customer(){
	}
	
	public Customer(String id, String firstname, String lastname, int age){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	
	public String getFirstname(){
		return this.firstname;
	}
	
	public void setLastname(String lastname){
		this.lastname = lastname;
	}
	
	public String getLastname(){
		return this.lastname;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String toString(){
		String info = String.format("Customer Info: id = %s, firstname = %s, lastname = %s, age = %d", id, firstname, lastname, age);
		return info;
	}
	
}
