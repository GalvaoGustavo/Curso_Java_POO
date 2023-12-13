package ex6.nelio;

import java.util.Locale;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // VALO AMERICANO
		Scanner sc = new Scanner(System.in); // SCANNER 
		Account account; // NECESSARIO PARA INSTANCIAR A CLASSE ACCOUNT, RECEBEU AS 2 SOBRECARGAS account.
		
		System.out.print("Enter account numbe: "); // INPUT NUMERO DA CONTA, NAO PODE SER MODIFICADO ( NÃO POSSUI SETGETTERS )
		int number = sc.nextInt();
		System.out.print("Enter account holder: "); // INPUT NOME CLIENTE, POODE SER MODIFICADO ( POSSUI SETGETTERS )
		sc.nextLine(); // FOI PRECISO PARA RECEBER O DADO ANTERIOR QUE AINDA FICOU.
		String holder = sc.nextLine(); // VARIAVEL TEMPORAARIA PARA RECBER DADOS NOME, JA QUE PODE SER MODIFICADO.
		
	//	System.out.println();	
		System.out.print("Is there na initial deposit? (y/n)? "); // SOBRECARGA
		char yn = sc.next().charAt(0); // VARIAVEL CHAR POR POSSUIR APENAS UM CARACTERE
		
		
		if (yn == 'y'){ // ESTRUTURA DE DECISAO PARA SABER QUAL SOBRECARGA IRA USAR DE ACCOUNT
			System.out.println("Enter initial deposit value: ");
			Double initialDeposit = sc.nextDouble(); // variavel temporaria para receber o valor inicial do deposit
			account = new Account(number,holder,initialDeposit); // acount com 3 parametros
		}
		else{
			account = new Account(number,holder);// acount com 2 parametros
		}
			
		System.out.println("Account data:");
		System.out.print(account); // puxa account com todos os parametros, apos declarar o tostring. decidido o account correto apos o IF
		System.out.println();	
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble(); //depositvalue temporario para receber 
		account.deposit(depositValue); //chama account. deposit e ( oq vai receber, parametro ) 
		
		System.out.println("Update Account Data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble(); //criado variavel para receber o valkor deposito
		account.withdraw(withdrawValue); // chamou account, withdraew e recebe o pparametro(withdrawValue)
		System.out.println(account);
		
		
		
}
}


	
	


