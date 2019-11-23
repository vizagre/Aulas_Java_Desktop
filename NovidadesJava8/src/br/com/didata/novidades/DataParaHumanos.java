package br.com.didata.novidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DataParaHumanos {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println("Data atual: " + hoje); // (formato ISO-8601)

		System.out.println("----------------");

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Data atual formatada: " + hoje.format(formatador));

		System.out.println("----------------");
	
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatador1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("pt","br"));

		System.out.println("Data e hota formatada: " + agora.format(formatador1));  
		
		System.out.println("----------------");
		
		LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
		LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);

		Period periodo = Period.between(homemNoEspaco, homemNaLua);

		System.out.printf("%s anos, %s mês e %sdias", periodo.getYears(),
				periodo.getMonths(), periodo.getDays());

	}

}
