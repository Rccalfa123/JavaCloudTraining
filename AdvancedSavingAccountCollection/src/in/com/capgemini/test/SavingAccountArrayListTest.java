package in.com.capgemini.test;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

//Class for Adding Saving Account Object in ArrayList
public class SavingAccountArrayListTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Creating Saving Account Object 
		SavingAccount alfaiz = new SavingAccount("Alfaiz","155331",54200,true);
		SavingAccount saif = new SavingAccount("Saif","155332",54214,true);
		SavingAccount nehal = new SavingAccount("Nehal","155333",55200,false);
		SavingAccount rana  = new SavingAccount("Amit","155334",64200,false);
		SavingAccount amit = new SavingAccount("Rana","155335",4200,true);
		
		//Creating ArrayList
		List<SavingAccount> arrayList = new ArrayList<>();
		
		//Adding Objects in array list 
		arrayList.add(amit);
		arrayList.add(saif);
		arrayList.add(alfaiz);
		arrayList.add(nehal);
		arrayList.add(rana);
		
		//printing ArrayList 
		arrayList.stream().forEach((SavingAccountList)->System.out.println("\n"+SavingAccountList));	
		
	}

}
