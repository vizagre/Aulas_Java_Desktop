package br.com.didata.classesAbstratas;
public class Televisao extends Eletrodomestico {
    private int tamanho;
    private int canal;
    private int volume;

    public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	/* construtor classe abstrata */
	public Televisao(int tamanho, int voltagem) {
        super (false, voltagem); 
        this.tamanho = tamanho;
        this.canal = 0;
        this.volume = 0;
    }

    /* implementação dos métodos abstratos */
    public void desligar() {
        super.setLigado(false);
        setCanal(0);
        setVolume(0);
    }

    public void ligar() {
        super.setLigado(true);
        setCanal(3);
        setVolume(25);
    }

}
