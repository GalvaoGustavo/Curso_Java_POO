/* CONSTANTE É UM TIPO ESPECIAL DE VARIAVEL CUJO VALOR, UMA VEZ DEFINIDO NO CODIGO NAO PODE
 * MAIS SER ALTERADO DURANTE O PROBLEMA.
 * DECLARAMOS UMA CONSTANTE USANDO PALAVRA CHAVE -> FINAL
 * EX: public static final int TAXA = 20; 
 * OBS: SEMPRE DECLARAMOS UMA CONSANTE COM LETRA MAISCULA (BOA PATRICA)
 * PUBLIC -> SIGIFNICA QUE AS CONSTANTES ESTARAM DISPONIVEIS EM TODO O PROJETO.
 * STATIC -> INDICA QUE SOMENTE EXISTIRA UMA COPIA DA CONTANTE
 */


package constantes;

import java.util.Scanner;

public class Constante {
	// CONSTANTE DECLARADA COMO PRIVATE ANTES DO MAIN. USADO FINAL PARA DECLARAR CONSTANTE, VALOR FIXO
	private static final double LARGURA = 10.0;	 

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // scanner para imput
		
		System.out.println("Entre com o comprimento: "); // frase para o imput
		double comprimento = entrada.nextDouble(); //leitura do input comprimento declarando que é double.
		
		double area = calculaArea(LARGURA,comprimento); // VARIAVEL DECLARA QUE CHAMA O  METODO DE CALCULAAREA QUE SERA CRIADO 
		//LOGO MAIS. METODO PRECISA SER CRIADO FORA DO MAIN
		System.out.println("A área é: " + area);
	}
	private static double calculaArea(double largura, double comprimento) { // CRIAÇAO DO METODO CALCULAAREA P/ RECEBER LARGURA+COMPRIMENTO
		//PRECISA DECLARAR OS ATRIBUTOS
		return largura * comprimento;
	}

}
