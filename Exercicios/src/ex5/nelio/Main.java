package ex5.nelio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conversor conversao = new Conversor();
		
		System.out.print("Qual o valor do dollar?");
		double dolar = sc.nextDouble();
		System.out.print("Quantos dolares voce vai comprar?");
		double real = sc.nextDouble();
		//System.out.println("Voce vai pagar: "+ conversao(dolar,real));
		System.out.println(conversao.conversao(dolar, real));
		
		
		
		
		sc.close();
	}

	
	



}
