package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.heranca.PessoaJuridica;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarJuridica extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtRazaoSocial;
	private JTextField txtCnpj;
	private JTextField txtNomeFantasia;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarJuridica frame = new CadastrarJuridica();
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
	public CadastrarJuridica() {
		setTitle("Pessoa Juridica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(47, 37, 48, 14);
		contentPane.add(lblId);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social:");
		lblRazoSocial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRazoSocial.setBounds(29, 68, 66, 14);
		contentPane.add(lblRazoSocial);
		
		JLabel lblCnpj = new JLabel("Cnpj:");
		lblCnpj.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCnpj.setBounds(47, 96, 48, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia:");
		lblNomeFantasia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomeFantasia.setBounds(10, 121, 85, 14);
		contentPane.add(lblNomeFantasia);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(47, 153, 48, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(47, 178, 48, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereco.setBounds(29, 211, 66, 14);
		contentPane.add(lblEndereco);
		
		txtId = new JTextField();
		txtId.setBounds(129, 34, 96, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtRazaoSocial = new JTextField();
		txtRazaoSocial.setBounds(129, 65, 96, 20);
		contentPane.add(txtRazaoSocial);
		txtRazaoSocial.setColumns(10);
		
		txtCnpj = new JTextField();
		txtCnpj.setText("");
		txtCnpj.setBounds(129, 93, 96, 20);
		contentPane.add(txtCnpj);
		txtCnpj.setColumns(10);
		
		txtNomeFantasia = new JTextField();
		txtNomeFantasia.setText("");
		txtNomeFantasia.setBounds(129, 118, 96, 20);
		contentPane.add(txtNomeFantasia);
		txtNomeFantasia.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("");
		txtEmail.setBounds(129, 150, 96, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setText("");
		txtTelefone.setBounds(129, 175, 96, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setText("");
		txtEndereco.setBounds(129, 208, 96, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		PessoaJuridica pj = new PessoaJuridica();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				pj.cadastrar();
				
			}
			
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCadastrar.setBounds(261, 96, 163, 68);
		contentPane.add(btnCadastrar);
	}

}
