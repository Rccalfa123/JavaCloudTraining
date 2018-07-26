package in.com.capgemini.app;
public class EmployeeNameInvalidException extends Exception {

	public EmployeeNameInvalidException() { //Constructor
		super();

	}

	@Override
	public String toString() {
		return "Employee Name cannot be Empty";
	}

}
