/*
 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */
package IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		double valor = sc.nextDouble();
		
		if(valor < 0 || valor > 100) {
			System.out.println("Fora do intervalo");
		}
		else if(valor <= 25){
			System.out.println("Intervalo de tempo: [0,25]");
		}
		else if(valor <= 50) {
			System.out.println("Intervalo de tempo: [25,50]");
		}
		else if(valor <= 75) {
			System.out.println("Intervalo de tempo: [50,75]");
		}
		else {
			System.out.println("Intervalo de tempo: [75,100]");
		}
		
		sc.close();
		
	}

}
