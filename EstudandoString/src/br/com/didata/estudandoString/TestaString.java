package br.com.didata.estudandoString;

public class TestaString {

	public static void main(String[] args) {

		String exemplo = "Didata Educacional";
		String espacos = "  Didata Educacional   ";
		String texto = "Um, dois, três, quatro";
		String frase = "Estou estudando Java";

		System.out.println(exemplo.length());

		System.out.println(exemplo.toUpperCase());

		System.out.println(exemplo.toLowerCase());

		System.out.println(espacos.trim());

		String[] palavras = texto.split(",");

		for (int i = 0; i < palavras.length; i++) {
			System.out.println(palavras[i].trim());
		}

		String frasealterada = frase.replaceAll("estudando", "aprendendo");

		System.out.println(frasealterada);

	}

}
