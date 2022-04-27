
public class TestaCao {

	public static void main(String[] args) {
		
		Cao cao = new Cao();
		cao.setNome("Trovão");
		cao.setPeso(15);
		
		System.out.println("Fala " + cao.getNome());
		cao.emitirSom();		

	}

}
