package br.com.didata.email;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.apache.commons.mail.EmailException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
		lblDe.setBounds(10, 14, 89, 14);
		frmEnvioDeEmail.getContentPane().add(lblDe);

		txtDe = new JTextField();
		txtDe.setToolTipText("E-mail origem");
		txtDe.setEditable(false);
		txtDe.setText("leonardo.vizagre@gmail.com");
		txtDe.setBounds(100, 11, 227, 20);
		frmEnvioDeEmail.getContentPane().add(txtDe);
		txtDe.setColumns(10);

		txtPara = new JTextField();
		txtPara.setToolTipText("E-mail destino");
		txtPara.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				if (txtPara.getText().isEmpty() == true) {
					JOptionPane.showMessageDialog( null,
							"Campo <para> nao preenchido!",
							"Mensagem do sistema", JOptionPane.ERROR_MESSAGE);

					txtPara.requestFocus();
				}
			}
		});

		txtPara.setColumns(10);
		txtPara.setBounds(100, 42, 227, 20);
		frmEnvioDeEmail.getContentPane().add(txtPara);

		txtAssunto = new JTextField();
		txtAssunto.setToolTipText("Assunto do e-mail");

		txtAssunto.setColumns(10);
		txtAssunto.setBounds(100, 73, 390, 20);
		frmEnvioDeEmail.getContentPane().add(txtAssunto);

		JLabel lblMensagem = new JLabel("Mensagem:");
		lblMensagem.setBounds(10, 101, 113, 14);
		frmEnvioDeEmail.getContentPane().add(lblMensagem);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setToolTipText("Enviar mensagem");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mensagem msg = new Mensagem();
				Carteiro carteiro = new Carteiro();

				try {
					msg.setRemetente(txtDe.getText());
					msg.setDestinatario(txtPara.getText());
					msg.setAssunto(txtAssunto.getText());
					msg.setMensagem(txtMensagem.getText());

					carteiro.enviarMensagem(msg);

					JOptionPane.showMessageDialog(null,
							"Email enviado com sucesso!",
							"Mensagem do sistema",
							JOptionPane.INFORMATION_MESSAGE);

				} catch (EmailException e) {
					JOptionPane.showMessageDialog(
							null,
							"Ocorreu um erro no envio do email! \n"
									+ e.getMessage(), "Mensagem do sistema",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnEnviar.setBounds(157, 299, 89, 23);
		frmEnvioDeEmail.getContentPane().add(btnEnviar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setToolTipText("Limpar formulario");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDe.setText(null);
				txtPara.setText(null);
				txtAssunto.setText(null);
				txtMensagem.setText(null);
				
			}
		});
		btnLimpar.setBounds(266, 299, 89, 23);
		frmEnvioDeEmail.getContentPane().add(btnLimpar);

		JLabel lblPara = new JLabel("Para:");
		lblPara.setBounds(10, 45, 89, 14);
		frmEnvioDeEmail.getContentPane().add(lblPara);

		JLabel lblAssunto = new JLabel("Assunto:");
		lblAssunto.setBounds(10, 76, 89, 14);
		frmEnvioDeEmail.getContentPane().add(lblAssunto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(19, 127, 471, 144);
		frmEnvioDeEmail.getContentPane().add(scrollPane);
		
		txtMensagem = new JTextArea();
		txtMensagem.setBounds(22, 127, 468, 141);
		frmEnvioDeEmail.getContentPane().add(txtMensagem);
		txtMensagem.setToolTipText("Texto");
		txtMensagem.setColumns(10);

	}
}
