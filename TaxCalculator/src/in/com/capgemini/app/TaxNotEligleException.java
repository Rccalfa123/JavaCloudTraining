package in.com.capgemini.app;

public class TaxNotEligleException extends Exception { //User defined Exception for tax having salary below 10000


	@Override
	public String toString() {
		return "No Tax is Applicable on Salary less thhan equal to 10000";
	}
	
	
	
}
