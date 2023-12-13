package ex12;
//Problema "mais_velho" 

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce vai digitar?");
		int qt = sc.nextInt();
		
		String nome[] = new String[qt];
		int idade[] = new int[qt];
		
		for (int i =0; i<qt; i++) {
			System.out.printf("Digite os dados da %dª pessoa: \n",i+1);
			System.out.print("Nome:");
			nome[i]=sc.next();
			System.out.print("Idade:");
			idade[i]=sc.nextInt();
		}
		int mIdade=idade[0];
		int mVelho=0;
		
		for (int i =0; i<qt; i++) {
			if(mIdade < idade[i]) {
				mIdade = idade[i];
				mVelho=i;
			}
		}
		System.out.printf("PESSOA MAIS VELHA É: %s",nome[mVelho]);
		
		
		
		
		
		sc.close();
	}

}
