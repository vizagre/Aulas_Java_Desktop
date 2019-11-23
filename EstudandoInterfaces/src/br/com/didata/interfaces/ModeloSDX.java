package br.com.didata.interfaces;

public class ModeloSDX extends TelevisaoInterface implements ControleRemoto {
    public final String MODELO = "TV-SDX";

    public ModeloSDX(int tamanho, int voltagem) {
        super(tamanho, voltagem);
    }

    public void desligar() {
        System.out.println("Tchau!");
        super.setLigada(false);
    }

    public void ligar() {
        super.setLigada(true);
    }

    public void aumentarVolume(int taxa) { 
    	System.out.println("Aumentando volume...");
    	super.setVolume(taxa);
    }
    
    public void diminuirVolume(int taxa) {}
    public void mudarCanal(int canal) { }
}
