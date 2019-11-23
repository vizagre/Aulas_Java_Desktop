package br.com.didata.Exceptions;

public class Funcionario_Exception {
	private int codigo;
	private String nome;
	private double salario;
	static double valeRefeicaoDia = 20;
	static int contador;

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
		this.nome = nome;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Double calculaBonificacao() {
		return this.salario * 0.1;
	}
	
	//--- metodo para testar exception unchecked
	public void novoSalario(double salario_adicional) {
		if (salario_adicional <= 0) {
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		} else {
			this.salario = this.salario + salario_adicional;			
		}
	}
	
	//--- metodo para testar exception checked
	public void novoSalario_checked(double salario_adicional) throws Exception {
		if (salario_adicional <= 0) {
			Exception erro = new Exception();
			throw erro;			
		} else {
			this.salario = this.salario + salario_adicional;			
		}
	}
	
	
	
}
