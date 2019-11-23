package br.com.didata.Exceptions;

public class Estudando_Strings {
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
		System.out.println(palavras[0]);
		System.out.println(palavras[1]);
		System.out.println(palavras[2]);
		System.out.println(palavras[3]);

		String frasealterada = frase.replaceAll("estudando", "aprendendo");
		System.out.println(frasealterada);

	}

}
