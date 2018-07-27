package in.com.capgemini.test;

public class InvalidInputException extends Exception {

	@Override
	public String toString() {
		return "Input cannot be less than 2";
	}
	
		

}
