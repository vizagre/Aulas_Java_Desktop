package br.com.didata.Estudando_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LeituraDeArquivos {

	public static void main(String[] args) throws IOException {

		try {

			InputStream arquivo = new FileInputStream(
					"d:/temp/arquivoEntrada1.txt");
			Scanner scanner = new Scanner(arquivo);

			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				System.out.println(linha);
			}

			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
