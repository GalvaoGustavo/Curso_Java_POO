public class Livro extends Produto {
    String nome;
    double preco;

    public Livro(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getDesconto() {
        if (this.preco > 70) {
            return this.preco = preco - 50;
        } else {
            return this.preco = preco;
        }

    }
}
