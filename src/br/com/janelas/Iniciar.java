package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class Iniciar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Iniciar frame = new Iniciar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Iniciar() {
		setTitle("Gerenciar Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPessoaFisica = new JButton("Pessoa F\u00EDsica");
		btnPessoaFisica.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPessoaFisica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				cadastrarFisica jpf = new cadastrarFisica();
				jpf.setVisible(true);
			}
		});
		btnPessoaFisica.setBounds(59, 99, 136, 23);
		contentPane.add(btnPessoaFisica);
		
		JButton btnNewButton = new JButton("Pessoa Juridica");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastrarJuridica jpj = new CadastrarJuridica();
				jpj.setVisible(true);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(243, 99, 146, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblSelecioneUmaDas = new JLabel("Selecione uma das op\u00E7\u00F5es");
		lblSelecioneUmaDas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSelecioneUmaDas.setBounds(102, 57, 247, 26);
		contentPane.add(lblSelecioneUmaDas);
	}
}
