package br.com.didata.estudandostatic;

class Funcionario {
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


}
