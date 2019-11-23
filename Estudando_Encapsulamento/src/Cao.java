/**
 *
 */

/**
 * @author Leonardo Vizagre
 *
 */
public class Cao {
	private int peso;
	private String nome;

	public int getPeso() {
		return this.peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	void emitirSom( ) {
        if (peso > 20) {
            System.out.println("Woof! Woof!");
        } else if (peso > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}