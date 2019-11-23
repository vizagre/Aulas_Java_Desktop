package br.com.didata.estudandostatic;

class Gerente extends Funcionario {
	private String usuario;
	private String senha; 

	public String getUsuario() {
		return this.usuario;	
	} 

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	} 

	public String getSenha() {
		return this.senha;	
	} 

	public void setSenha(String senha) {
		this.senha = senha;
	} 
	
	public Double calculaBonificacao() {
		return this.getSalario() * 0.2;
	}
	

}
