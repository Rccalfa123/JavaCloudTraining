
public class SavingAccount {
   
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	private static long nextAccountNumber = 1548745;
	
	public SavingAccount(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
		this.balance = 0;
		this.accountNumber = 1552478;
	}
	
	 
	public SavingAccount(String accountHolderName, double balance)
	{
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber = 1552478;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public static long getNextAccountNumber() {
		return nextAccountNumber;
	}	
	

	public double Withdraw(double amount)
	{
		if(balance > amount)
			balance -= amount;
		else
			System.out.println("Insufficient balance...");
		
		return balance;
			
	}

	public double Deposit(double amount)
	{	
		return balance += amount;	
	}


	@Override
	public String toString() {
		return "SavingAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", balance=" + balance + ", getAccountNumber()=" + getAccountNumber() + ", getAccountHolderName()="
				+ getAccountHolderName() + ", getBalance()=" + getBalance() + "]";
	}
	
	
}
