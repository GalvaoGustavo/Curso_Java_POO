package estruturaRepeticaoFor;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0; // contador de soma de numeros
		
		for (int i=0; i<n; i++) { //int i=0 (precisa declarar o ponto inicial)i<n(ponto inicial menor que a variavel
								//i++ recebe um incremento a cada loop
			n = sc.nextInt();//variavel N temporaria ; apos entrar no loop for, para poder somar ao contador
			soma += n; // contador recebe ele mesmo + novo input (n)
		}
		System.out.println(soma);
		sc.close();
	}

}
