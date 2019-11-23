package br.com.didata.email;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {

	private String hostName = "smtp.gmail.com";
	private String usuario = "leonardo.vizagre@gmail.com"; // Seu login do Gmail
	private String senha = ""; // Sua senha do Gmail
	private String email = "leonardo.vizagre@gmail.com"; // Seu e-mail do Gmail

	private SimpleEmail simpleEmail;

	public Carteiro() {
		this.simpleEmail = new SimpleEmail();
	}

	public void enviarMensagem(Mensagem mensagem) throws EmailException {

		simpleEmail.setHostName(hostName);
		simpleEmail.setAuthentication(usuario, senha);
		simpleEmail.setStartTLSRequired(true);
		simpleEmail.setStartTLSEnabled(true);
		simpleEmail.setSmtpPort(465);
		simpleEmail.setSslSmtpPort("587");
		simpleEmail.setFrom(email);
		simpleEmail.addTo(mensagem.getDestinatario());
		simpleEmail.setSubject(mensagem.getAssunto());
		simpleEmail.setMsg(mensagem.getMensagem());
		simpleEmail.send();
	}
}

