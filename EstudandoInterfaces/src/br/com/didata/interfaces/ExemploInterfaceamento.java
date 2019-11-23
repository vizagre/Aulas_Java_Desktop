package br.com.didata.interfaces;

public class ExemploInterfaceamento {
    public static void main(String[] args) {
        ModeloTV001 tv1 = new ModeloTV001(21,110);
        ModeloSDX tv2 = new ModeloSDX (42,110);

        tv1.ligar();
        tv2.ligar();

        System.out.print("TV1 - modelo " + tv1.MODELO + " está ");
        System.out.println(tv1.isLigada() ? "ligada" : "desligada");
        System.out.print("TV2 - modelo " + tv2.MODELO + " está ");
        System.out.println(tv2.isLigada() ? "ligada" : "desligada");

        tv1.aumentarVolume(5);
        System.out.println(tv1.getVolume());
        
        tv2.aumentarVolume(10);
        System.out.println(tv2.getVolume());
        
        // ambas as TVs estão ligadas e vamos desligá-las
        System.out.println("Desligando modelo " + tv1.MODELO);
        tv1.desligar();
        System.out.println("Desligando modelo " + tv2.MODELO);
        tv2.desligar();
    }
}
