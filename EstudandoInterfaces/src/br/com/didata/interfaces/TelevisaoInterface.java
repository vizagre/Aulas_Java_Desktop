package br.com.didata.interfaces;

public class TelevisaoInterface {
	private int tamanho;
	private int voltagem;
	private int canal;
	private int volume;
	private boolean ligada;
	
	public TelevisaoInterface(int tamanho, int voltagem) {
		this.tamanho = tamanho;
		this.voltagem = voltagem;
		this.canal = 0;
		this.volume = 0;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void desligar() {
		setCanal(0);
		setVolume(0);
	}

	public void ligar() {
		setCanal(3);
		setVolume(25);
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public boolean isLigada(){
		return ligada;
	}

}
