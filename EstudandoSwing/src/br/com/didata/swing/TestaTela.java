package br.com.didata.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestaTela {

	private JFrame frmLoginDoSistema;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestaTela window = new TestaTela();
					window.frmLoginDoSistema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestaTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginDoSistema = new JFrame();
		frmLoginDoSistema.setAlwaysOnTop(true);
		frmLoginDoSistema.setTitle("Login do Sistema");
		frmLoginDoSistema.setBounds(100, 100, 397, 217);
		frmLoginDoSistema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginDoSistema.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(34, 25, 46, 14);
		frmLoginDoSistema.getContentPane().add(lblLogin);
		
		textField = new JTextField();
		textField.setToolTipText("Digite o login");
		textField.setBounds(90, 22, 179, 20);
		frmLoginDoSistema.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(34, 60, 46, 14);
		frmLoginDoSistema.getContentPane().add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Digite a senha");
		passwordField.setBounds(90, 57, 179, 20);
		frmLoginDoSistema.getContentPane().add(passwordField);
		
		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.setToolTipText("Acessar o sistema");
		btnAcessar.setBounds(90, 120, 89, 23);
		frmLoginDoSistema.getContentPane().add(btnAcessar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); 
			}
		});
		btnSair.setToolTipText("Sair do sistema");
		btnSair.setBounds(204, 120, 89, 23);
		frmLoginDoSistema.getContentPane().add(btnSair);
	}
}
