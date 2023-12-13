package animais;

public class Passaro { // as variaveies
	static int numeroDePassaros;
	private String nome;
	private String cor;
	private int altura;
	private double peso;
	private String estadoDeEspirito;
	
	//metodo construtor
	public Passaro(String nome,String cor,int altura,double peso,String estadoDeEspirito) {
		this.nome = nome;
		this.cor = cor;
		this.altura = altura;
		this.peso = peso;
		this.estadoDeEspirito = estadoDeEspirito;
		
		numeroDePassaros ++;
	}
	// metodos que o passarinho pode fazer
	void comer() {}
	
	void dormir () {}
	
	void soar () {
		System.out.println("Piu Piu");
	}
}
