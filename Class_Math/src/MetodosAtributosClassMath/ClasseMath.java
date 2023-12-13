package MetodosAtributosClassMath;

public class ClasseMath {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		double z = 69.69;
		
		System.out.println("Pi vale: " + Math.PI);
		System.out.println("O valor absoluto de X é: " + Math.abs(x));
		System.out.println("O maior valor entre X e Y é: " + Math.max(x, y));
		System.out.println("O menor valor entre X e Y é: " + Math.min(x, y));
		System.out.println("A raiz quadrada de z é: " + Math.sqrt(z));
		System.out.println("Z arredondado para cima é: " + Math.ceil(z));
		System.out.println("Número aleatório gerado: " + Math.random()); // ENTRE 0 E 1, RANDOM
		System.out.println("A hipotenuisa de X e Y é: " + Math.hypot(x, y));
	}

}
