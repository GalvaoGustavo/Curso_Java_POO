package metodos_parametros;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nomeAluno;
		String linguagem;
		int nota;
		
		Scanner entrada = new Scanner(System.in);

		MandaMensagem oi = new MandaMensagem();
		
		System.out.println("Digite seu nome: ");
		nomeAluno = entrada.nextLine();
		
		System.out.println("Digite a Linguagem desejadaa: ");
		linguagem = entrada.nextLine();
		
		System.out.println("Dugute a nota da linguagem: ");
		nota = entrada.nextInt();
		
		oi.mandaBoasVindas(nomeAluno);
		oi.enviarMensagem();
		oi.enviarDuvida();
		oi.dadosLinguagem(linguagem,nota);
		
		
		entrada.close();

	}

}
