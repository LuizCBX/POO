package br.com.usarclasses;

import br.com.classes.Usuario;

public class GerenciarUsuario {

	public static void main(String[] args) {
		
		Usuario us = new Usuario();
		//Instância / Construtor
		us.login = "adm";
		us.senha = "1223";
		//us.cadastrar();
		//us.logar();
		us.logout();
	}

}
