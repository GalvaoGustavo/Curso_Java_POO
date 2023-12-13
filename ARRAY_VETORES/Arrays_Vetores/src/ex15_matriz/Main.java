package ex15_matriz;
//ARRAY QUE MOSTRA NA DIAGONAL E NUMEROS NEGATIVOS
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qt de nuneris da Matriz: ");
		int qt = sc.nextInt();
		
		int[][] mat = new int[qt][qt];
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat.length;j++) {
				System.out.print("Digite os numeros: ");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Main diagonal: ");
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat.length;j++) {				
			}
			System.out.print(mat[i][i] + " ");
		}
			
		int negativos = 0;
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat.length;j++) {
				if (mat[i][j] < 0){
					negativos++;
				}
			}
		}
		System.out.println();
		System.out.print("Negative Numbners = " + negativos);
		
		
		
		
		sc.close();
}
}