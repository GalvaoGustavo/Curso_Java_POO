package OperadorCondicionalIfELse;
import java.util.Scanner;

public class CondificionalIFELSE {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double livroLinux = 0;
		double livroJava = 0;
		
		System.out.println("Entre com o preço do livro de linux: ");
		livroLinux = sc.nextDouble();
		
		System.out.println("Entre com o preço do livro de java: ");
		livroJava = sc.nextDouble();
		
		double total = livroLinux + livroJava;	
		
		if (livroLinux == 10) {
			System.out.println("O livro Linux está quase de graça! \n");
		}
		
		if (total <= 120) {
			System.out.println("O preço está bom!");
		}
		else {
			System.out.println("Livros muitos caros.");
		}
		if (livroLinux < livroJava) {
			System.out.println("Livro linux mais barato");
		}
		else if (livroLinux > livroJava) {
			System.out.println("Livro linux mais caro!");
		}
		else {
			System.out.println("Livros com o mesmo preço!");
		}
		}
	}



