package br.com.didata.Exceptions;


public class TestaFuncionario {
	public static void main(String[] args) {
		Gerente_Exception g = new Gerente_Exception();

		g.setCodigo(10);
		g.setNome("Luiz Tada");
		g.setSalario(5000);
		g.setUsuario("luiz.tada");
		g.setSenha("abcde");

		System.out.println("Gerente");
		System.out.println("Nome: " + g.getNome());
		System.out.println("Sal�rio: " + g.getSalario());
		System.out.println("Usu�rio: " + g.getUsuario());
		System.out.println("Senha: " + g.getSenha());
		System.out.println("Bonifica��o: " + g.calculaBonificacao());

		// --- unchecked
//		 g.novoSalario(0);
//		 System.out.println(g.getSalario());
		 
		// --- checked
		try {
			g.novoSalario_checked(-100);
			System.out.println("Novo sal�rio: " + g.getSalario());
			System.out.println("----------------------------------------------");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Houve um erro no argumento informado!");
		}

	}

}
