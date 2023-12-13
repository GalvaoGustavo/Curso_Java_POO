package operadorAritmetico;

public class OperadorAritmetico {

	public static void main(String[] args) {
		int x = 9;
		int y = 2;
		
		System.out.printf("X + Y = %d\n", x+y);
		System.out.printf("X - Y = %d\n",x-y);
		System.out.printf("X / Y = %d\n", x/y); // divisao inteira
		System.out.printf("X * Y = %d\n",x*y);
		System.out.printf("X / Y = %2.2f\n", x / (double)y); // divisao com casa decimal, precisa transforar 1 em float
		System.out.printf("X %% Y = %d",x%y); 
	}

}
