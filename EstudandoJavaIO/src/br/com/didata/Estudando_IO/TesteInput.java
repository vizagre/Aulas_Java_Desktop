package br.com.didata.Estudando_IO;

import java.io.IOException;
import java.io.InputStream;

public class TesteInput {

	public static void main(String[] args) throws IOException {
		InputStream entrada = System.in;
		int i;

		do {
			i = entrada.read();
			System.out.println("Valor lido: " + i);
		} while (i != -1);

	}

}
