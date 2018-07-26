package in.com.capgemini.app;

public class CountryNotValidException extends Exception {

	public CountryNotValidException()
	{
		super();
	}

	@Override
	public String toString() {
		return "The Citizen should be an Indian...";
	}
	
	
}
