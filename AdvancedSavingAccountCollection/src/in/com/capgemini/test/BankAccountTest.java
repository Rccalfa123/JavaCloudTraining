package in.com.capgemini.test;

public class BankAccountTest {

	public static void main(String[] args) {
		
		//Creating Saving Account Object 
		SavingAccount alfaiz = new SavingAccount("Alfaiz","155331",54200,true);
		SavingAccount saif = new SavingAccount("Saif","155332",54214,true);
		
		BankAccountList bankAccountList = new BankAccountList();
		
		bankAccountList.addSavingAccount(alfaiz);
		bankAccountList.addSavingAccount(saif);

		bankAccountList.removeSavingAccount(alfaiz);
	}

}
