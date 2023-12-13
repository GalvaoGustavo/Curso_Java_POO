package raioClasse;

import java.util.Locale;
import java.util.Scanner;

import raioClasses.Dados;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Dados raio = new Dados();

		
		System.out.print("Raio: ");
		double radius = sc.nextDouble();
		
		double c = raio.circuferencia(radius);
		
		double y = raio.volume(radius);
		
		
		
		
		System.out.printf("Circuferencia: %.2f%n",raio.circuferencia(radius));
		System.out.printf("Volume: %.2f%n",raio.volume(radius));
		System.out.printf("PI Value %.2f", raio.PI);
			
		
		
		
		
		
		sc.close();
	}

}
