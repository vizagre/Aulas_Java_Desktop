package br.com.didata.Estudando_IO;
import java.io.IOException;
import java.io.OutputStream;

public class TesteOutput {
	public static void main(String[] args) throws IOException{
		OutputStream saida = System.out; 

		saida.write(68);
		saida.write(105);
		saida.write(100);
		saida.write(97);
		saida.write(116);
		saida.write(97);
		saida.write(13);
		saida.write(10);
		saida.flush();
	}
}
