package br.com.didata.email;

import java.awt.EventQueue;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaEnvio {

	private JFrame frmEnvioDeEmail;
	private JTextField txtDe;
	private JTextField txtPara;
	private JTextField txtAssunto;
	private JTextArea txtMensagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEnvio window = new TelaEnvio();
					window.frmEnvioDeEmail.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaEnvio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEnvioDeEmail = new JFrame();
		frmEnvioDeEmail.setType(Type.UTILITY);
		frmEnvioDeEmail.setResizable(false);
		frmEnvioDeEmail.setTitle("Envio de email");
		frmEnvioDeEmail.setBounds(100, 100, 511, 368);
		frmEnvioDeEmail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEnvioDeEmail.getContentPane().setLayout(null);

		JLabel lblDe = new JLabel("De:");
		lblDe.setBounds(10, 14, 46, 14);
		frmEnvioDeEmail.getContentPane().add(lblDe);

		txtDe = new JTextField();

		txtDe.setBounds(77, 11, 250, 20);
		frmEnvioDeEmail.getContentPane().add(txtDe);
		txtDe.setColumns(10);

		txtPara = new JTextField();

		txtPara.setColumns(10);
		txtPara.setBounds(77, 42, 250, 20);
		frmEnvioDeEmail.getContentPane().add(txtPara);

		txtAssunto = new JTextField();

		txtAssunto.setColumns(10);
		txtAssunto.setBounds(77, 73, 413, 20);
		frmEnvioDeEmail.getContentPane().add(txtAssunto);

		JLabel lblMensagem = new JLabel("Mensagem:");
		lblMensagem.setBounds(10, 101, 60, 14);
		frmEnvioDeEmail.getContentPane().add(lblMensagem);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		btnEnviar.setBounds(157, 299, 89, 23);
		frmEnvioDeEmail.getContentPane().add(btnEnviar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnLimpar.setBounds(266, 299, 89, 23);
		frmEnvioDeEmail.getContentPane().add(btnLimpar);

		JLabel lblPara = new JLabel("Para:");
		lblPara.setBounds(10, 45, 46, 14);
		frmEnvioDeEmail.getContentPane().add(lblPara);

		JLabel lblAssunto = new JLabel("Assunto:");
		lblAssunto.setBounds(10, 76, 46, 14);
		frmEnvioDeEmail.getContentPane().add(lblAssunto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(77, 122, 413, 144);
		frmEnvioDeEmail.getContentPane().add(scrollPane);
		
		txtMensagem = new JTextArea();
		scrollPane.setViewportView(txtMensagem);
		txtMensagem.setColumns(10);

	}
}
