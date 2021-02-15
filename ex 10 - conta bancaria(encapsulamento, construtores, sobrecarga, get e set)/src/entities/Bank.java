package entities;

public class Bank {
	private int number;
	public String name;
	private double balance;
	private final double TAX = 5.0;
	
	public Bank(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Bank(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		bankDeposit(initialDeposit);
	}
	
	public int getNumber() {
		return number;
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
	
	public void bankDeposit(double added) {
		balance += added;
	}
	
	public void bankWithdraft(double removed) {
		balance -= (removed + TAX);
	}
	
	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $" 
				+ String.format("%.2f", balance);
	}	 
}
