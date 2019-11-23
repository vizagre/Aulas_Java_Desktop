package br.com.didata.estruturas;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaAdicionaNoFinal {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		long tempo = adicionaNoFinal(arrayList);
		System.out.println("ArrayList : " + tempo + "ms");

		tempo = adicionaNoFinal(linkedList);
		System.out.println("LinkedList : " + tempo + "ms");
	}
	public static long adicionaNoFinal(List<Integer> lista) {
		long inicio = System.currentTimeMillis();

		long size = 1000000;
		for (int i = 0; i < size; i++) {
			lista.add(i);
		}

		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
}
