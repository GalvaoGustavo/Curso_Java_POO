package ex;

public class MenorMaior {

	private static int i;

	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
		
		int menor = numeros[0];
		int maior = numeros[0];
		double media = 0;
		
		for (int i=0; i<numeros.length;i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
			else if(menor < numeros[i]) {
				menor = numeros[i];
			}
			media = media + numeros[i];
		}
		System.out.println("maior:"+maior);
		System.out.println("Menos:"+menor);
		System.out.println("Média:"+media/numeros.length);
}
}
		
