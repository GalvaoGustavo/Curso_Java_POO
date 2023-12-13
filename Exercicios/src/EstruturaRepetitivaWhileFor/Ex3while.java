/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */

package EstruturaRepetitivaWhileFor;

import java.util.Scanner;

public class Ex3while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int coordenada1 = sc.nextInt();
		int coordenada2 = sc.nextInt();
		
		while(coordenada1 != 0 && coordenada2 != 1 ) {
			if( coordenada1 > 0 && coordenada2 > 0) {
				System.out.println("Primeiro");
			}
			else if(coordenada1 < 0 && coordenada2 > 0){
				System.out.println("Segundo");
			}
			else if(coordenada1 < 0 && coordenada2 < 0){
				System.out.println("Terceiro");
			}
			else {
				System.out.println("Quarto");
			}
			
			coordenada1 = sc.nextInt();
			coordenada2 = sc.nextInt();

				
		}
		sc.close();
	}
		
}


