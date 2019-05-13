package com.poo.publicacao;

import java.util.List;

import com.poo.interfaces.Acoes;

public class Revista extends Publicacao implements Acoes {

	private String edicao;

	//sem marcar
	public Revista() {
	}

	//marca
	public Revista(String edicao) {
		this.edicao = edicao;
	}

	//marcar e adicionar super
	public Revista(String edicao, int id, String titulo, String editora, int paginas, List<Autor> autores) {
		
		this.edicao = edicao;
		//super classe porque está na classe máxima PAI
		super.setId(id);
		super.setTitulo(titulo);
		super.setEditora(editora);
		super.setPaginas(paginas);
		super.setAutores(autores);
		
	}

	//GETTERS AND SETTERS
	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

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
