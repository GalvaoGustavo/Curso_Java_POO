package Ex8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
				
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i]=sc.nextDouble();
		}
		
		double maior = vetor[0];
		int posMaior = 0;
		
		for(int i=0; i<n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posMaior = i;
			}
		}
		System.out.printf("Maior valor: %.1f%n",maior);
		System.out.printf("Posição do maior valor: %d",posMaior);
		
		
		sc.close();
	}

}
