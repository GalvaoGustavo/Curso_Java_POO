package getset;

// MÉTODO GET(ACESSAR) -> PERMITE LEITURA DE UMA VARIAVEL DECLARA COMO PRIVATE MESMO FORA DA CLASSE.
// MÉTODO SET(AJUSTAR) -> METODO QUE VAI MODIFICAR UM VALOR DE ATRIBUTO DA CLASSE PRIVATE.

public class Futebol { // CLASSE FUTEBOL
	private String nomeTime; //ATRIBUTO nomeTime -> APENAS OS METODOS DENTRO DA CLASSE CONSEGUEM ACESSAR
	
	public void setTime(String meuTime) { // *METODO setTime* RECEBE O PARAMETRO STRING MEUTIME
		nomeTime = meuTime;// METODO setTime-> PERMITE ALTERAR O VALOR DO PRODUTO
	}
	public String getTime() { // METODO getTime FAZER LEITURA, 
		return nomeTime; // RETORNA O VALOR DA STRING TIME PARA nomeTime
	}
	public void mostraTime() { // METODO mostraTime QUE USA O GETTIME
		System.out.printf("Seu time do coração é %s \n",getTime());
	}
}
