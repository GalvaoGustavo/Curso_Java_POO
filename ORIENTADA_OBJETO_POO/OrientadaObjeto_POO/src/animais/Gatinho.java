package animais;

public class Gatinho {
	
	static int numeroDeGatos;
	private String nome;
	private String cor;
	private int altura;
	private double peso;
	private String estadoDeEspirito;
	
	public Gatinho(String nome, String cor,int altura,double peso,String estadoDeEespirito) {
	
		this.nome = nome;
		this.cor = cor;
		this.altura = altura;
		this.peso = peso;
		this.estadoDeEspirito = estadoDeEspirito;
	}
	void comer() {}
	
	void dormir() {}
	
	void soar() {
		System.out.println("Miau");
	}
	@Override
	public String toString() {
		return "Gato{"+ "nome='"+nome+ '\''+'}';
	}
}
