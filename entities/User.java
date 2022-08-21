package entities;

public class User {

	private int number;
	private String name;
	private double balance;
	
	
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void addBalance(double valueDeposit) {
		this.balance = valueDeposit;
	}
	
	@Override
	public String toString() {
		return "Account Number=" + number + ", User: " + name + ", Balance: $" + balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


	
