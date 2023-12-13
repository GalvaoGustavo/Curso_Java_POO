package getset;
import java.util.Scanner;

public class GettersSetters {

	public static void main(String[] args) {
		String time; //DEFINE VARIAVEL
		Futebol torcida = new Futebol(); //INSTANCIANDO CLASSE, CRIOU OBJERTO *TORCIDA*
		
		Scanner sc = new Scanner(System.in); // SCAN
		
		System.out.println("Digite o seu nome de futebol preferido:"); //LEITURA VARIAVEL TIME
		time = sc.nextLine(); //ARMAZENA LEITURA VARIAVEL TIME
		
		sc.close(); //FIMSCAN *SEMPRE*
		
		
		torcida.setTime(time);//CHAMA METODO SETIME E AJUSTA O VALOR PARA O DA VARIAVEL TIME
		torcida.mostraTime(); //CHAMA O METODO MOSTRATIME / () VAZIO PQ NAO ATRIBUI NADA, SO CHAMA
		System.out.println(torcida.getTime()); //POSSIVEL ACESSAR PRIVATE APENAS POR METODOGET
		
	}

}
