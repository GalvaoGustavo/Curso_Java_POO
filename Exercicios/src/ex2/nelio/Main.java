package ex2.nelio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario BRUTO: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.printf("Salario liquido: %s, $%.2f%n",funcionario.nome,funcionario.salarioLiquido());
		
		System.out.print("Digite a porcentagem para aumentar o salario: ");
		double porcentagem = sc.nextDouble();
		funcionario.porcentagemSalario(porcentagem);
		
		
		System.out.println(funcionario.toString());
		
		sc.close();
	}

}
