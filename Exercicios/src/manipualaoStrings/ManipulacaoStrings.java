package manipualaoStrings;

import java.time.LocalDateTime; // linha 18 importando a hora
import java.time.LocalDate; // linhas 12 importando a data
import java.time.format.TextStyle;
import java.util.Locale; // linah 10 importando a localidade brasil porttugues

public class ManipulacaoStrings {
	public static void main(String[] args) {
		
		Locale brasil = new Locale("pt","BR");// representa localidade (1º parametro linguagem 2º parametro pais
		LocalDate hoje = LocalDate.now(); // representa data de HOJE ( dia,mes e ano)
		String nome = "Desenvolvedor Galvão";
		String diaSemana = (hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		//getdayofwwek(printa dia smana); getdisplayname( 1º parametro nome completo, 2º formatacao brasil
		String saudacao;
		LocalDateTime agora = LocalDateTime.now(); // representa a hora de agora
		
		if(agora.getHour() >= 0 && agora.getHour() <12) {
			saudacao = "Bom dia";			
		}else if(agora.getHour() >=12 && agora.getHour() < 18) {
			saudacao = "Boa tarde";
		}else if(agora.getHour() >= 18 && agora.getHour() < 24) {
			saudacao = "Boa noite";
		}else {
			saudacao = " ";
		}		
		System.out.printf("Olá, %s.%nHoje é %s, são %s horas!\nTenha um %s",nome,diaSemana,agora.getHour(),saudacao.toUpperCase());
		
		
		
	}

}
