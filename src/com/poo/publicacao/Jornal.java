package com.poo.publicacao;

import java.util.List;

import com.poo.interfaces.Acoes;

public class Jornal extends Publicacao implements Acoes  {
		
	private String caderno;

	//Não marcar
	public Jornal() {
	}
	
	//MARCAR
	public Jornal(String caderno) {
		this.caderno = caderno;
	}
	
	//MARCAR == COMPLETO
	public Jornal(String caderno, int id, String titulo, String editora, int paginas, List<Autor> autores) {
	
		this.caderno = caderno;
		//super classe porque está na classe máxima PAI
		super.setId(id);
		super.setTitulo(titulo);
		super.setEditora(editora);
		super.setPaginas(paginas);
		super.setAutores(autores); 
		
	}

	//GETTERS AND SETTERS
	public String getCaderno() {
		return caderno;
	}

	public void setCaderno(String caderno) {
		this.caderno = caderno;
	}

	//
	@Override
	public String cadastrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> pesquisar(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}