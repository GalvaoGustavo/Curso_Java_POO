package enumsJava;
import java.util.Scanner;

public class EnumsMain {

	public static void main(String[] args) {
		// listar os valores da enum
		Scanner entrada = new Scanner(System.in);
			String planeta;
			System.out.println("Para qual planeta quer viajar?");
			planeta = entrada.next().toUpperCase();
			entrada.close();
			
			ClasseTesteEnum pl = new ClasseTesteEnum(planeta);
			pl.viajarPlaneta();
		
/*		for(EnumPlanetas p : EnumPlanetas.values());
		System.out.printf("%s%n", p);
*/
	}

}
