//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package IF_ELSE;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("Não negativo");
		}
		else if(numero == 0) {
			System.out.println("Número neutro");
		}
		else {
			System.out.println("Número negativo");
		}
		sc.close();
		
	}

}
