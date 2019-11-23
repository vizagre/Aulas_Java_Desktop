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
		System.out.println("Salário: " + g.getSalario());
		System.out.println("Usuário: " + g.getUsuario());
		System.out.println("Senha: " + g.getSenha());
		System.out.println("Valor bonificação: " + g.simulaBonificacao());
		System.out.println("Novo Salário: " + g.calculaBonificacao());
		System.out.println("----------------------------------------------");

		System.out.println("Telefonista");
		System.out.println("Nome: " + t.getNome());
		System.out.println("Salário: " + t.getSalario());
		System.out.println("Estação de trabalho: " + t.getEstacaoDeTrabalho());
		System.out.println("Valor bonificação: " + t.simulaBonificacao());
		System.out.println("Novo Salário: " + t.calculaBonificacao());
		p.registrarEntrada(t);
		System.out.println("----------------------------------------------");

		System.out.println("Secretária");
		System.out.println("Nome: " + s.getNome());
		System.out.println("Salário: " + s.getSalario());
		System.out.println("Ramal: " + s.getRamal());		
		System.out.println(s.isEmFerias() ? "Está em férias" : "Não está em férias");		
		System.out.println("Valor bonificação: " + s.simulaBonificacao());
		System.out.println("Novo Salário: " + s.calculaBonificacao());
		p.registrarEntrada(s);		
		System.out.println("----------------------------------------------");

		System.out.println("Diretor");
		System.out.println("Nome: " + d.getNome());
		System.out.println("Salário: " + d.getSalario());
		System.out.println("Valor bonificação: " + d.simulaBonificacao());
		System.out.println("Novo Salário: " + d.calculaBonificacao());
		System.out.println("----------------------------------------------");
		
		System.out.println("Saídas...");
		p.registrarSaida(t);
		p.registrarSaida(s);	
	}
}
