package br.com.didata.estudoArray;

class Argumentos {
    public static void main(String[] args) {
  
		if (args[0].contains("W")){
			System.out.println("Executar programa word");
		} else if (args[0].contains("E")){
			System.out.println("Executar programa excel");
		}
		
    }
}