package IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class Ex88 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double minutos = sc.nextDouble();
		double valor = 50;
		
		if (minutos <= 100) {
			System.out.println("Valor a ser pago é R$50");
		}
		else {
			valor += (minutos - 100) * 2;
			System.out.printf("O valor a ser pago será: R$ %.2f",valor);
		}
		
		sc.close();
	}

}
