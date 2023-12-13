package cachorro;

public class MainCachorro {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro(); // variavel criada para receber classe cachorro
		
		cachorro1.nome = "Rex";
		cachorro1.altura = 30;
		cachorro1.cor = "black";
		cachorro1.peso = 10.1;
		cachorro1.tamanhoDoRabo = 4;
		
		System.out.println(cachorro1);
		cachorro1.latir(); // objeto cachorro1 chama classe latir
		cachorro1.pegar(); // nao realiza nada, pq o metodo possui um return, precisa printar
		System.out.println("O cachorro foi pegar a: "+cachorro1.pegar()); // print com metodo, pq possui return
		System.out.println(cachorro1.interagir("carinho"));
		System.out.println(cachorro1.interagir("ignorei"));
		System.out.println(cachorro1.interagir("chutei"));

	}

}
