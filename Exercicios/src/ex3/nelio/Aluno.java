package ex3.nelio;

public class Aluno {
		
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	

	public double notas() {
		return nota1+nota2+nota3;
	}
	public double analise() {
		if(notas() < 60) {
			return 60.0 - notas();
		}else {
			return 0;
		}
			
	}
	
}	
