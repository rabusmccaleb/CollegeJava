package cat;

public class BankAccountClient {
	public static void main(String arg[]) {
		
		BankAccount B1 = new BankAccount("Jake", 600);
		
		BankAccount B2 = new BankAccount();
		
		B2.setBalance(50);
		B2.setName("cat");
		
		B1.deposit(500);
		B1.toString();
		System.out.println(B1.toString());
		
		B1.withdraw(300);
		System.out.println(B1.toString());
		
		System.out.println(B2.toString());
	
}
}
