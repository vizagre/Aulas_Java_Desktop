package br.com.didata.equalsEhashCode;

public class Produto {

	private String sku;
	private String nome;
	
	public Produto(String sku, String nome) {
		this.sku = sku;
		this.nome = nome;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Sobrescrevendo o metodo toString (classe object) para exibir informações do objeto
	
	@Override
	public String toString() {
		return "Produto [sku=" + sku + ", nome=" + nome + "]";
	}

	/* Implementar os métodos hashCode e equals irá permitir a comparação não só do objeto (referencia), mas
	   também o conteúdo. No nosso exemplo, basta comparar o atributo SKU para diferenciar os produtos.
	*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sku == null) ? 0 : sku.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (sku == null) {
			if (other.sku != null)
				return false;
		} else if (!sku.equals(other.sku))
			return false;
		return true;
	}
	
}
