
public abstract class BankFactory {

	 public abstract SavingAcc getNewSavingAccount(String accNm,int accNo,float accBal, boolean isSalaried); //Abstract methods  declaration
	
	 public abstract CurrentAcc getNewCurrentAccount(String accNm,int accNo,float accBal, float creditLimit); //Abstract methods  declaration
}
