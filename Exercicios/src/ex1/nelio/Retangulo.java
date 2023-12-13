package ex1.nelio;

public class Retangulo {
	public double largura;
	public double altura;

	
	public double area(){
		return altura * largura;
	}
	
	public double perimetro() {
		return 2 * (altura + largura);
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
	}
	
	public String toString() {
		return "AREA = "
			+ String.format("%.2f%n", area())
			+ "PERIMETRO = "
			+ String.format("%.2f%n", perimetro())
			+ "DIAGONAL = "
			+ String.format("%.2f%n", diagonal());
			
	}
}
