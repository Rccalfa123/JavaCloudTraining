public class PaymentGateway {
      
	public static boolean transfer(SavingAccount sender,SavingAccount reciever,double amount)
	{
		if(sender.getBalance()>=amount)
		{
			double newBalance= sender.getBalance()-amount;
			sender.setBalance(newBalance);
			newBalance= reciever.getBalance()+amount;
			reciever.setBalance(newBalance);
			return true;
		}
		return false;
	}
	
}