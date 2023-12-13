package operadorIncrementoDecremento;

public class OperadorIncrementoDecremento {

	public static void main(String[] args) {
		int number = 10;
		int result = 0;
		
		System.out.println("Valores:");
		result = number++; //INCREMENTO VEM APOS
		System.out.println("Numnero apos incremento: "+number);
		System.out.println("Resultado apos incremento: "+result);
		
		number = 10;result = 0;
		
		result = ++number; // INCREMENTO VEM IMBUTIDO NO VALOR
		System.out.println("Numero apos incremento: "+number);
		System.out.println("Resultado apos incremento: "+result);
		
		number = 10;result = 0;
		number++;
		result = number++;
		System.out.println("Numero apos incremento: "+number);
		System.out.println("Resultado apos incremento: "+result);
	}

}
