package enumsJava;

public class ClasseTesteEnum {
	EnumPlanetas planeta;
	
	ClasseTesteEnum(String planeta){
		this.planeta = EnumPlanetas.valueOf(planeta);
	}
	
	public void viajarPlaneta() {
		switch(planeta) {
		case MERCÚRIO:
			System.out.println("Muito quente por lá.");
			break;
		case TERRA:
			System.out.println("Já estamos aqui.");
			break;
		case URANO:
			System.out.println("Muito longe.");
			break;
		default:
			System.out.println("Passagens esgotadas.");
		
		}
	}
}
