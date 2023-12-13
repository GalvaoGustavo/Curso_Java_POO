package estruturaRepeticaoWhile;
import java.util.Scanner;
public class EstruturaRepeticaoWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		
		System.out.println("Digite seu nome ou S para sair");
		nome = sc.nextLine().toUpperCase();
		while(!nome.equals("S")){ //NECESSARIO .EQUALS PARA COMPARACAO DE STRING -> !NOME PARA GERAR NEGACAO
			System.out.printf("Bem vindo: %s\n",nome);
			System.out.println("Digite seu nome ou S para sair");
			nome = sc.nextLine().toUpperCase();
		} 
		System.out.println("Programa encerrado, pai");
		

	}

}
