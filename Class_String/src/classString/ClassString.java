package classString;

public class ClassString {

	public static void main(String[] args) {
		//CRIAÇAO ARRAY DE CARACTERES
		char [] arrayCarac = {'G','A','L','V','Ã','O'};
		// CRIANDO STRINT ( FORMA PADRAO ) - 2 OPÇÕES
		String txt = new String("Gustavo Galvão");		
		String txt4 = ("Gustavo Galvão"); 
		// VALIDO APENAS PARA STRING ( NAO USA O 'NEW')
		
		// 3 FORMAS DE CONSTRUTORES DA CLASSE STRING
		String tex1 = new String();
		String tex2 = new String(txt);
		String tex3 = new String(arrayCarac);
		
		// %N QUEBRANDO A LINHA.
		System.out.printf("tex1 = %s%ntex2 = %s%ntex3 = %s%n",tex1,tex2,tex3);
		
		//COMPRIMENTO DA STRING:
		System.out.printf("%nComprimento da string txt: %d caracteres",txt.length());
		
		//CRIAR UM ARRAY DE CARACTERES A PARTIR DE UMA STRING:
		char [] arrayCar = new char[7];
		
//getchars pega os caracteres ( 0 = inicio da string, 7 o final )
// getchat pega os caracteres individuais para formar um array
		txt4.getChars(0, 7, arrayCar, 0);
		System.out.printf("%nO array de caraters criado é: ");
		for (char caractere : arrayCar) {
			System.out.print(caractere);
		}
		//MOSTRAR UM CARACTERE COM CHARAT
		System.out.printf("%nCaractere de índice 0 em tex3: %c%n",tex3.charAt(3));
		
		//MOSTRAR TODOS OS CARACTERES EM REVERSO COM CHARAT+
		System.out.printf("%nString tex3 de trás pra frente: ");
//loop inicia na quantidade maxima de tex3 -1, vai ate 0 e diminui -1 loop
		for (int i = tex3.length() -1; i >= 0; i--) {
			System.out.printf("%c",tex3.charAt(i));
		}
	}

}
