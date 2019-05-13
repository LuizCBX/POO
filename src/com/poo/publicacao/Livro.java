package com.poo.publicacao;

import java.util.List;

import com.poo.interfaces.Acoes;

public class Livro extends Publicacao implements Acoes{
	
	private String genero;
	private String isbn;//numero de identificação do livro 
	
	
	//Gerando construtores
	//sem marcar
	public Livro() {
	}

	//marcar
	public Livro(String genero, String isbn) {
		this.genero = genero;
		this.isbn = isbn;
	}
	
	
	public Livro(String genero, String isbn, int id, String titulo, String editora, int paginas, List<Autor> autores) {
		this.genero = genero;
		this.isbn = isbn;
		//super classe porque está na classe máxima PAI
		super.setId(id);
		super.setTitulo(titulo);
		super.setEditora(editora);
		super.setPaginas(paginas);
		super.setAutores(autores);
	}

	//GERANDO GETTERS E SETTERS
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
