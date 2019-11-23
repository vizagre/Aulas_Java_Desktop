package br.com.didata.estudandostatic;
import java.text.SimpleDateFormat;
import java.util.Date;
public class PontoEletronico {
	public void registrarEntrada(Funcionario f) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Entrada: " + f.getCodigo()); 
		System.out.println("Data: " + sdf.format(agora));
	}

	public void registrarSaida (Funcionario f) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Saída: " + f.getCodigo());
		System.out.println("Data: " + sdf.format(agora));
	}
}
