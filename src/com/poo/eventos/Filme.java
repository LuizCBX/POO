package com.poo.eventos;

import java.util.List;

import com.poo.interfaces.Acoes;

public class Filme extends Eventos implements Acoes {
	
	private String sessao;

	public Filme() {
	}

	public Filme(String sessao) {
		this.sessao = sessao;
	}

	public Filme(String sessao, int id, String titulo, int lotacao, Endereco enderecos) {
		this.sessao = sessao;
		super.setId(id);
		super.setTitulo(titulo);
		super.setLotacao(lotacao);
		super.setEnderecos(enderecos);
	}
	
	//GETTERS E SETTERS
	public String getSessao() {
		return sessao;
	}

	public void setSessao(String sessao) {
		this.sessao = sessao;
	}

	//AÇÕES
	@Override
	public String cadastrar() {
		return null;
	}

	@Override
	public List<String> pesquisar(int id) {
		return null;
	}
	
	

}
