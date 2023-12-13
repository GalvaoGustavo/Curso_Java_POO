/*
 * O BLOCO DE COMANDO EXECUTA PELO MENOS UMA VEZ, POIS A CONSIÇÃO É VERIFICADA NO FINAL.
 */

package doWhile;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp; // variavel declara fora para ser usada em todo o programa. 
		// while nao iria conseguir utilziar a variavel criada em do
		
		do { // IRA REALZIAR PELO MENOS 1X ANTES DE FAZER A CHECAGEM DO WHILE.	
		System.out.println("Digite a temperatura em Celsius: ");
		double C = sc.nextDouble(); //leitura do input acima
		double F = 9*C / 5 + 32;	
		System.out.printf("Equivalente em Fahrenheit: %.2f%n",F);
		System.out.println("Deseja repetir (s/n)?");
		resp = sc.next().charAt(0); // .next para ler apenas o proximo caractere / charAt(0) leitura da posiçao 0
		}while (resp != 'n');// checagem de respetição para saber se irá repetir o programa.
		// 'n' aspas simples por se tratar apenas de 1 caractere
		System.out.println("Programa finalizado.");
			
		sc.close();
	}

}
