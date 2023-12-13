package exercicios;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = maximo(a,b,c); // variavel maior - recebe metodo Maximo que confere o maior numero
		//com os parametros A - B -  C
		mostrarResultado(maior); // metodo 
			
		sc.close();
	}
	public static int maximo(int x, int s, int j) { // metodo recebe os 3 parametros ( a b c )
		int aux; // variavel local, so vai existir no escopo dessa funcao
		if (x > s && x > j) {
			aux = x;
		}
		else if ( s > j) {
			aux = s;
		}
		else {
			aux = j;
		}
		return aux;
	}
	public static void mostrarResultado(int valor) { // tipo void ( vazio ) simplesmente faz uma açao, sem retornar algo
		// para ser reparoveitado, por isso void.
		System.out.println("Maior = "+valor);
	}
}
