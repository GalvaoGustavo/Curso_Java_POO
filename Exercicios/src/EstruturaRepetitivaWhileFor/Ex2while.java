/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */
package EstruturaRepetitivaWhileFor;

import java.util.Scanner;

public class Ex2while {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int senha = sc.nextInt();
		int contador = 1;
		while(senha != 2002) {
			contador = contador +1;
			System.out.println("Senha inválida, tente novamente");
			senha = sc.nextInt();
			
		}
		System.out.printf("Acesso permitido após: %d tentativas.",contador);
		sc.close();

	}

}
