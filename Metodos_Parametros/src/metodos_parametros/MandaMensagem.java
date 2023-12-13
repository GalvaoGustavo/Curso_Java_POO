package metodos_parametros;

public class MandaMensagem {
	public void enviarMensagem() {
		System.out.println("Bem vindo ao mundo da programação, Dev. Galvão");
	}
	public void mandaBoasVindas(String nome) {
		System.out.println("Bem vindo ao curso JAVA " + nome+".");
	}
	public void enviarDuvida() {
		System.out.println("Vamos te ajudar com todas as dúvias.");
	}
	public void dadosLinguagem(String linguagem, int nota) {
		System.out.printf("Linguagem: %s, Nota: %d \n",linguagem,nota);
	}
	
}
