package raioClasses;

public class Dados {
	
	public final double PI = 3.14159; // pi como FINAL, nao pode ser alterada
	
	public double circuferencia(double radius) {
		return 2.0 * PI * radius;
	}
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
