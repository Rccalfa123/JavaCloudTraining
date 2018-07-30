package in.com.capgemini.test;

import java.util.Set;
import java.util.TreeSet;
//Class Maintaining SavingAccount
public class BankAccountList {

	Set<SavingAccount> treeSet = new TreeSet<>();
	
	
	public void addSavingAccount(SavingAccount alfaiz) {
		treeSet.add(alfaiz);
		System.out.println("\nAfter Adding SavingAccount of " + alfaiz.getAccountHolderName());
		treeSet.stream().forEach((treeSetList) -> System.out.println(treeSetList));
	}

	public void removeSavingAccount(SavingAccount alfaiz) {
		treeSet.remove(alfaiz);
		System.out.println("\nAfter Removing SavingAccount of " + alfaiz.getAccountHolderName());
		treeSet.stream().forEach((treeSetList) -> System.out.println(treeSetList));

	}
}
