package datasHoras;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex3 {

	public static void main(String[] args) {
		// CALCULOS COM DATA E HORA

		
		LocalDate d04 = LocalDate.parse("2023-12-07"); // ano + mes + dia 
		LocalDateTime d05 = LocalDateTime.parse("2023-12-07T10:28:50"); // anos + mes + dia + hora + minuto + segundos 
		Instant d06 = Instant.parse("2023-12-07T10:28:50z");
	
		
		
		LocalDate pastWeekLocalDate = d04.minusDays(7); //instanciando uma nova data = d04 subtraindo 7 dias.
		LocalDate nextWeekLocaldate = d04.plusDays(7); //instanciando uma nova data d04 adicionando 7 dias.
		LocalDate nextYearsLocaldate = d04.plusYears(7); //instanciando uma nova data d04 adicionando 7 anos.
		System.out.println("pastWeekLocalDate= " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate= " + nextWeekLocaldate);
		System.out.println("nextYearsLocaldate= " + nextYearsLocaldate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); //instanciando uma nova data+horas = d05 subtraindo 7 dias.
		LocalDateTime nextWeekLocaldateTime = d05.plusDays(7); //instanciando uma nova data+horas d05 adicionando 7 dias.
		LocalDateTime nextYearsLocaldateTime = d05.plusYears(7); //instanciando uma nova data+horas d05 adicionando 7 anos.
		System.out.println("pastWeekLocalDateTime= " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime= " + nextWeekLocaldateTime);
		System.out.println("nextYearsLocaldateTime= " + nextYearsLocaldateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		
		System.out.println("pastWeekInstant= " + pastWeekInstant);
		System.out.println("nextWeekInstant= " + nextWeekInstant);

		
		


	}

}
