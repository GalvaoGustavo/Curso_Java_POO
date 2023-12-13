package ex2;

import java.util.Locale;
import java.util.Scanner;

import vec.Product;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		Product[] vec = new Product[n];
	
	
		for (int i=0; i<vec.length; i++)
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vec[i] = new Product(name,price);
		
			
		sc.close();
}
		double total = 0.0
			for (int i=0; i<vec.length; i++) {
			total += vec[i].getPrice;
	}
	
		double media = total / vec.length;
}