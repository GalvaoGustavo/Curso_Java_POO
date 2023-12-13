package ex3.nelio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		
		System.out.printf("Nota FINAL: %.2f%n",aluno.notas());
		if (aluno.notas() > 60 ) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("Perdeu por apenas: %.2f",aluno.analise()," pontos.");
		}
		
		
		
		
		sc.close();
	}

}
