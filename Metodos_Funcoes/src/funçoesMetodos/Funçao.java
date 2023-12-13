package funçoesMetodos;

public class Funçao {

	public static void main(String[] args) {
		String nome = "Desenvolvedor Galvão";
		saudacao(); // chamando metodo sem parametro
		
		comprimento(nome); // chamando metodo e especificando o parametro (nome)
		
		int resultado = somaMetodo(2,5); // VARIAVEL RESULTADO RECEBE O METODO SOMAMETODO COM OS PARAMETROS. termosA+B
		System.out.println(resultado);
	}


	public static void saudacao() { // METODO QUE NAO RECEBE PARAMENTRO
		System.out.println("Hello, DEV!");
	}
	public static void comprimento(String nomeParametro) { // METODO COM PARAMETRO,
		System.out.println("Hello, "+nomeParametro);
	}
	public static int somaMetodo(int a,int b) { // METODO COM PARAMETRO
		return a+b;
	}
}