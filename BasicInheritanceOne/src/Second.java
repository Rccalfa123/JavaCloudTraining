
public class Second {
	
	private int EmployeeId;
	private String EmployeeName;
	
	public Second(String employeeName) {
		super();
		EmployeeName = employeeName;
	}

	protected int getEmployeeId() {
		return EmployeeId;
	}

	protected void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	protected String getEmployeeName() {
		return EmployeeName;
	}
}
