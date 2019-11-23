package br.com.didata.estruturas;
import java.util.HashSet;

public class Conjuntos {
	public static void main(String[] args) {
        HashSet<String> cargos = new HashSet<String>();
        
        cargos.add("A"); 
        cargos.add("C");
        cargos.add("F");
        cargos.add("B");          
        
        System.out.println("Cargos adicionados: " + cargos);
        
	}

}