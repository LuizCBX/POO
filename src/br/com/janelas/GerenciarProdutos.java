package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos  extends JFrame{

	
	//Elementos para a categoria
	static JLabel lblIdCat = new JLabel("Id Categoria: ");
	static JLabel lblNomeCat = new JLabel("Nome Categoria:");
	static JLabel lblDescCat = new JLabel("Descrição: ");
	
	static JTextField txtIdCat = new JTextField();
	static JTextField txtNomeCat = new JTextField();
	static JTextField txtDescCat =  new JTextField();
	
	static JButton btnCadCat = new JButton("Cadastrar Categoria");
	
	//Elementos para o fornecedor
	static JLabel lblIdFor = new JLabel("Id Fornecedor: ");
	static JLabel lblRS = new JLabel("Razão Social: ");
	static JLabel lblCnpj = new JLabel("CNPJ: ");
	
	static JTextField txtIdFor = new JTextField();
	static JTextField txtRS = new JTextField();
	static JTextField txtCnpj = new JTextField();
	
	static JButton btnCadFor = new JButton("Cadastrar fornecedor");
	
	//Elementos para produto
	static JLabel lblIdPr = new JLabel("Id Produto: ");
	static JLabel lblNomePr = new JLabel("Nome do produto: ");
	static JLabel lblDescPr = new JLabel("Descrição produto: ");
	static JLabel lblCategoria = new JLabel("Selecione uma categoria: ");
	static JLabel lblFornecedor = new JLabel("Selecione um fornecedor: ");
	static JLabel lblPrecoPr = new JLabel("Preço do produto: ");
	
	static JTextField txtIdPr = new JTextField();
	static JTextField txtNomePr = new JTextField();
	static JTextField txtDescPr = new JTextField();
	static JTextField txtCategoria = new JTextField();
	static JTextField txtFornecedor = new JTextField();
	static 	JTextField txtPrecoPr = new JTextField();
	
	static 	JButton btnCadPr = new JButton("Cadastrar Produto");
	
	public static void main(String[] args) {
		JFrame gerenciar = new JFrame();
		gerenciar.setTitle("Gerenciar Produtos");
		gerenciar.setSize(600,600);
		gerenciar.setLocationRelativeTo(null);//deixa no centro da tela
		gerenciar.setDefaultCloseOperation(EXIT_ON_CLOSE);//Fecha o processo da janela
		gerenciar.setResizable(false);//Não deixar o usuario redimensionar a janela, fica no mesmo tamanho
		
		//Definir o gerenciamento do layout como absoluto, ou seja nulo
		gerenciar.getContentPane().setLayout(null);
		
		//Categoria
		lblIdCat.setBounds(10,10,150,30);
		gerenciar.add(lblIdCat);
		
		txtIdCat.setBounds(10,45,100,30);
		gerenciar.add(txtIdCat);
		
		lblNomeCat.setBounds(10,75,150,30);
		gerenciar.add(lblNomeCat);
		
		txtNomeCat.setBounds(10,110,160,30);
		gerenciar.add(txtNomeCat);
		
		lblDescCat.setBounds(10, 145, 150, 30);
		gerenciar.add(lblDescCat);
		
		txtDescCat.setBounds(10,175,160,30);
		gerenciar.add(txtDescCat);
		
		btnCadCat.setBounds(10, 210, 160, 30);
		gerenciar.add(btnCadCat);
		
		//Fornecedor
		lblIdFor.setBounds(10, 260, 100, 30);
		gerenciar.add(lblIdFor);
		
		txtIdFor.setBounds(10, 295, 100, 30);
		gerenciar.add(txtIdFor);
		
		lblRS.setBounds(10,330,150,30);
		gerenciar.add(lblRS);
		
		txtRS.setBounds(10, 365, 160, 30);
		gerenciar.add(txtRS);
		
		lblCnpj.setBounds(10,400,150,30);
		gerenciar.add(lblCnpj);
		
		txtCnpj.setBounds(10, 435, 160, 30);
		gerenciar.add(txtCnpj);
		
		btnCadFor.setBounds(10, 470, 160, 30);
		gerenciar.add(btnCadFor);
		
		//Produto
		
		lblIdPr.setBounds(300, 10, 150, 30);
		gerenciar.add(lblIdPr);
		
		txtIdPr.setBounds(300, 45, 100, 30);
		gerenciar.add(txtIdPr);
		
		lblNomePr.setBounds(300, 75, 150, 30);
		gerenciar.add(lblNomePr);
		
		txtNomePr.setBounds(300, 110, 160, 30);
		gerenciar.add(txtNomePr);
		
		lblDescPr.setBounds(300, 145, 150, 30);
		gerenciar.add(lblDescPr);
		
		txtDescPr.setBounds(300, 175, 160, 30);
		gerenciar.add(txtDescPr);
		
		lblCategoria.setBounds(300, 210, 150, 30);
		gerenciar.add(lblCategoria);
		
		txtCategoria.setBounds(300, 245, 240, 80);
		gerenciar.add(txtCategoria);
	
		lblFornecedor.setBounds(300, 330, 150, 30);
		gerenciar.add(lblFornecedor);
		
		txtFornecedor.setBounds(300, 365, 160, 30);
		gerenciar.add(txtFornecedor);
		
		lblPrecoPr.setBounds(300, 400, 150, 30);
		gerenciar.add(lblPrecoPr);
		
		txtPrecoPr.setBounds(300, 435, 160, 30);
		gerenciar.add(txtPrecoPr);
		
		btnCadPr.setBounds(300, 470, 160, 30);
		gerenciar.add(btnCadPr);
		
		
		//#################### Desabilitar os controles textfield do 
		//#################### fornecedor e produtos
		//####################
		
		txtIdFor.setEnabled(false);
		txtRS.setEnabled(false);
		txtCnpj.setEnabled(false);
		btnCadFor.setEnabled(false);
		
		txtIdPr.setEnabled(false);
		txtNomePr.setEnabled(false);
		txtDescPr.setEnabled(false);
		txtFornecedor.setEnabled(false);
		txtCategoria.setEnabled(false);
		txtPrecoPr.setEnabled(false);
		btnCadPr.setEnabled(false);
		
		//--------- Vamos criar o objeto categoria e
		//--------- Passar os dados do formulario para
		//--------- o objeto criado
		Categoria cat = new Categoria();
		
		//--- vamos fazer a passagem dos dados par ao objeto
		//--- no momento em clicarmos no botão de cadastro
		btnCadCat.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				cat.setId(Integer.parseInt(txtIdCat.getText()));
				cat.setNome(txtNomeCat.getText());
				cat.setDescricao(txtDescCat.getText());
				
				
				//---desabilitar as caixas da categoria
				txtIdCat.setEnabled(false);
				txtNomeCat.setEnabled(false);
				txtDescCat.setEnabled(false);
				btnCadCat.setEnabled(false);
				//---habilitar as caixas do fornecedor
				txtIdFor.setEnabled(true);
				txtRS.setEnabled(true);
				txtCnpj.setEnabled(true);
				btnCadFor.setEnabled(true);
			}
		});
		
		
		//--- Vamos instaciar a classe fornecedor e passar
		//--- os dados para o objeto no momento em que
		//--- o botão de cadastro for clicado
		Fornecedor f  = new Fornecedor();
		
		btnCadFor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setId(Integer.parseInt(txtIdFor.getText()));
				f.setRazaoSocial(txtRS.getText());
				f.setCnpj(txtCnpj.getText());
				//--- Desabilitar fornecedor
				txtIdFor.setEnabled(false);
				txtRS.setEnabled(false);
				txtCnpj.setEnabled(false);
				btnCadFor.setEnabled(false);
				
				//---habilitar os controles do produto
				txtIdPr.setEnabled(true);
				txtNomePr.setEnabled(true);
				txtDescPr.setEnabled(true);
				txtFornecedor.setEnabled(true);
				txtCategoria.setEnabled(true);
				txtPrecoPr.setEnabled(true);
				btnCadPr.setEnabled(true);
			}
		});
		
		
		//--- Vamos criar um objeto baseado em
		//-- produtos para passar os dados no momento no clique
		//--- botão cadastro
		
		Produto pr = new Produto();
		btnCadPr.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				pr.setId(Integer.parseInt(txtIdPr.getText()));
				pr.setNome(txtNomePr.getText());
				pr.setDescricao(txtDescPr.getText());
				pr.setCategoria(cat);
				pr.setFornecedor(f);
				pr.setPreco(Double.parseDouble(txtPrecoPr.getText()));
				
				//----Desabilitar os controles do produto
				txtIdPr.setEnabled(false);
				txtNomePr.setEnabled(false);
				txtDescPr.setEnabled(false);
				txtFornecedor.setEnabled(false);
				txtCategoria.setEnabled(false);
				txtPrecoPr.setEnabled(false);
				btnCadPr.setEnabled(false);
				
				//---Caixa de confirmação
				JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!!!");
				
				//Habilitar categorias
				txtIdCat.setEnabled(true);
				txtNomeCat.setEnabled(true);
				txtDescCat.setEnabled(true);
				btnCadCat.setEnabled(true);
			}
		});
		
		
		
		
		gerenciar.setVisible(true);

	}

}
