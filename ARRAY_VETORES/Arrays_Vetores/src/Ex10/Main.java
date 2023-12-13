package Ex10;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qt,soma=0;
		double media=0,abaixoMedia;
		
		System.out.println("Quantos elementos vai ter o vetor?");
		qt = sc.nextInt();
		
		double[] vet = new double[qt];
		
		for (int i=0;i<qt;i++) {
			System.out.printf("Digite o %dº número: ",i+1);
			vet[i]=sc.nextDouble();
			media +=vet[i];
		}
		media = media / qt;
		System.out.printf("Media do vetor: %.1f\n",media);
		
		System.out.println("Elementos abaixo da media");
		for(int i=0;i<qt;i++) {
			if(vet[i] < media) {
				System.out.printf("%.1f \n",vet[i]);
			}
		}
		
		
		sc.close();
	}

}
