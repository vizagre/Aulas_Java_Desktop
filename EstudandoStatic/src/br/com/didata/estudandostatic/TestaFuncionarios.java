package br.com.didata.estudandostatic;
public class TestaFuncionarios {
	public static void main(String[] args) {
		
	PontoEletronico ponto = new PontoEletronico();
		
	Gerente g = new Gerente();
	g.setCodigo(10);
	g.setNome("Luiz Tada");
	g.setSalario(5000);
	g.setUsuario("luiz.tada");
	g.setSenha("abcde");
		
	Telefonista t = new Telefonista();
	t.setCodigo(12);
	t.setNome("Luciana Santos");
	t.setSalario(850);
	t.setEstacaoDeTrabalho(15);

	Secretaria s = new Secretaria();
	s.setCodigo(33);
	s.setNome("Claudia Silva");
	s.setSalario(1600);
	s.setRamal(155);

	System.out.println("Gerente");
	System.out.println("Nome: " + g.getNome());
	System.out.println("Sal�rio: " + g.getSalario());
	System.out.println("Usu�rio: " + g.getUsuario());
	System.out.println("Senha: " + g.getSenha());
	System.out.println("Bonifica��o: " + g.calculaBonificacao());
	ponto.registrarEntrada(g);
	System.out.println("----------------------------------------------");

	System.out.println("Telefonista");
	System.out.println("Nome: " + t.getNome());
	System.out.println("Sal�rio: " + t.getSalario());
	System.out.println("Esta��o de trabalho: " + t.getEstacaoDeTrabalho());
	System.out.println("Bonifica��o: " + t.calculaBonificacao());
	ponto.registrarEntrada(t);
	System.out.println("----------------------------------------------");
	
	System.out.println("Secret�ria");
	System.out.println("Nome: " + s.getNome());
	System.out.println("Sal�rio: " + s.getSalario());
	System.out.println("Ramal: " + s.getRamal());
	System.out.println("Bonifica��o: " + s.calculaBonificacao());
	ponto.registrarEntrada(s);
	System.out.println("----------------------------------------------");
	
	}
}
