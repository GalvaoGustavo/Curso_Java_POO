package Ex6;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n,menores = 0;
		double alturaMedia = 0,mediaIdades = 0;
		
		
		System.out.println("Quantas pessoas serão digitadas?");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];	
		
		
		for (int i=0; i<n; i++){
			System.out.printf("Dados da %dª pessoa: \n",i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i]=sc.nextInt();
			System.out.print("Altura: ");
			alturas[i]=sc.nextDouble();
		}
		
		for (int i=0; i<n; i++) {
			alturaMedia += alturas[i];
		}
		for (int i=0; i<n; i++) {
			if(idades[i] < 16){
			menores ++;	
			}
		}
		
		
		mediaIdades = ((double)menores / n) * 100;	
		System.out.println();
		System.out.printf("Altura média: %.2f\n",(alturaMedia /n ));
		System.out.printf("Pessoas com menos de 16 anos: %.1f %%\n",mediaIdades);
		System.out.printf("Nomes dos menores: ");
		for (int i=0; i<n; i++) {
			if(idades[i] < 16){
			System.out.printf(nomes[i]);
			System.out.println();
			}
		}
		
		sc.close();
	}

}
