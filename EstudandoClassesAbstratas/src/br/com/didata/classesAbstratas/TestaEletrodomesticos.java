package br.com.didata.classesAbstratas;
public class TestaEletrodomesticos {

    public static void main(String[] args) {
        Televisao tv1 = new Televisao(29, 110);
        Radio radio1 = new Radio(110);

        /*
         * chamando os m�todos abstratos implementados
         * dentro de cada classe (TV e Radio)
         */
        
        tv1.ligar();
        radio1.ligar();

        System.out.print("Neste momento a TV est� ");
        System.out.println(tv1.isLigado() ? "ligada" : "desligada");
        System.out.print("e o R�dio est� ");
        System.out.println(radio1.isLigado() ? "ligado." : "desligado.");
    }
}
