package question3;

public class Bank {

	private double balance;
	 
	Bank()
	{
		 
	}
	
	Bank(double amount)
	{
		this.balance = amount;
	}
	
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = this.balance + balance;
	}

}
