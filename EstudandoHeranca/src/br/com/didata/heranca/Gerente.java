package br.com.didata.heranca;

public class Gerente extends Funcionario {
	private String usuario;
	private String senha;

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		if (usuario.isEmpty()) {
			System.out.println("Usuário inválido!");
		} else {
			this.usuario = usuario;
		}
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		if (senha.length() < 6) {
			System.out.println("Senha muito pequena!");
		} else {
			this.senha = senha;			
		}
	}
	
	public double calculaBonificacao() {
		return salario += this.getSalario() * 0.2;
	}

	public double simulaBonificacao() {
		return this.salario * 0.2;
	}

}
