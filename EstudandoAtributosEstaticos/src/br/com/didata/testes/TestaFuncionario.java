package br.com.didata.testes;

import br.com.didata.atributosestaticos.Funcionario;

public class TestaFuncionario {
	public static void main(String[] args) {

		Funcionario F1 = new Funcionario();
		F1.setNome("Zezinho");
		F1.setSalario(500);

		Funcionario F2 = new Funcionario();
		F2.setNome("Luizinho");
		F2.setSalario(450);

		System.out.println(Funcionario.valeRefeicaoDia);

		System.out.println("Nome:" + F1.getNome());
		System.out.println("Salário:" + F1.getSalario());

		System.out.println("Nome:" + F2.getNome());
		System.out.println("Salário:" + F2.getSalario());

		F1.concederAumento(59);

		System.out.println("Novo salário F1:" + F1.getSalario());

		Funcionario.reajustarVR(0.2);

		Funcionario F3 = new Funcionario();
		F3.setNome("Rafael");
		F3.setSalario(1200);

		Funcionario F4 = new Funcionario();
		F4.setNome("Monica");
		F4.setSalario(1200);

		System.out.println(Funcionario.valeRefeicaoDia);
		System.out.println(Funcionario.contador);

	}

}
