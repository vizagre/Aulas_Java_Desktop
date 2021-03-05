
public class TestaCao {

	public static void main(String[] args) {
		
		Cao cao = new Cao();
		cao.setNome("Toto");
		cao.setPeso(5);
		
		System.out.println("Fala " + cao.getNome());
		cao.emitirSom();
		

	}

}
