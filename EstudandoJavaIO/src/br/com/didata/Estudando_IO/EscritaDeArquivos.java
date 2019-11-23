package br.com.didata.Estudando_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class EscritaDeArquivos {

	public static void main(String[] args) throws IOException {

		FileOutputStream arquivo = new FileOutputStream(
				"d:/temp/arquivoSaida.txt");
		PrintStream printstream = new PrintStream(arquivo);

		printstream.println("Primeira linha");
		printstream.println("Segunda linha");
		printstream.println("Terceira linha");

		printstream.close();
	}
}
