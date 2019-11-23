package br.com.didata.estruturas;

import java.util.HashSet;

public class Collection {

	public static void main(String[] args) {
		
		HashSet<String> colecao = new HashSet<String>();

		colecao.add("Didata Educacional");
		colecao.add("Java e Orientação a Objetos");
		colecao.add("a");
		colecao.add("b");		
		colecao.add("c");		
		
		for (String x : colecao) {
			System.out.println(x.toUpperCase());
		}
	}
	
}
