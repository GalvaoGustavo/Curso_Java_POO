public class Professor {
    String nome;
    String materias;

    public Professor(String nome, String materias) {
        this.nome = nome;
        this.materias = materias;
    }

    public void ensinarMateria(){

        System.out.println("O professor esta ensinando a materia: "+this.materias);
    }
}
