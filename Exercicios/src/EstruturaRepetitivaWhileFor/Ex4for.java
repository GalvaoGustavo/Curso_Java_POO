
/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
package EstruturaRepetitivaWhileFor;

import java.util.Scanner;

public class Ex4for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if(b==0) {
				System.out.println("Divisão impossível");
			}
			else {
				double var = a/b;
				System.out.printf("%.2f",var);
			}
		}
		
		
		sc.close();
	}

}
