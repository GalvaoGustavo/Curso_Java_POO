public class Funcionario extends  Pessoa {
    public String Departamento;
    private int Salario;

    public Funcionario(String nome, int idade, String cpf, int salario) {
        super(nome, idade, cpf);
        Departamento = "ADM";
        Salario = salario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public int getSalario() {
        System.out.printf("O Funcionario %s recebeu o salario de: %d\n", this.nome, this.Salario);
        return Salario;
    }
}

