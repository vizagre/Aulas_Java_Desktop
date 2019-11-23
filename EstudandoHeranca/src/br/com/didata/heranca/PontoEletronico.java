package br.com.didata.heranca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PontoEletronico {

	public void registrarEntrada(Funcionario f) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Entrada do funcionario: " + f.getCodigo());
		System.out.println("Data: " + sdf.format(agora));
	}

	public void registrarSaida(Funcionario f) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Saída do funcionario: " + f.getCodigo());
		System.out.println("Data: " + sdf.format(agora));
	}

}
