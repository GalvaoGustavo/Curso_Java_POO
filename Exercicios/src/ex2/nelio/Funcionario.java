package ex2.nelio;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	

	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void porcentagemSalario(double porcentagem) {
		this.salarioBruto += salarioBruto * porcentagem / 100.0;

	}
	public String toString() {
		return "Update data: "
			+ nome
			+ ", $"
			+ String.format("%.2f", salarioLiquido());
	}
	
}
