package ex13;
//Problema "aprovados" 

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos vao ser digitados? ");
		int qt = sc.nextInt();
		
		String nome[] = new String[qt];
		double nota1[] = new double[qt];
		double nota2[] = new double[qt];
		
		

		for (int i=0;i<qt;i++) {
		System.out.printf("Digite o nome, primeira e segunda nota do %dº aluno: \n",i+1);
		sc.nextLine();
		nome[i] = sc.nextLine();
		nota1[i] = sc.nextDouble();
		nota2[i] = sc.nextDouble();
		
		}
		System.out.println();
		System.out.println("Alunos aprovados: ");
		for (int i=0;i<qt;i++) {
			double media = ((nota1[i]+nota2[i])/2);

			if(media >= 6.0) {
				System.out.printf("%s\n",nome[i]);
			}
		}
		
		
		
		
		
		sc.close();
	}

}
