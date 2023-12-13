package ex1;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digiter a quantidade de dados: ");
		int qt = sc.nextInt();
		
		System.out.printf("Digite os %d dados: %n",qt);
		double vetor[] = new double[qt]; 
		double soma = 0;
		for (int i=0; i<qt; i++) {
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		double total = soma /qt;
		
		System.out.printf("A media dos %d dados é: %.2f%n",qt,total);
		
		
		
		
		
		sc.close();

}
}