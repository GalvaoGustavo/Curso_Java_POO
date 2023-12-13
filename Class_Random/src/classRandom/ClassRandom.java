package classRandom;
import java.util.Random;
public class ClassRandom {

	public static void main(String[] args) {
		Random aleatorio = new Random(); //criando objeto da classe 'ALEATORIO'
//		int valor = aleatorio.nextInt(30)+1; // criando variavel e atribuindo o random a ela.
											// (30) permite gerar numero entre 0 ate 30. / +1 ATE 30
											// () vazio gera numero aleatorio, possitivo ou negativo
		float valor = aleatorio.nextFloat()*100 ; // NUMERO FLOAT GERADO-> *100 IRA CRIAR ENTRE 0 E 100
		System.out.println("Número gerado aleatoriamente: "+valor);
	}

}
