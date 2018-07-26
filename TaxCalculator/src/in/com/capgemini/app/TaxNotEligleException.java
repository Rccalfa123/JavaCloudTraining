package in.com.capgemini.app;

public class TaxNotEligleException extends Exception {

	public TaxNotEligleException()
	{
		super();
	}

	@Override
	public String toString() {
		return "No Tax is Applicable on Salary less thhan equal to 10000";
	}
	
	
	
}
