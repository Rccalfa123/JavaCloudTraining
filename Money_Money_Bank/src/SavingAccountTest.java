
public class SavingAccountTest {

	public static void main(String[] args) {

		SavingAccount savingAccount = new SavingAccount("Alfaiz");
		System.out.println(savingAccount);
		
		SavingAccount savingAccount2 = new SavingAccount("Saif",5400);
		System.out.println(savingAccount2);
		
		System.out.println(SavingAccount.getNextAccountNumber());
		
		boolean k = PaymentGateway.transfer(savingAccount2, savingAccount, 3000);
        if (k==true)
        {
        	System.out.println("Payment Successfull");
        }
        else
        {
        	System.out.println("Unsuccessfull");
        }
		
	}

}
