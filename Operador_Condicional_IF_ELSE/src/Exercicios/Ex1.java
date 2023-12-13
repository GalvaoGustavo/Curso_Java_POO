package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Digite o numero para o dia da semana: \n");
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda");
		System.out.println("3 - Terça");
		System.out.println("4 - Quarta");
		System.out.println("5 - Quinta");
		System.out.println("6 - Sexta");
		System.out.println("7 - Sábado");
		dia = sc.nextInt();
		
		if (dia == 1) {
			System.out.println("Hoje é: Domingo");			
		}
		else if(dia ==2) {
		System.out.println("Hoje é: segunda");	
		}		
		else if(dia ==3) {
		System.out.println("Hoje é: terça");	
		}
		else if(dia ==4) {
			System.out.println("Hoje é: quarta");	
		}
		else if(dia ==5) {
			System.out.println("Hoje é: quinta");	
		}
		else if(dia ==6) {
			System.out.println("Hoje é: sexta");	
		}
		else if(dia ==7) {
			System.out.println("Hoje é: sabado");	
		}
		else {
			System.out.println("Dia inválido");
					
		}	
		
		
		sc.close();
}		
}
