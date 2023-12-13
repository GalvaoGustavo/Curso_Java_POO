// ctrl+shif+o para importar o scanner, apos digitar o scanner
// Locale.setDefault(Locale.US); antes do scann
package classScanner;
import java.util.Locale;
import java.util.Scanner;

public class ClassScanner {

	public static void main(String[] args) {
		// CRIANDO VARIAVEL TIPO SCANNER
		Scanner texto = new Scanner(System.in); // comando padrao para iniciar classe SCANNER (OBJETO TEXTO)
		String str;  //criando variavel para receber scanner
		System.out.println("Digite o seu belíssimo nome: ");
		str = texto.nextLine(); // variavel STR recebe o dado da  linha acima
		System.out.printf("Seu nome é: %s%n",str);
		
		System.out.println("Digite a sua idade, pai: ");
		int numero = texto.nextInt();
		System.out.print("Sua idade é: "+numero); //CONTATENADO
		
		texto.close(); // sempre precisa fechar a entrada de dados do SCANNER
	}

}
