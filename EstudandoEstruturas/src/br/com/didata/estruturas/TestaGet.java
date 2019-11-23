package br.com.didata.estruturas;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaGet {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		long tempo = get(arrayList);
		System.out.println(" ArrayList : " + tempo + "ms");

		tempo = get(linkedList);
		System.out.println(" LinkedList : " + tempo + "ms");
	}
	
	public static long get(List<Integer> lista) {
		int size = 10000;
		for (int i = 0; i < size; i++) {
			lista.add(i);
		}

		long inicio = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			System.out.println(lista.get(i));	
			//lista.get(i);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;
	}
}
