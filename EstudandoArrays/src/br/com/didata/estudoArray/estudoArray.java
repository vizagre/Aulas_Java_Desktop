package br.com.didata.estudoArray;

import java.util.Arrays;
public class estudoArray {
 public static void main(String[] args) {
	
	 String[] estados = new String[] {"Rio", "Acre", "Manaus"};
	 Arrays.sort(estados);

	 for (String estado : estados) {
	     System.out.println(estado);
	 }
	 
	 String[] estadosDuplicados = Arrays.copyOf(estados, 5);
	 estadosDuplicados[3] = "Novo item (3)";
	 estadosDuplicados[4] = "Novo item (4)"; 
	 
	 Arrays.sort(estadosDuplicados);

	 for (String estadoD : estadosDuplicados) {
	     System.out.println(estadoD);
	 }
	 

 }
	
}
