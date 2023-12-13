package sobrecarga;

public class Expoente {
	//MÉTODO QUE CALCULA O QUADRADO DE i
	public static double elevar(double i) {
		return i * i;	
	}
	
	//MÉTODO QUE CALCULA I ELEVADO A J
	public static double elevar (double i,double j) {
		return Math.pow(i, j);
	}
	
	//MÉDODO QUE NÃO EXECUTA NADA
	public static void elevar() {
		System.out.println("Esse método não calculad nada.");
	}
}

