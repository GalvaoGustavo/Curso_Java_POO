//estrutura opcional ao if else

package operadorCondicionalTernario;

public class OperadorCondicionalTernario {

	public static void main(String[] args) {
		int a = 12;
		int c = 19;
		String b;
		
		
		b = (a == 5) ? "a é igual a 5": "a é diferente de 5"; // ANTES DE : OPÇAO TRUE, DEPOIS DE : OPÇAO FALSE
		System.out.println("Resultado: "+b);
		
		b = (c == 5) ? "c é igual a 5": "c é diferente de 5";
		System.out.println("Resultado: "+b);
		
		a = 19;
		b = (a > c) ? "A é maior que C": (a < c ) ? "A é menor que C": "A é = a C"; // 2 COMPARAÇOES VERDADEIRA ANTES DO SENAO
		System.out.println("Resultado: "+b);
		

		
	}

}
