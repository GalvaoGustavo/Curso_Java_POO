//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Eletronico e1 = new Eletronico("Gustavo DEV",2000);
        System.out.println(e1.getDesconto());

        Roupa r1 = new Roupa("Blusao OxeTech",50);
        System.out.println(r1.getDesconto());

        Livro l1 = new Livro("Lodr",71);
        System.out.println(l1.getDesconto());
    }
}