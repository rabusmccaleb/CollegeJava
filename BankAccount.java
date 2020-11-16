package cat;

public class BankAccount {
	private String Name;
	private double balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(String name, double balance) {
		this.Name = name;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
		
	}
	
	public String getName() {
		return Name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setName(String name) {
		this.Name = name;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public String toString() {
		return "Name: " + Name + ", Current balance: $" + balance;
	}

}
