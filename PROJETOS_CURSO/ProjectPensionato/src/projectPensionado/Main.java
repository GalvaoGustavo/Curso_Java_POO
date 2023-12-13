package projectPensionado;

import java.util.Locale;
import java.util.Scanner;

import enteties.Rent;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("How many room will be rented?");
		int qt = sc.nextInt();
		
		for (int i=1;i<=qt;i++) {
			System.out.println("Rent #"+i+":");
			System.out.print("Name: ");
			sc.nextLine();
			String names = sc.nextLine();
			System.out.print("Email: ");
			String emails = sc.next();
			System.out.print("Room: ");
			int rooms = sc.nextInt();
			
			Rent rent = new Rent(names,emails);
			vect[rooms] = rent;
			
		}
		
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		System.out.println();

		for (int i=1;i<10;i++) {
			if(vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
