package com.poo.heranca;

//extenção da classe cliente... a classe pai
public class PessoaJuridica extends Cliente {
	
	//--- private --- == encapsula 
	private String razaoSocial;
	private String cnpj;
	private String nomeFantasia;
	
	//--- gerar construtores
	public PessoaJuridica() {
	}

	public PessoaJuridica(String razaoSocial, String cnpj, String nomeFantasia) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public PessoaJuridica(String razaoSocial, String cnpj, String nomeFantasia, int id, String email, String telefone, String endereco) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		//--- agora vamos vincular 
		super.setId(id);
		super.setEmail(email);
		super.setTelefone(telefone);
		super.setEndereco(endereco);
	}

	
	//--- gerar GET e SETTERS
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	@Override
	public void cadastrar() {
		System.out.println("Os dados da empresa foram cadastrados!");
	}
	
	

}
