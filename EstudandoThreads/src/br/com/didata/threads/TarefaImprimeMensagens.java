package br.com.didata.threads;

public class TarefaImprimeMensagens implements Runnable {

	private String msg;

	public TarefaImprimeMensagens(String msg) {
		this.msg = msg;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i + " : " + this.msg);

			if (i % 500 == 0) {
				try {
					Thread.sleep(1000);
					System.out.println(i + " : Dormindo...");
				} catch (InterruptedException e) {

				}
			}
		}
	}
}
