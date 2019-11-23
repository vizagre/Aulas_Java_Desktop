package br.com.didata.multiplas.interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Relogio {

	public final String MODELO = "DIDATA";
	private boolean relogioLigado;

	public boolean isRelogioLigado() {
		return relogioLigado;
	}

	public void setRelogioLigado(boolean relogioLigado) {
		this.relogioLigado = relogioLigado;
	}

	public void getHoras() {
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatador1 = DateTimeFormatter.ofLocalizedDateTime(
				FormatStyle.SHORT).withLocale(new Locale("pt", "br"));

		System.out.println("Agora são: " + agora.format(formatador1));
	}

}
