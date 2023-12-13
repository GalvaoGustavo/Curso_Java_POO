package arrays;

import java.util.Arrays;

public class ArraysJava {

	public static void main(String[] args) {
		double [] valores = new double [6]; // CRIANDO ARRAY 6 VALORES - opçao 1
		
		// PREENCHER OS ARRAYS
		valores [0] = 6.0;
		valores [1] = 7.5;
		valores [2] = 8.2;
		valores [3] = 2.3;
		valores [4] = 1.5;
		valores [5] = 4.9;
		
		String [] letras = { "A", "B", "C","D","X","Z" }; // CRIANDO ARRAY 6 VALORES - opçao 2
		for (int i = 0; i < letras.length; i++) {
			System.out.print(letras[i]);
		}
		System.out.print("\n");
		System.out.print(Arrays.toString(letras));
		System.out.print("\n");
		

		//ACESSANDO O QUINTO ELEMENTO ( POSIÇÃO 4 )
		System.out.println("Elemento 5 do array é: "+valores [4]);
		//System.out.println(valores[0]+[1]);

		//ALTERANDO OS VALORES DE 2 POSIÇÕES DO ARRAY:
		valores [0]= 2.3;
		valores [4]= 7.1;

		//ACESSANDO ELEMENTOS ALTERADOS 
		System.out.println("Elemento alterado posição 0 para: "+valores[0]);
		System.out.println("Elemento alterado posição 4 para: "+valores[4]);

		//MOSTRAR TODOS OS ELEMENTOS DO ARRAY - OPÇÃO 1 
		for (double i: valores){
			System.out.println(i);
		}
		
		// //MOSTRAR TODOS OS ELEMENTOS DO ARRAY - OPÇÃO 2
		for (int i = 0; i < valores.length; i++) {
		System.out.println(valores[i]);		}
		
		// SOMAR OS ELEMTNOS COM LOOP FOR:
		double total = 0;
		for (int i = 0; i < valores.length; i++) {
			total += valores[i];
		}
		System.out.println("O total é: " + total);
		
	
		
		
	}

}
