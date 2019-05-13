package com.poo.eventos;

import java.util.List;

import com.poo.interfaces.Acoes;

public class Teatro extends Eventos implements Acoes {
	
	private String patrocinador;

	public Teatro() {
	}

	public Teatro(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	public Teatro(String patrocinador, int id, String titulo, int lotacao, Endereco enderecos) {
		this.patrocinador = patrocinador;
		super.setId(id);
		super.setTitulo(titulo);
		super.setLotacao(lotacao);
		super.setEnderecos(enderecos);
		
	}
	
	//GETTERS AND SETTERS
	public String getPatrocinador() {
		return patrocinador;
	}

	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	//FINAL AÇÕES
	@Override
	public String cadastrar() {
		return null;
	}

	@Override
	public List<String> pesquisar(int id) {
		return null;
	}
	
	
	
	

}
