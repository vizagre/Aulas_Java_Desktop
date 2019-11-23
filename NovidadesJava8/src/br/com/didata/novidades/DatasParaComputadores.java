package br.com.didata.novidades;

import java.time.Duration;
import java.time.Instant;

public class DatasParaComputadores {

	public static void main(String[] args) {

		System.out.println("Data para computadores");

		Instant agora = Instant.now();
		System.out.println("Agora é: " + agora);

		System.out.println("----------------");

		Instant inicio = Instant.now();

		for (int i = 0; i < 1000; i++) {
			System.out.println("Contando: " + i);

		}

		Instant fim = Instant.now();

		Duration duracao = Duration.between(inicio, fim);
		long duracaoEmMilissegundos = duracao.toMillis();

		System.out.println("Duração: " + duracaoEmMilissegundos);

		System.out.println("----------------");

	}

}
