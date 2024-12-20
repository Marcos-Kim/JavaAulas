package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.Aluno;
import classes.Aulas;
import classes.Curso;
import classes.Professor;
import classes.Sala;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class TelaAulas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTituloCurso;
	private JTextField txtArea;
	private JTextField txtCargaHoraria;
	private JTextField txtPreco;
	private JTextField txtIdentificacao;
	private JTextField txtDescricao;
	private JTextField txtNomeProfessor;
	private JTextField txtEmailProfessor;
	private JTextField txtCPFProfessor;
	private JTextField txtNomeAluno;
	private JTextField txtEmailAluno;
	private JTextField txtCPFAluno;
	private JTextField txtIdadeAluno;
	private JTextField txtIdAula;
	private JTextField txtCurso;
	private JTextField txtProfessor;
	private JTextField txtInicio;
	private JTextField txtTermino;
	private JTextField txtSala;
	
	//Declaração dos itens para criar uma aula.
	
	private Curso curso;
	private Aluno aluno;
	private Sala sala;
	private Professor professor;
	private Aulas aulas;
	private List<Aluno> listaAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAulas frame = new TelaAulas();
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
	public TelaAulas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\marcos.skim\\Downloads\\Benno-Meyer-Benno-System-Director-2.32.png"));
		
		//Vamos instanciar as nossas classes para gerar objetos dos itens relacionados à aula.
		//Esses objetos estão vazios e serão preenchidos quando o usuário clicar nos botões de incluir
		curso = new Curso();
		listaAluno = new ArrayList<Aluno>();
		sala = new Sala();
		professor = new Professor();
		aulas = new Aulas();
		
		setResizable(false);
		setTitle("Cadastro de Aulas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_curso = new JPanel();
		panel_curso.setBackground(Color.WHITE);
		panel_curso.setBounds(10, 11, 805, 90);
		contentPane.add(panel_curso);
		panel_curso.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo do Curso:");
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 149, 14);
		panel_curso.add(lblNewLabel);
		
		txtTituloCurso = new JTextField();
		txtTituloCurso.setBounds(140, 9, 322, 20);
		panel_curso.add(txtTituloCurso);
		txtTituloCurso.setColumns(10);
		
		JLabel lblrea = new JLabel("Área:");
		lblrea.setForeground(Color.DARK_GRAY);
		lblrea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblrea.setBackground(SystemColor.activeCaption);
		lblrea.setBounds(472, 12, 66, 14);
		panel_curso.add(lblrea);
		
		txtArea = new JTextField();
		txtArea.setBounds(548, 9, 247, 20);
		panel_curso.add(txtArea);
		txtArea.setColumns(10);
		
		JLabel lblCargaHorria = new JLabel("Carga Horária:");
		lblCargaHorria.setForeground(Color.DARK_GRAY);
		lblCargaHorria.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCargaHorria.setBackground(SystemColor.activeCaption);
		lblCargaHorria.setBounds(10, 44, 149, 14);
		panel_curso.add(lblCargaHorria);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(140, 42, 208, 20);
		panel_curso.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		JLabel lblCargaHorria_1 = new JLabel("Preço do curso");
		lblCargaHorria_1.setForeground(Color.DARK_GRAY);
		lblCargaHorria_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCargaHorria_1.setBackground(SystemColor.activeCaption);
		lblCargaHorria_1.setBounds(371, 44, 149, 14);
		panel_curso.add(lblCargaHorria_1);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(472, 42, 323, 20);
		panel_curso.add(txtPreco);
		
		JPanel panel_sala = new JPanel();
		panel_sala.setBackground(new Color(255, 255, 255));
		panel_sala.setBounds(10, 107, 805, 64);
		contentPane.add(panel_sala);
		panel_sala.setLayout(null);
		
		JLabel lblIdentificao = new JLabel("Identificação:");
		lblIdentificao.setForeground(Color.DARK_GRAY);
		lblIdentificao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdentificao.setBackground(SystemColor.activeCaption);
		lblIdentificao.setBounds(10, 23, 149, 14);
		panel_sala.add(lblIdentificao);
		
		txtIdentificacao = new JTextField();
		txtIdentificacao.setBounds(120, 21, 124, 20);
		panel_sala.add(txtIdentificacao);
		txtIdentificacao.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(328, 23, 467, 20);
		panel_sala.add(txtDescricao);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setForeground(Color.DARK_GRAY);
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescrio.setBackground(SystemColor.activeCaption);
		lblDescrio.setBounds(254, 23, 149, 14);
		panel_sala.add(lblDescrio);
		
		JPanel panel_Professor = new JPanel();
		panel_Professor.setBackground(new Color(255, 255, 255));
		panel_Professor.setBounds(10, 179, 805, 76);
		contentPane.add(panel_Professor);
		panel_Professor.setLayout(null);
		
		JLabel lblNomeDoProfessor = new JLabel("Nome do Professor");
		lblNomeDoProfessor.setForeground(Color.DARK_GRAY);
		lblNomeDoProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoProfessor.setBackground(SystemColor.activeCaption);
		lblNomeDoProfessor.setBounds(10, 13, 149, 14);
		panel_Professor.add(lblNomeDoProfessor);
		
		txtNomeProfessor = new JTextField();
		txtNomeProfessor.setColumns(10);
		txtNomeProfessor.setBounds(10, 32, 260, 20);
		panel_Professor.add(txtNomeProfessor);
		
		txtEmailProfessor = new JTextField();
		txtEmailProfessor.setColumns(10);
		txtEmailProfessor.setBounds(280, 32, 260, 20);
		panel_Professor.add(txtEmailProfessor);
		
		JLabel lblEmailDoProfessor = new JLabel("E-Mail do Professor:");
		lblEmailDoProfessor.setForeground(Color.DARK_GRAY);
		lblEmailDoProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailDoProfessor.setBackground(SystemColor.activeCaption);
		lblEmailDoProfessor.setBounds(280, 13, 149, 14);
		panel_Professor.add(lblEmailDoProfessor);
		
		txtCPFProfessor = new JTextField();
		txtCPFProfessor.setColumns(10);
		txtCPFProfessor.setBounds(550, 32, 245, 20);
		panel_Professor.add(txtCPFProfessor);
		
		JLabel lblNomeDoProfessor_1_1 = new JLabel("CPF do Professor");
		lblNomeDoProfessor_1_1.setForeground(Color.DARK_GRAY);
		lblNomeDoProfessor_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoProfessor_1_1.setBackground(SystemColor.activeCaption);
		lblNomeDoProfessor_1_1.setBounds(550, 13, 203, 14);
		panel_Professor.add(lblNomeDoProfessor_1_1);
		
		JPanel panel_aluno = new JPanel();
		panel_aluno.setBackground(new Color(255, 255, 255));
		panel_aluno.setBounds(10, 266, 805, 116);
		contentPane.add(panel_aluno);
		panel_aluno.setLayout(null);
		
		JLabel lblNomeDoAluno = new JLabel("Nome do Aluno:");
		lblNomeDoAluno.setForeground(Color.DARK_GRAY);
		lblNomeDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoAluno.setBackground(SystemColor.activeCaption);
		lblNomeDoAluno.setBounds(10, 11, 149, 14);
		panel_aluno.add(lblNomeDoAluno);
		
		txtNomeAluno = new JTextField();
		txtNomeAluno.setColumns(10);
		txtNomeAluno.setBounds(10, 30, 396, 20);
		panel_aluno.add(txtNomeAluno);
		
		JLabel lblEmailDoAluno = new JLabel("E-Mail do Aluno:");
		lblEmailDoAluno.setForeground(Color.DARK_GRAY);
		lblEmailDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailDoAluno.setBackground(SystemColor.activeCaption);
		lblEmailDoAluno.setBounds(427, 11, 149, 14);
		panel_aluno.add(lblEmailDoAluno);
		
		txtEmailAluno = new JTextField();
		txtEmailAluno.setColumns(10);
		txtEmailAluno.setBounds(427, 30, 368, 20);
		panel_aluno.add(txtEmailAluno);
		
		JLabel lblCpfDoAluno = new JLabel("CPF do Aluno:");
		lblCpfDoAluno.setForeground(Color.DARK_GRAY);
		lblCpfDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpfDoAluno.setBackground(SystemColor.activeCaption);
		lblCpfDoAluno.setBounds(10, 65, 149, 14);
		panel_aluno.add(lblCpfDoAluno);
		
		txtCPFAluno = new JTextField();
		txtCPFAluno.setColumns(10);
		txtCPFAluno.setBounds(140, 63, 322, 20);
		panel_aluno.add(txtCPFAluno);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(Color.DARK_GRAY);
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdade.setBackground(SystemColor.activeCaption);
		lblIdade.setBounds(472, 66, 66, 14);
		panel_aluno.add(lblIdade);
		
		txtIdadeAluno = new JTextField();
		txtIdadeAluno.setColumns(10);
		txtIdadeAluno.setBounds(548, 63, 247, 20);
		panel_aluno.add(txtIdadeAluno);
		
		JPanel panel_aulas = new JPanel();
		panel_aulas.setBackground(new Color(255, 255, 255));
		panel_aulas.setBounds(10, 393, 805, 106);
		contentPane.add(panel_aulas);
		panel_aulas.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Id da Aula:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 11, 87, 14);
		panel_aulas.add(lblNewLabel_1);
		
		txtIdAula = new JTextField();
		txtIdAula.setBounds(96, 9, 120, 20);
		panel_aulas.add(txtIdAula);
		txtIdAula.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Curso:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(238, 12, 54, 14);
		panel_aulas.add(lblNewLabel_2);
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(292, 9, 206, 20);
		panel_aulas.add(txtCurso);
		
		JLabel lblNewLabel_2_1 = new JLabel("Professor:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(509, 14, 87, 14);
		panel_aulas.add(lblNewLabel_2_1);
		
		txtProfessor = new JTextField();
		txtProfessor.setColumns(10);
		txtProfessor.setBounds(589, 11, 206, 20);
		panel_aulas.add(txtProfessor);
		
		JLabel lblNewLabel_1_1 = new JLabel("Início:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 48, 80, 14);
		panel_aulas.add(lblNewLabel_1_1);
		
		txtInicio = new JTextField();
		txtInicio.setColumns(10);
		txtInicio.setBounds(96, 46, 120, 20);
		panel_aulas.add(txtInicio);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Término:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(238, 48, 66, 14);
		panel_aulas.add(lblNewLabel_1_1_1);
		
		txtTermino = new JTextField();
		txtTermino.setColumns(10);
		txtTermino.setBounds(302, 46, 120, 20);
		panel_aulas.add(txtTermino);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Alunos:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(440, 49, 87, 14);
		panel_aulas.add(lblNewLabel_1_1_1_1);
		
		JComboBox cboAluno = new JComboBox();
		cboAluno.setBounds(533, 48, 262, 17);
		panel_aulas.add(cboAluno);
		
		JLabel lblNewLabel_3 = new JLabel("Sala:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 73, 80, 22);
		panel_aulas.add(lblNewLabel_3);
		
		txtSala = new JTextField();
		txtSala.setColumns(10);
		txtSala.setBounds(96, 75, 120, 20);
		panel_aulas.add(txtSala);
		
		JButton btnIncluirCurso = new JButton("Incluir curso");
		btnIncluirCurso.setIcon(new ImageIcon("C:\\Users\\marcos.skim\\Downloads\\Benno-Meyer-Benno-System-Programming-2.16.png"));
		btnIncluirCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Obter o texto que está na caixa "Título do Curso" e adicionar à caixa "Curso" que está na área do "Criar Aula".
				txtCurso.setText(txtTituloCurso.getText());
				//Vamos desativar o painel de cursos. Vamos usar o comando "enabled" com o valor "false".
				txtTituloCurso.setEnabled(false);
				txtArea.setEnabled(false);
				txtCargaHoraria.setEnabled(false);
				txtPreco.setEnabled(false);
				btnIncluirCurso.setEnabled(false);
			}
		});
		btnIncluirCurso.setBounds(10, 510, 141, 23);
		contentPane.add(btnIncluirCurso);
		
		JButton btnIncluirSala = new JButton("Incluir sala");
		btnIncluirSala.setIcon(new ImageIcon("C:\\Users\\marcos.skim\\Downloads\\Benno-Meyer-Benno-System-Programming-2.16.png"));
		btnIncluirSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//preencher os dados do objeto sala
				sala.setIdentificacao(txtIdentificacao.getText());
				sala.setDescricao(txtDescricao.getText());
				
				txtSala.setText(txtIdentificacao.getText());
				
				btnIncluirSala.setEnabled(false);
				txtIdentificacao.setEnabled(false);
				txtDescricao.setEnabled(false);
			}
		});
		btnIncluirSala.setBounds(161, 510, 141, 23);
		contentPane.add(btnIncluirSala);
		
		JButton btnIncluirProfessor = new JButton("Incluir professor");
		btnIncluirProfessor.setIcon(new ImageIcon("C:\\Users\\marcos.skim\\Downloads\\Benno-Meyer-Benno-System-Programming-2.16.png"));
		btnIncluirProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtProfessor.setText(txtNomeProfessor.getText());
				btnIncluirProfessor.setEnabled(false);
				txtNomeProfessor.setEnabled(false);
				txtEmailProfessor.setEnabled(false);
				txtCPFProfessor.setEnabled(false);
			}
		});
		btnIncluirProfessor.setBounds(312, 510, 141, 23);
		contentPane.add(btnIncluirProfessor);
		
		JButton btnIncluirAluno = new JButton("Incluir aluno");
		btnIncluirAluno.setIcon(new ImageIcon("C:\\Users\\marcos.skim\\Downloads\\Benno-Meyer-Benno-System-Programming-2.16.png"));
		btnIncluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aluno = new Aluno();
				
				aluno.setNome(txtNomeAluno.getText());
				aluno.setEmail(txtEmailAluno.getText());
				aluno.setCpf(txtCPFAluno.getText());
				aluno.setIdade(Integer.parseInt(txtIdadeAluno.getText()));
				listaAluno.add(aluno);
				
				cboAluno.addItem(txtNomeAluno.getText());
				
				btnIncluirAluno.setEnabled(false);
				txtNomeAluno.setEnabled(false);
				txtEmailAluno.setEnabled(false);
				txtCPFAluno.setEnabled(false);
				txtIdadeAluno.setEnabled(false);
				
							}
		});
		btnIncluirAluno.setBounds(463, 510, 141, 23);
		contentPane.add(btnIncluirAluno);
		
		JButton btnCriarAula = new JButton("Criar a Aula");
		btnCriarAula.setIcon(new ImageIcon("C:\\Users\\marcos.skim\\Downloads\\Benno-Meyer-Benno-System-Window.32.png"));
		btnCriarAula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aulas.setId(Integer.parseInt(txtIdAula.getText()));
				aulas.setCurso(curso);
				aulas.setProfessor(professor);
				
				aulas.setInicio(new Date(Long.parseLong(txtInicio.getText())));
				aulas.setTermino(new Date(Long.parseLong(txtTermino.getText())));
				
				aulas.setAlunos(listaAluno.toArray(new Aluno[0]));
				aulas.setSala(sala);
				
				txtIdAula.setEnabled(false);
				txtCurso.setEnabled(false);
				txtProfessor.setEnabled(false);
				txtInicio.setEnabled(false);
				txtTermino.setEnabled(false);
				txtSala.setEnabled(false);
				
							
				System.out.println(cboAluno.getItemAt(0));
			}
		});
		btnCriarAula.setBounds(625, 510, 141, 23);
		contentPane.add(btnCriarAula);
	}
}
