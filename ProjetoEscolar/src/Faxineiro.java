public class Faxineiro extends Pessoa{
    private int horasTrabalhadas;

    public Faxineiro(String nome, int idade, String cpf, int horasTrabalhadas) {
        super(nome, idade, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        if(horasTrabalhadas >= 100){
            System.out.printf("Paranens, %s voce atingou carga de horario maxima, ira receber $3000",this.nome);
        } else {
            System.out.printf("Que bom %s, voce vai receber o valor medio de $2000", this.nome);
        }

        return horasTrabalhadas;
    }
    public void limpar(){
        System.out.printf(" O %s acabou de limpar todo o chao, cuidado para nao sujar!\n",this.nome);
    }
}
