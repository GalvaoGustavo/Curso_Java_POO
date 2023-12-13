package classStringBuilder;

public class ClassStringBuilder {
	
//stringBuilder onde as classes podem ser manipuladas
// IDEAL QUANDO AS STRING SAO FREQUENTIMENTE CONCATENADAS, SOFRE ALTERAÇOES

	public static void main(String[] args) {
		//instanciando a classe ( caractere padrao qt 16 )
		StringBuilder string1 = new StringBuilder();
		
		// quantidade 50 determinada (50)
		StringBuilder string2 = new StringBuilder(50);
		
		// quantidade de caracteres + 16 da padrao
		StringBuilder string3 = new StringBuilder("Gustavo Galvão");
		
		// \"  <- pra poder sair " no print
		System.out.printf("string1 = \"%s\"%n",string1);
		System.out.printf("string2 = \"%s\"%n",string2);
		System.out.printf("string3 = \"%s\"%n",string3);
		
		System.out.printf("%n");
		
		//comando para converter o texto para string ( OBS JA É STRING)		
		System.out.printf("string3 = %s%n",string3.toString());
		
		//mostra a capacidade total ( mostra os 16 padroes + o declarado )		
		System.out.printf("Capacidade = %d%n",string3.capacity());
		
		//mostra comprimento de " gustavo galvão "		
		System.out.printf("Comprimeito = %d%n",string3.length());
		System.out.printf("%n");

		//modifica a quantidade DA STRING
		string3.setLength(13);
		System.out.printf("string3 = %s%n",string3.toString());
		System.out.printf("Capacidade = %d%n",string3.capacity());
		//NOVO COMPRIMENTO, NAO MUDA A CAPACIDADE, AINDA É A MESMA.
		System.out.printf("Novo Comprimeito = %d%n",string3.length());


	}

}
