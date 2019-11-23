package br.com.didata.multiplas.interfaces;

public class Radio {

	public final String MODELO = "Rádio padrão";
	private boolean radioLigado;

	public boolean isRadioLigado() {
		return radioLigado;
	}

	public void setRadioLigado(boolean relogioLigado) {
		this.radioLigado = relogioLigado;
	}

}
