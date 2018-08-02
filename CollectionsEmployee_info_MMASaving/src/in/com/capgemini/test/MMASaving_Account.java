package in.com.capgemini.test;

public class MMASaving_Account {

	private int  accountID;
	private String accountHolder_name;
	private double account_balance;
	private boolean isSalaryAccount;
	protected int getAccountID() {
		return accountID;
	}
	protected void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	protected String getAccountHolder_name() {
		return accountHolder_name;
	}
	protected void setAccountHolder_name(String accountHolder_name) {
		this.accountHolder_name = accountHolder_name;
	}
	protected double getAccount_balance() {
		return account_balance;
	}
	protected void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	protected boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	protected void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	@Override
	public String toString() {
		return "MMASaving_Account [accountID=" + accountID + ", accountHolder_name=" + accountHolder_name
				+ ", account_balance=" + account_balance + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	
	public MMASaving_Account(int accountID, String accountHolder_name, double account_balance,
			boolean isSalaryAccount) {
		super();
		this.accountID = accountID;
		this.accountHolder_name = accountHolder_name;
		this.account_balance = account_balance;
		this.isSalaryAccount = isSalaryAccount;
	}
	
	
	
}
