package br.com.didata.Exceptions;

public class Gerente_Exception extends Funcionario_Exception {
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
