package br.com.didata.testes;

import br.com.didata.heranca.Diretor;
import br.com.didata.heranca.Gerente;
import br.com.didata.heranca.PontoEletronico;
import br.com.didata.heranca.Secretaria;
import br.com.didata.heranca.Telefonista;

public class TestaFuncionarios {

	public static void main(String[] args) {
		
		PontoEletronico p = new PontoEletronico();
		
		Gerente g = new Gerente();
		g.setCodigo(10);
		g.setNome("Luiz Tada");
		g.setSalario(5000);
		g.setUsuario("luiz.tada");
		g.setSenha("abcdef");
		g.calculaBonificacao();
		g.getSalario();

		Telefonista t = new Telefonista();
		t.setCodigo(12);
		t.setNome("Luciana Santos");
		t.setSalario(850);
		t.setEstacaoDeTrabalho(15);
		t.calculaBonificacao();

		Secretaria s = new Secretaria();
		s.setCodigo(33);
		s.setNome("Claudia Silva");
		s.setSalario(1600);
		s.setRamal(155);
		s.setEmFerias(true);
		s.calculaBonificacao();

		Diretor d = new Diretor();
		d.setCodigo(44);
		d.setNome("Angela");
		d.setSalario(10000);
		d.calculaBonificacao();
		d.getSalario();

		System.out.println("Gerente");
		System.out.println("Nome: " + g.getNome());
		System.out.println("Sal�rio: " + g.getSalario());
		System.out.println("Usu�rio: " + g.getUsuario());
		System.out.println("Senha: " + g.getSenha());
		System.out.println("Valor bonifica��o: " + g.simulaBonificacao());
		System.out.println("Novo Sal�rio: " + g.calculaBonificacao());
		System.out.println("----------------------------------------------");

		System.out.println("Telefonista");
		System.out.println("Nome: " + t.getNome());
		System.out.println("Sal�rio: " + t.getSalario());
		System.out.println("Esta��o de trabalho: " + t.getEstacaoDeTrabalho());
		System.out.println("Valor bonifica��o: " + t.simulaBonificacao());
		System.out.println("Novo Sal�rio: " + t.calculaBonificacao());
		p.registrarEntrada(t);
		System.out.println("----------------------------------------------");

		System.out.println("Secret�ria");
		System.out.println("Nome: " + s.getNome());
		System.out.println("Sal�rio: " + s.getSalario());
		System.out.println("Ramal: " + s.getRamal());		
		System.out.println(s.isEmFerias() ? "Est� em f�rias" : "N�o est� em f�rias");		
		System.out.println("Valor bonifica��o: " + s.simulaBonificacao());
		System.out.println("Novo Sal�rio: " + s.calculaBonificacao());
		p.registrarEntrada(s);		
		System.out.println("----------------------------------------------");

		System.out.println("Diretor");
		System.out.println("Nome: " + d.getNome());
		System.out.println("Sal�rio: " + d.getSalario());
		System.out.println("Valor bonifica��o: " + d.simulaBonificacao());
		System.out.println("Novo Sal�rio: " + d.calculaBonificacao());
		System.out.println("----------------------------------------------");
		
		System.out.println("Sa�das...");
		p.registrarSaida(t);
		p.registrarSaida(s);	
	}
}
