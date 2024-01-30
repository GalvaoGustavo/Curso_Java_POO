//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gustavo",34,"433232324",3);

        System.out.println("O nome do aluno é: " +a1.nome
                +", Idade: "+a1.idade
                +", CPF: "+a1.cpf
                +" Nota: "+ a1.nota);

        a1.getMedia();
        System.out.println();

        Professor p1 = new Professor("Ulpio","JavaBolado");

        System.out.printf("Professor: %s ensina a materia: %s",p1.nome,p1.materias);

        Funcionario f1 = new Funcionario("Carlos", 33,"1323231232",31312);

        System.out.println();
        System.out.println(f1.getDepartamento());
        f1.getSalario();
        Faxineiro fa1 = new Faxineiro("Calos",55,"43323423442",88);

        fa1.limpar();
        fa1.getHorasTrabalhadas();
    }
}