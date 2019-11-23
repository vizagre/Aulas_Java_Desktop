package br.com.didata.estruturas;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaAdicionaNoComeco {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();

		long tempo = adicionaNoComeco(al);
		System.out.println(" ArrayList : " + tempo + "ms");

		tempo = adicionaNoComeco(ll);
		System.out.println(" LinkedList : " + tempo + "ms");
	}
	public static long adicionaNoComeco(List<Integer> lista) {
		long inicio = System.currentTimeMillis();

		int size = 100000;

		for (int i = 0; i < size; i++) {
			lista.add(0,i);  // força inserção na 1ª posição
		}
		long fim = System.currentTimeMillis();
		return fim - inicio ;
	}
}
