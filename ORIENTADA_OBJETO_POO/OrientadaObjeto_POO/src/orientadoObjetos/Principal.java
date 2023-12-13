 package orientadoObjetos;

public class Principal {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.nome = "O Programador";
		livro.descricao = "Java";
		livro.isbn = "5456464654";
		livro.preco = 45.95;
		livro.autor = "Fábio dos Reis";
		livro.dataPub = "20/04/2017";
		
		System.out.printf(" A tada é do livro %s é %s, escritor %s e %s ", livro.nome,livro.preco,livro.autor,livro.descricao);
		livro.dadosLivro();
	}

}
