package ex.nelio;

public class Product {
	private String name; // necessario criaçao de get +seter para acessar e modificar dados FORA DA CLASSE PRODUCT( PRIVATE )
	private Double  price;// necessario criaçao de get +seter para acessar e modificar dados FORA DA CLASSE PRODUCT( PRIVATE )
	private int quantity;// necessario criaçao de get +seter para acessar e modificar dados FORA DA CLASSE PRODUCT( PRIVATE )
	
	public Product() {
	}
	
	public Product(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, Double price) { // metodo sobrecarga, 2 produtos product
		this.name = name;
		this.price = price;	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() { // metodo para calcular o valor no estoque (preço*quantitade)
		return price * quantity;
	}
	
	public void addProducts(int quantity) { // metodo para dicionar produto em quantidade 
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) { //metodo para remover produto de quantidade
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $"
			+ String.format("%.2f", price)
			+", "
			+quantity
			+ " units, Total: $"
			+ String.format("%.2f", totalValueInStock());
	}

}
