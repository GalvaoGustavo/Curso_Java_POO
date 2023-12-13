
/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

package IF_ELSE;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int hInicial;
		 int hFinal;
		 int duracao = 0;
		 
		 System.out.println("Digite a hora inicial do jogo:");
		 hInicial = sc.nextInt();
		 System.out.println("Digite a hora final do jogo");
		 hFinal = sc.nextInt();
		 
		 
		 if (hInicial < hFinal) {
			duracao = hFinal - hInicial;
		 } 
		 else {
			 duracao = (24 - hInicial + hFinal);
		 }
		
		 System.out.printf("O jogo durou:" + duracao + " horas.");
		 sc.close();

	}
}
