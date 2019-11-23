package br.com.didata.multiplas.interfaces;

public class TestaRadioRelogio {

	public static void main(String[] args) {

		RadioRelogio rr = new RadioRelogio();

		System.out.print("R�dio Rel�gio " + rr.MODELO + " est� ");
		System.out.println(rr.isRelogioLigado() ? "ligado" : "desligado");

		rr.ligarRadio();

		rr.ligarRelogio();

		System.out.print("R�dio Rel�gio " + rr.MODELO + " est� ");
		System.out.println(rr.isRelogioLigado() ? "ligado" : "desligado");

		rr.dizerAsHoras();

		rr.desligarRelogio();

		rr.desligarRadio();

		System.out.print("R�dio Rel�gio " + rr.MODELO + " est� ");
		System.out.println(rr.isRelogioLigado() ? "ligado" : "desligado");

	}

}
