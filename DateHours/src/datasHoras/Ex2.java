package datasHoras;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//CONVERTER DATA HORA GLOBAL PARA LOCAL, PRECISA DO TIMEZONE
		
		LocalDate d04 = LocalDate.parse("2023-12-07");
		LocalDateTime d05 = LocalDateTime.parse("2023-12-07T10:28:50");
		Instant d06 = Instant.parse("2023-12-07T10:28:50z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println("R1 = " + r1);
		System.out.println("R2 = " + r2);
		System.out.println("R3 = " + r3);
		System.out.println("R4 = " + r4);
		System.out.println();
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mes = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println();
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 hora = " + d05.getMinute());

		




	}

}
