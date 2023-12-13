package Ex9;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter cada vetor?");
		int qt = sc.nextInt();
		
		int[] vetA = new int[qt];		
		System.out.println("Digite os valores do vetor A");
		for(int i=0;i<qt;i++) {
			vetA[i]=sc.nextInt();
		}
		
		int[] vetB= new int[qt];
		System.out.println("Digite os valores do vetor B");
		for(int i=0;i<qt;i++) {
			vetB[i]=sc.nextInt();
		}
		
		int somaVet = 0;
		System.out.println("Vetor Resultante: ");

		for(int i=0;i<qt;i++) {
			somaVet = vetA[i]+vetB[i];
			System.out.println(somaVet);

		}
		
		
		
		
		
		
		sc.close();

	}

}
