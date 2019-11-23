package br.com.didata.multiplas.interfaces;

public class RadioRelogio extends Relogio implements InterfaceRadio {

	@Override
	public void dizerAsHoras() {
		System.out.println("Consultando rel�gio...");
		super.getHoras();

	}

	@Override
	public void ligarRelogio() {
		System.out.println("Ligando rel�gio...");
		super.setRelogioLigado(true);

	}

	@Override
	public void desligarRelogio() {
		System.out.println("Desligando rel�gio...");
		super.setRelogioLigado(false);

	}

	@Override
	public void ligarRadio() {
		System.out.println("Ligando r�dio...");

	}

	@Override
	public void desligarRadio() {
		System.out.println("Desligando r�dio...");

	}

}
