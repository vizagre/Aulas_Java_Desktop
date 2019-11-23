package br.com.didata.Estudando_IO;

import java.io.*;
public class LerDadosTeclado {

	public static void main(String[] args) {
		System.out.print("Digite seu nome: ");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String userName = null;

		try {
			userName = buf.readLine();
		} catch (IOException ioe) {
			System.out.println("Erro de IO");
			System.exit(1);
		}

		System.out.println("Seu nome é: " + userName);
	}

}
