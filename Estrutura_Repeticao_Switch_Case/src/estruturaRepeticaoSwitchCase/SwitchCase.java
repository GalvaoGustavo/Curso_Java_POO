package estruturaRepeticaoSwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia = null; // declarada null para poder contatenar no print
		
		
		switch(x) { // expressao que ser analisada pelo switch ( INPUT)
		case 1: // case = if, 1= valor do input - REALIRAZA AÇAO ABAIXO
			dia = "Domingo"; // variavel da açao
			break; // sempre precisa do break para encerrar o switch
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default: // comando else
			System.out.println("Dia inválido"); 
			break;
			
		}
		
		System.out.printf("Dia da semana é: %s",dia);
		sc.close();
	}
} 