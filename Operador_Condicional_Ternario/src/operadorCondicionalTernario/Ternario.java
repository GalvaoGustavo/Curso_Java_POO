package operadorCondicionalTernario;

import java.util.Locale;
import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = 0;
// double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05; PODERIA JA DECLARAR VARIAVEL COM CALCULO
		desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("O valor do desconto é: "+desconto);
		sc.close();
		
		
	}

}
