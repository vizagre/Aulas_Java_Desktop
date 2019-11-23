package br.com.didata.multiplas.interfaces;

public class TestaRadioRelogio {

	public static void main(String[] args) {

		RadioRelogio rr = new RadioRelogio();

		System.out.print("Rádio Relógio " + rr.MODELO + " está ");
		System.out.println(rr.isRelogioLigado() ? "ligado" : "desligado");

		rr.ligarRadio();

		rr.ligarRelogio();

		System.out.print("Rádio Relógio " + rr.MODELO + " está ");
		System.out.println(rr.isRelogioLigado() ? "ligado" : "desligado");

		rr.dizerAsHoras();

		rr.desligarRelogio();

		rr.desligarRadio();

		System.out.print("Rádio Relógio " + rr.MODELO + " está ");
		System.out.println(rr.isRelogioLigado() ? "ligado" : "desligado");

	}

}
