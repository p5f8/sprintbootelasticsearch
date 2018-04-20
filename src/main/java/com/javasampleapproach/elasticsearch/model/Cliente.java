package com.javasampleapproach.elasticsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "cliente", type = "_doc")
public class Cliente {

	@Id
	private String id;

	@JsonProperty("nome_completo")
	private String nomeCompleto;
	
	@JsonProperty("endereco_com_numero")
	private String enderecoComNumero;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEnderecoComNumero() {
		return enderecoComNumero;
	}

	public void setEnderecoComNumero(String enderecoComNumero) {
		this.enderecoComNumero = enderecoComNumero;
	}
	
	
}
