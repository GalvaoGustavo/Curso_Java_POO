package OperadorCondicionalIfELse;

import java.util.Scanner;

public class ElseIF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float horas;
		
		System.out.println("Digite as horas: ");
		horas = sc.nextFloat();
		
		if (horas < 12) {
			System.out.println("Bom dia!");
		}
		else if(horas < 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite!");
		}
			
		

	}

}
