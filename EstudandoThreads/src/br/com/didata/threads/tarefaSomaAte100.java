package br.com.didata.threads;

public class tarefaSomaAte100 implements Runnable {

	int soma;
	
	public void run() {
	
		for (int i = 0; i <= 100; i++) {
			soma += i;
			System.out.println(soma);
		}

	}	
	
}


