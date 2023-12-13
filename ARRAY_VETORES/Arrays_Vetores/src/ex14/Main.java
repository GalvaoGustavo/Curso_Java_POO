package ex14;
//Problema "dados_pessoas" 

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas vao ser cadastradas?");
		int qt = sc.nextInt();
		
		Double[] alt = new Double[qt];
		char[] sex = new char[qt];
		
		for (int i=0;i<qt;i++) {
		System.out.printf("Digite a altura da %dª pessoa: ",i+1);
		alt[i]=sc.nextDouble();
		System.out.printf("Digite o sexo da %dª pessoa: ",i+1);
		sex[i]=sc.next().charAt(0);
		}

		double maiorAlt = alt[0];
		double menorAlt = alt[0];
		
		for (int i=0;i<qt;i++) {
			if(maiorAlt < alt[i]) {
				maiorAlt = alt[i];				
			}
			if(menorAlt > alt[i]) {
				menorAlt=alt[i];
			}
		}
		System.out.printf("Menor altura = %.2f \n",menorAlt);
		System.out.printf("Maior altura = %.2f \n",maiorAlt);
		
		int qtM = 0;
		int qtH = 0;
		double altM = 0;
		for (int i=0;i<qt;i++) {
			if(sex[i]=='f') {
				qtM++;
				altM+=alt[i];
			}
			else{
				qtH++;
			}
			
		}
		double media = altM/qtM;
		System.out.printf("Media das alturas das mulheres %.2f \n",media);
		System.out.printf("Numero de homens = %d",qtH);
		sc.close();
	}

}
