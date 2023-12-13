package Ex11;
//Problema "media_pares" 

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qt,somaP=0,media=0;	
		
		System.out.println("Quantos elementos vai ter o vetor?");
		qt = sc.nextInt();
		
		int[] vetor = new int[qt];
		
		for(int i=0;i<qt;i++) {
		System.out.println("Digite um numero:");
		vetor[i]=sc.nextInt();
		}
		
		for(int i=0;i<qt;i++) {
			if(vetor[i]%2==0) {
				somaP+=vetor[i];
				media++;
			}
		}
		if(media==0) {
			System.out.println("Nenhum numero par.");
		}
		else {
	       double mediapares = somaP / media;

			System.out.printf("Media dos pares: %.1f",mediapares);
		}
		
		sc.close();

	}

	}

		
