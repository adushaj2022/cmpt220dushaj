package dushaj8;

public class SavingsAccount extends Account {
	int OVERDRAFT;
	@Override
	public String toString() {
		return "Type: Savings Account; ID: " + this.getId() + ";  balance: " + this.getBalance();
		
}
public static void main(String[] args) {
	Account ac1 = new Account(156781, 10000);
	Account ac2 = new SavingsAccount();
	ac2.setId(129037);
	ac2.setBalance(8000);
	
	Account ac3 = new CheckingsAccount();
	ac3.setId(697845);
	ac3.setBalance(7500);
	
	ac1.deposit(500);
	
	ac1.withdraw(450);
	
	
	System.out.println("\n" + ac1.toString());
	System.out.println("Date: "+ ac1.getDateCreated());
	System.out.println("\n" + ac2.toString());
	System.out.println("Date: " + ac2.getDateCreated());
	System.out.println("\n" + ac3.toString());
	System.out.println("Date: " + ac3.getDateCreated());
}
}
