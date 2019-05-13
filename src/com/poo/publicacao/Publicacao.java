package com.poo.publicacao;

import java.util.List;

//Se for abstract. Não pode se tornar um objeto
// Não tem metodo construtor
public abstract class Publicacao {
	
	//Estar presente em todas classes filho
	private int id;
	private String titulo;
	private String editora;
	private int paginas;
	
	
	// para a coleção de autores
	//GETTERS and SETTERS(Marcar)
	private List<Autor> autores;
	
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	
	//GET e SETTERS (Selecionar todos para criar)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
}
