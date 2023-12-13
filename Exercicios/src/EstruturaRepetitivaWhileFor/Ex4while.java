/*
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */
package EstruturaRepetitivaWhileFor;
import java.util.Scanner;

public class Ex4while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int produto = sc.nextInt();
		
		while (produto !=4) {
			
			if (produto == 1) {
				alcool += 1;
			}
			else if(produto ==2) {
				gasolina += 1;
			}
			else if (produto ==3) {
				diesel += 1;
			}
			produto = sc.nextInt();
		}
		
		System.out.println("Muito obrigado!");
		System.out.printf("Alcool: %d\n",alcool);
		System.out.printf("Gasolina: %d\n",gasolina);
		System.out.printf("Diesel: %d\n",diesel);
		sc.close();
	}

}
