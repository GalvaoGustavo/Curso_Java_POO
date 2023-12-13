package oxeTechJava;

public abstract class CartaoWeb {
	
	public String destinatario;
	
	//metodo construtor
	public CartaoWeb(String destinatario) {
		this.destinatario = destinatario;
		
	}
	// metodo abstrato para mostrar mensagem
	public abstract String showMessage();
	//metodo  para obter o destinatario
	public String getDestinatario() {
		return destinatario;
	}
	
}