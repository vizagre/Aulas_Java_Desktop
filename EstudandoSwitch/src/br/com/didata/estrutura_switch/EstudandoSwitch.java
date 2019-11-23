package br.com.didata.estrutura_switch;

public class EstudandoSwitch {

	public static void main(String[] args) {
		
		int idade = 18;

		switch (idade) {
		case 15:
			System.out.println("Juvenil");
			break;

		case 16:
			System.out.println("Junior");
			break;

		case 17:
			System.out.println("Semi-profissional");
			break;

		case 18:
			System.out.println("Profissional");
			break;

		default:
			System.out.println("Idade invalida");
			break;
		}

	}

}
