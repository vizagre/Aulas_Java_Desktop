package br.com.didata.heranca;

public class Funcionario {
	private int codigo;
	private String nome;
	protected double salario;
	private int idade;
	static double valeRefeicaoDia = 20;
	private boolean emFerias;

	public boolean isEmFerias() {
		return emFerias;
	}

	public void setEmFerias(boolean emFerias) {
		this.emFerias = emFerias;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if (nome.isEmpty()) {
			System.out.println("Nome inválido!");
		} else {
			this.nome = nome;
		}
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
		} else {
			System.out.println("Salário inválido!");
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >= 18 && idade < 65) {
			this.idade = idade;
		} else {
			System.out.println("Idade inválida!");
		}
	}

	public double calculaBonificacao() {
		return this.salario += this.salario * 0.1;
	}

	public double simulaBonificacao() {
		return this.salario * 0.1;
	}

}
