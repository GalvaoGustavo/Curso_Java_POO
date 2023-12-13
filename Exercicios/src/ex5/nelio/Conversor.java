package ex5.nelio;

public class Conversor {
	
    public static final double IOF = 0.06;

	
	public double conversao(double dolar, double real) {
		double valor = real * dolar;
		return valor += valor * IOF;
		
	}

}


