package Ex7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,numPar=0;
		
		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite o %dº numero\n",i+1);
			vetor[i]=sc.nextInt();
		}
		System.out.println("Numeros Pares: ");
		for(int i=0; i<n; i++) {
			if(vetor[i]%2==0) {
				System.out.printf("%d ",vetor[i]);	
			numPar++;
		}
			
		}
		System.out.println();
		System.out.printf("\nQuantidade de pares: %d",numPar);
		
		
		sc.close();

	}

}
