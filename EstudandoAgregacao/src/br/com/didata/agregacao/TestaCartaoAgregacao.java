package br.com.didata.agregacao;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestaCartaoAgregacao {

	public static void main(String[] args) {

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate validade = LocalDate.of(2016, Month.APRIL, 10);
		
		Cliente c = new Cliente();
		c.setId(10);
		c.setNomeCliente("Cliente 10");

		CartaoDeCredito cdc = new CartaoDeCredito();
		cdc.setNumero(1);
		cdc.setDataDeValidade(validade.format(formatador));
		cdc.setCliente(c);

		System.out.println("Conta: " + cdc.getNumero());
		System.out.println("Cliente: " + cdc.getCliente().getNomeCliente());

	}

}
