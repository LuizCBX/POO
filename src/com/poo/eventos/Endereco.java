package com.poo.eventos;

//ENDEREÇO é uma classe dentro de eventos
public class Endereco {
	
	private String logradouro;
	private String cep;
	private String bairro;
	
	//CONSTRUTORES
	public Endereco() {
	}

	public Endereco(String logradouro, String cep, String bairro) {
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
	}

	//GETTERS AND SETTER
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
	
	

}
