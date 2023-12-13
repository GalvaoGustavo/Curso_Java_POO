package Ex4;

import java.util.Locale;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];

		
	
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número?: ");
			vetor[i] = sc.nextInt();
			
		}
		
		for (int i=0; i<n; i++) {
			if(vetor[i] < 0) {
				System.out.printf("NUMEROS NEGATIVOS: %d\n",vetor[i]);
			}
		}
		
		
		sc.close();

	}

}

