//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

package IF_ELSE;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Numero par");
		
		}
		else {
			System.out.println("Número impar");
		}
		sc.close();
		
	}

	}

