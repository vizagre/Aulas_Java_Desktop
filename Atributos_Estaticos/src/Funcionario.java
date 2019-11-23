
public class Funcionario {
	String nome;
	double salario;
	static double valeRefeicaoDia = 20;
	static int contador;

	Funcionario() {
		Funcionario.contador++;
	}
		
	void concederAumento(double novoValor) {
		this.salario += novoValor;
	}

	static void reajustarVR(double taxa) {
		Funcionario.valeRefeicaoDia += Funcionario.valeRefeicaoDia * taxa;
	}
}
