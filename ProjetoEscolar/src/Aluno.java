public class Aluno extends Pessoa{
    int nota;

    public Aluno(String nome, int idade, String cpf, int nota) {
        super(nome, idade, cpf);
        this.nota = nota;
    }
    public void getMedia(){
        if (nota >= 6){
            System.out.printf("Aluno: %s passou, com nota %d. PARABENS!",this.nome,this.nota);
        } else if (nota >=4) {
            System.out.printf("Aluno: %s ficou em recuperacao, com nota %d. ",this.nome,this.nota);
        }else{
            System.out.printf("Aluno: %s reprovou, com nota %d.",this.nome,this.nota);
        }
    }
}
