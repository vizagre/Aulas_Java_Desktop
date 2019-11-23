package br.com.didata.interfaces;

public interface ControleRemoto {
	void mudarCanal(int canal);

	void aumentarVolume(int taxa);

	void diminuirVolume(int taxa);

	void ligar();

	void desligar();
}
