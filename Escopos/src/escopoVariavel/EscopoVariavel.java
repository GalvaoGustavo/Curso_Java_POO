/*
 * UMA VARIAVEL NAO PODE SER UTILIZADA SE NAO FOR INICIALIZADA.
 * ESCOPO DE UMA VARIAVEL É A REGIAO DO PROGRAMA ONDE A VARIAVEL É VALIDA, OU SEJA ONDE PODE SER USADA.
 * ESCOPO -> PRECISA SER DECLARADA FORA DA ESTRUTURA
 * 
 */
package escopoVariavel;

public class EscopoVariavel {

	public static void main(String[] args) {
		double price = 400.00;
		
		double desconto;
		
		if (price > 200.00) {
			desconto = price * 0.1; // VARIAVEL PODE NAO SER INICIALIZADA, PRECISA GARANTIR INICIALIZAÇAO COM ELSE
		}
		else { // GARANTE QUE A VARIAVEL SEJA UTILIZADA NO IF OU NO ELSE -> SE APAGAR NAO PODE UTILIZAR VARIAVEL
			desconto = 0;
		}
		System.out.println(desconto);
	}

}
