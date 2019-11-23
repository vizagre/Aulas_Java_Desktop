
public class TestaFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Funcionario F1 = new Funcionario();
		F1.nome = "Zezinho";
		F1.salario = 500;

		Funcionario F2 = new Funcionario();
		F2.nome = "Luizinho";
		F2.salario = 450;

		System.out.println(Funcionario.valeRefeicaoDia);

		System.out.println("Nome:" + F1.nome);
		System.out.println("Salario:" + F1.salario);

		System.out.println("Nome:" + F2.nome);
		System.out.println("Salario:" + F2.salario);

		F1.concederAumento(59);
		System.out.println("Novo salario F1:" + F1.salario);

		Funcionario.reajustarVR(0.2);

		System.out.println(Funcionario.valeRefeicaoDia);
		
		System.out.println(Funcionario.contador);

	}

}
