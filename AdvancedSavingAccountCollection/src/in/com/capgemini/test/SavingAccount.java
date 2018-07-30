package in.com.capgemini.test;

public class SavingAccount  implements Comparable<SavingAccount>{

	private String accountHolderName;
	private String acc_ID;
	private double acc_balance;
	private boolean isSalaryAccount;
	
	//Getters and Setters
	protected String getAccountHolderName() {
		return accountHolderName;
	}
	protected void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	protected String getAcc_ID() {
		return acc_ID;
	}
	protected void setAcc_ID(String acc_ID) {
		this.acc_ID = acc_ID;
	}
	protected double getAcc_balance() {
		return acc_balance;
	}
	protected void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	protected boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	protected void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	
	//Withdraw method
	public void withdraw(double amount)
	{
		if(acc_balance>=amount)
		{
			acc_balance -= amount;
		}
	}
	
	//parametarized Constructor
	public SavingAccount(String accountHolderName, String acc_ID, double acc_balance, boolean isSalaryAccount) {
		super();
		this.accountHolderName = accountHolderName;
		this.acc_ID = acc_ID;
		this.acc_balance = acc_balance;
		this.isSalaryAccount = isSalaryAccount;
	}
	
	//Deposit method
	public void deposit(double amount)
	{
		acc_balance += amount;
	}
	
	
	@Override
	public String toString() {
		return "SavingAccount [accountHolderName=" + accountHolderName + ", acc_ID=" + acc_ID + ", acc_balance="
				+ acc_balance + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	
	
	@Override
	public int compareTo(SavingAccount arg0) {
	  return  this.acc_ID.compareTo(arg0.acc_ID);		
	}
	
}
