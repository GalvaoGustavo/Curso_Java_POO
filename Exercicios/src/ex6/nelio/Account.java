package ex6.nelio;

public class Account {

		
	private int number;
	private String holder;
	private double balance;

	public Account (int number, String holder) { 	//classe account com 2 parametros SOBRECARGAS

		this.number = number;
		this.holder = holder;
	}
	public Account (int number, String holder, double initialDeposit) {	//classe account com 3 parametros -SOBRECARGAS

		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public void deposit(double Amount) { // DEPOSITO
		 balance += Amount;
	}
	public void withdraw(double Amount) { // RETIRADA
		balance -= Amount + 5;
	//	balance -= 5;
	}
	
	
	public int getNumber() {	//gett + setter

		return number;
	}
	public String getHolder() {	//gett + setter

		return holder;
	}
	public void setHolder(String holder) {	//gett + setter

		this.holder = holder;
	}
	public double getBalance() {	//gett + setter

		return balance;
	}
	@Override
	public String toString() {
		return "Account: " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", Balance: $" 
				+ balance 
				+ ".";
	}
	
	
}





	
	
	

