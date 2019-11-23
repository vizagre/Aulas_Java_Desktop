package br.com.didata.interfaces;

public class ModeloTV001 extends TelevisaoInterface implements ControleRemoto {
    public final String MODELO = "TV001";

    public ModeloTV001(int tamanho, int voltagem) {
    	super(tamanho, voltagem);
	}

	public void desligar() {
        super.setLigada(false);
    }

    public void ligar() {
        super.setLigada(true);
    }

    public void aumentarVolume(int taxa) { 
    	super.setVolume(taxa);
    	
    }
    
    public void diminuirVolume(int taxa) { }
    public void mudarCanal(int canal) { }

}
