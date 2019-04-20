package dushaj8;

public class CheckingsAccount extends Account {
	final static double OVERDRAFT_LIMIT = 5000;
	@Override
	void withdraw(double amount) {
		if(amount - OVERDRAFT_LIMIT <= getBalance())
			super.withdraw(amount);
		
	}
	public String toString() {
		return "Type: Checking Account; ID: " + this.getId() + ";  balance: " + this.getBalance();
		
	}
	

}
