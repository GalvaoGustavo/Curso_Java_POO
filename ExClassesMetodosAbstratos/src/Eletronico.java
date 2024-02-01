public class Eletronico extends Produto{
    Eletronico(String nome,double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getDesconto() {
        return this.preco = preco - (preco*0.1);
    }
}
