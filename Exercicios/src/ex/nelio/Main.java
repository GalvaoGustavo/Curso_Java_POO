package ex.nelio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
		
		Product product = new Product(name, price); //variavel da classe produto.
		Product product2 = new Product(name, price); //variavel da classe produto.
		Product p = new Product(name, price);
				
		product.setName("Computer");//fazendo a mudança do valor do produto name
		System.out.println("Name atualized: "+ product.getName()); // acessando o produto name
		
		product.setPrice(1200.00); //metodo set para mudança de valor de price
		System.out.println("Price atualized: "+product.getPrice()); // metodo get para acessar o valor pruice
				
		System.out.println();
		System.out.println("Product data: "+product);

		System.out.println("Enteder quantity to add in stock:");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println(product);
		System.out.println();
		System.out.println("Enter quantitu to remove in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println(product);
		//System.out.println(product2);		
		
		sc.close();
		
	}

}
