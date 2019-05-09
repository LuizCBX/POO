package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.classes.Usuario;

public class GerenciarUsuarios extends JFrame{

	public static void main(String[] args) {
		
		//Inst�ncia da classe JFrame
		JFrame janela = new JFrame();
		janela.setSize(505,400);//definir tamanho da janela
		janela.setTitle("Gerenciar Usu�rios");//titulo
		janela.setLocationRelativeTo(null);//alinha a janela ao centro da tela
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE); //for�ar saida, retira memoria quando clica no bot�o fechar
		
		//impede que a janela seja redimensionada
		janela.setResizable(false);
		
		//Vamos configurar o gerenciar de layout do java
		//usaremos o gerenciar null(nulo. Isso far� com que
		//o gerenciador seja encarado como absolute(absoluto)
		janela.getContentPane().setLayout(null);
		
		//Agora podemos criar nosso componentes e posicion�-los 
		//da maneira que quisermos
		JButton btnCadastrar = new JButton("Cadastrar");//Cria��o do bot�o, precisa importar o pacote.
		
		/*
		 * O fato de voc� ter configurado o gerenciador de layout
		 * como null(absolute) lhe permite posicionar os elementos 
		 *(componentes) em qualquer parte da tela usando coorenadas:
		 * x -> posi��o horizontal
		 * y -> posi��o vertical
		 * width -> largura
		 * heigth -> altura
		 */
		btnCadastrar.setBounds(10, 300, 150, 30);
		//para adicionar o bot�o a janela iremos usar
		//o comando add e passsar como par�metro o componente
		//que neste caso � o btnCadastrar
		janela.add(btnCadastrar); //Adicionando o bot�o 
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setBounds(170, 300, 150, 30);
		janela.add(btnLogar);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(330, 300, 150, 30);
		janela.add(btnLogout);
		
		
		//Vamos inserir as labels a janela
		JLabel lblLogin =  new JLabel("Login: ");
		lblLogin.setBounds(10,50,100,30);
		janela.add(lblLogin);
		
		//Vamos inserir as TextFields a janela
		JTextField txtLogin = new JTextField();
		txtLogin.setBounds(120, 50, 330, 30);
		janela.add(txtLogin);
		
		//Senha	= JLabel
		JLabel lblSenha = new JLabel ("Senha: ");
		lblSenha.setBounds(10, 90, 100, 30);
		janela.add(lblSenha);
		
		//Senha = JPasswordField
		JPasswordField txtSenha = new JPasswordField();
		txtSenha.setBounds(120, 90, 330,30);
		janela.add(txtSenha);
		
		
		//Resultado
		JTextField txtResult = new JTextField();
		txtResult.setEditable(false); //Desabilita inserir algo
		txtResult.setBounds(120, 130, 330, 160);
		janela.add(txtResult);		
		
		
		/*
		 * Vamos adicionar a a��o de clique ao bot�o cadastrar e realizar
		 * a chamada do m�todo cadastrar que est� na classe usuario
		 */
		
		
		Usuario us = new Usuario();
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				us.login = txtLogin.getText();//Pegar o que foi escrito na caixa do login
				us.senha = txtSenha.getText();//Pegar o que fpo escrito na caixa da senha
				txtResult.setText(us.cadastrar());
				
			}
		});
		
		btnLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				us.login = txtLogin.getText();//Pegar o que foi escrito na caixa do login
				us.senha = txtSenha.getText();//Pegar o que fpo escrito na caixa da senha
				txtResult.setText(us.logar());
			}
		});
		
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txtResult.setText(us.logout());
			}
		});
		
		
		
		janela.setVisible(true);//Mostrar depois que cria tudo
		
	}

}
