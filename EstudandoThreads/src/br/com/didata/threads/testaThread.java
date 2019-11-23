package br.com.didata.threads;

public class testaThread {

	public static void main(String[] args) throws InterruptedException {
		TarefaImprimeMensagens tarefa1 = new TarefaImprimeMensagens("Java");
		TarefaImprimeMensagens tarefa2 = new TarefaImprimeMensagens("Curso");
		//tarefaSomaAte100 tarefa3 = new tarefaSomaAte100();		

		Thread thread1 = new Thread(tarefa1);
		Thread thread2 = new Thread(tarefa2);
		//Thread thread3 = new Thread(tarefa3);

		thread1.start();		
		thread2.start();
		//thread3.start();	

		thread2.join();
		thread2.getName();
	}
}
