package in.com.capgemini.app;
public class EmployeeNameInvalidException extends Exception {  // User Defined  Exception for Invalid name

	
	@Override
	public String toString() {
		return "Employee Name cannot be Empty";
	}

}
