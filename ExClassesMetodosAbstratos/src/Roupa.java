public class Roupa extends Produto{
    String nome;
    double preco;

    public Roupa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getDesconto() {
        if (this.preco > 100) {
            return this.preco = preco - (preco*0.15);
        } else {
            return this.preco = preco - (preco*0.05);
        }
    }
}
