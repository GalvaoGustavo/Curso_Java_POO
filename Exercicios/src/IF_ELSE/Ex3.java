/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente
 */
package IF_ELSE;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b,a;
		
		System.out.println("Digite o 1º número: ");
		a = sc.nextInt();
		System.out.println("Digite o 2º número: ");
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0){
			System.out.printf("O número:%d é multiplos do:%d",a,b);
		}
		else {
			System.out.println("Os números não são multiplos.");
		}
		
	}
}


