package br.com.didata.atributosestaticos;

public class Funcionario {
	private String nome;
	private double salario;

	public static double valeRefeicaoDia = 20;
	public static int contador;

	public Funcionario() {
		Funcionario.contador++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isEmpty()) {
			System.out.println("Nome invalido");
		} else {
			this.nome = nome;
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
		} else {
			System.out.println("Salario invalido");
		}

	}

	public void concederAumento(double acrescimo) {
		if (acrescimo > 0) {
			this.salario += acrescimo;
		} else {
			System.out.println("Acrescimo invalido");
		}

	}

	public static void reajustarVR(double taxa) {
		Funcionario.valeRefeicaoDia += Funcionario.valeRefeicaoDia * taxa;
	}
}
