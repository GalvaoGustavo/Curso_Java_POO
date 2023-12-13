package Exercicios;

import java.util.Scanner;

public class elseIfNota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String graducao;
		double nota = sc.nextDouble();
		
		
		if (nota >= 7) {
			System.out.println("Aaluno aprovado");
		}
		else if(nota <7 && nota >=5) {	
			System.out.println("Aaluno em recuperação");
		}
		else if ( nota <5 && nota >= 0) {
			System.out.println("Aluno reprovado");
		}
		else {
			 System.out.println(" Nota inválida ");
		}
		
	}
}
