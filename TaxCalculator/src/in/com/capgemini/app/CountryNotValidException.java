package in.com.capgemini.app;

public class CountryNotValidException extends Exception { //User defined exception for Non Indian

	public CountryNotValidException()
	{
		super();
	}

	@Override
	public String toString() {
		return "The Citizen should be an Indian...";
	}
	
	
}
