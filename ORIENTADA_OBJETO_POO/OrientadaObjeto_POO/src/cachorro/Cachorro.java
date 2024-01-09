package cachorro;

public class Cachorro { //criando classe cachorro

		public String nome; // definiçao dos parametros da classe
		public String cor;
		public int altura;
		public double peso;
		public int tamanhoDoRabo;
		public String estadoEspirito;



		public void comer() {} // definindo clase vazia, comer que nao recebe nenhuma variavel e nao realzia nenhuma açao

		public void latir() {
	System.out.println("AuAU birimbau");
}
		public String pegar() { // criaçao de metodo ( publico, variavel pegar, retorna bolinha) com return, possui interaçao
	return "BOLINHA";
}
		public String interagir(String acao) {
	if(acao.equals("carinho")) { // equals faz uma comparacao ( no caso, da acao)
		this.estadoEspirito = "feliz";		
	}else if(acao.equals("chutei")) {
		this.estadoEspirito = "Triste";
	}else {
		this.estadoEspirito = "Neutro";
	}
	return estadoEspirito;

}
}