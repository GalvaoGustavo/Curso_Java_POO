package Exercicios;

import java.util.Scanner;

public class notaSwtich {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String graducao;
		Double nota = sc.nextDouble();
		
		
		if (nota >= 7) {
			graducao = "A";
		}
		else if(nota <7 && nota >=5) {	
			graducao = "B";
		}
		else if ( nota <5 && nota >= 0) {
			graducao = "C";
		}
		else {
			graducao = "D";
		}
		
		switch (graducao) {
		case "A":
			System.out.println("Aprovado");
			break;
		case "B":
			System.out.println("Recuperação");
			break;
		case "C":
			System.out.println("Reprovado");
			break;
		case "D":
			System.out.println("Inválido");
			break;
		}
		
	}
		
}
		



