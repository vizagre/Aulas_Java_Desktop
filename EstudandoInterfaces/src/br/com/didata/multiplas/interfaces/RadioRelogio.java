package br.com.didata.multiplas.interfaces;

public class RadioRelogio extends Relogio implements InterfaceRadio {

	@Override
	public void dizerAsHoras() {
		System.out.println("Consultando relógio...");
		super.getHoras();

	}

	@Override
	public void ligarRelogio() {
		System.out.println("Ligando relógio...");
		super.setRelogioLigado(true);

	}

	@Override
	public void desligarRelogio() {
		System.out.println("Desligando relógio...");
		super.setRelogioLigado(false);

	}

	@Override
	public void ligarRadio() {
		System.out.println("Ligando rádio...");

	}

	@Override
	public void desligarRadio() {
		System.out.println("Desligando rádio...");

	}

}
