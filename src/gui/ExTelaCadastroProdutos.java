package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class ExTelaCadastroProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExTelaCadastroProdutos frame = new ExTelaCadastroProdutos();
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
	public ExTelaCadastroProdutos() {
		setTitle("Cadastro de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 346, 1019, 232);
		contentPane.add(scrollPane);
		
		String col[] = {"Código do Produto","Nome do Produto","Marca","Fornecedor","Data da Compra","Valor da Compra","Valor da Venda","Categoria","Descrição","Prateleira"};
		
		String dados[][] = {
				{"01","Mouse","Logitec","Logitec","04/12/2024","R$ 34,20","R$ 54,20","Informática","Mouse sem fio","A-03"}
				};

		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblCadastroProdutos = new JLabel("   Cadastro de Produtos");
		lblCadastroProdutos.setHorizontalAlignment(SwingConstants.LEFT);
		lblCadastroProdutos.setForeground(Color.MAGENTA);
		lblCadastroProdutos.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 40));
		lblCadastroProdutos.setBounds(0, 0, 743, 56);
		contentPane.add(lblCadastroProdutos);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 67, 779, 170);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do Produto");
		lblNewLabel_1.setBounds(10, 11, 90, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(110, 8, 252, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Código do Produto");
		lblNewLabel_2.setBounds(10, 42, 90, 14);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 39, 252, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Valor da Compra");
		lblNewLabel_3.setBounds(10, 70, 90, 14);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 67, 252, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Marca");
		lblNewLabel_4.setBounds(10, 100, 90, 14);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 97, 252, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Descrição");
		lblNewLabel_5.setBounds(10, 129, 90, 14);
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(110, 128, 252, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Data da Compra");
		lblNewLabel_6.setBounds(386, 11, 90, 14);
		panel.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(480, 8, 291, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Fornecedor");
		lblNewLabel_7.setBounds(386, 42, 90, 14);
		panel.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(480, 39, 291, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Valor da Venda");
		lblNewLabel_8.setBounds(386, 70, 90, 14);
		panel.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(480, 67, 291, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Categoria");
		lblNewLabel_9.setBounds(386, 100, 90, 14);
		panel.add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(480, 97, 291, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Prateleira");
		lblNewLabel_10.setBounds(386, 129, 90, 14);
		panel.add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(480, 126, 291, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(801, 67, 99, 110);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Quantidade");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(10, 11, 73, 14);
		panel_1.add(lblNewLabel_11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(10, 36, 79, 20);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBounds(10, 76, 39, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(49, 76, 40, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(910, 11, 119, 226);
		contentPane.add(panel_2);
		
		JButton btnNewButton_2 = new JButton("Novo");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(10, 248, 99, 38);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cadastrar");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(130, 248, 109, 38);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Limpar Campos");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4.setBounds(261, 248, 152, 38);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Limpar Tabela");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5.setBounds(434, 248, 139, 38);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Limpar Linha");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_6.setBounds(591, 248, 139, 38);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Salvar Alterações");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(750, 248, 161, 38);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Editar");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8.setBounds(930, 248, 99, 38);
		contentPane.add(btnNewButton_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 297, 99, 28);
		contentPane.add(comboBox);
		
		textField_11 = new JTextField();
		textField_11.setBounds(130, 297, 600, 28);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton_9 = new JButton("Pesquisar");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_9.setBounds(750, 297, 109, 28);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Recarregar Tabela");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_10.setBounds(877, 297, 152, 28);
		contentPane.add(btnNewButton_10);
	}
}
