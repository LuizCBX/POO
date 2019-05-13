package com.poo.heranca;

import java.io.FileWriter;
import java.io.IOException;

public class PessoaFisica extends Cliente{
	
	private String nome;
	private String cpf;
	private String rg;
	
	//gerar construtores
	public PessoaFisica() {
		//vazio
	}
	
	
	public PessoaFisica(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}


	public PessoaFisica(String nome, String cpf, String rg, int id, String email, String telefone, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		super.setId(id);
		super.setEmail(email);
		super.setEndereco(endereco);
		super.setTelefone(telefone);
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	//sobrescrevendo o método da classe pai
	@Override
	public void cadastrar() {
		
		FileWriter arquivo = null;

		//escritor de arquivos, precisa ser importado
		//----append = vai adicionando ao arquivo
		//----write = troca o conteudo (1 linha de dados)
		try {
			arquivo = new FileWriter("c:\\Luiz\\cadastro.txt"); // ------------ Alterar Para LuizEclipse
			arquivo.append(this.nome);
			arquivo.append(this.getEmail());
			arquivo.append(this.getTelefone());
			arquivo.append(this.getEndereco());
			arquivo.append(this.cpf);
			arquivo.append(this.rg);
			arquivo.append("---------------------");
			
			
		//se der erro entra no cath	
		} catch (IOException e) {
			//Caso haja algum erro, será impresso na tela de console
			//uma Impressão da pilha inteira de erros
			e.printStackTrace();
			//FIFO - First in, First out (FILA)
			//LIFO - Lest in, Lest out (PILHA)
		}
		//finalizador do try catch e fecha e ele se torna fisico
		finally {
			try {
				arquivo.close();
			}
			catch(Exception e) { e.printStackTrace();}
		}
		
		
	}
}

