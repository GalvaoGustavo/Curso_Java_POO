import classes.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setIdade(33);
        pessoa.setAltura(2.25f);

        System.out.printf("Nome: %s, idade = %d, altura = %2.f", pessoa.getNome(), pessoa.getIdade(), pessoa.getAltura());

    }
}