package in.com.capgemini.test;

public class Employee_information {

	private int empID;
	private String Employee_name;
	private String employee_designation;
	private double Employee_Salary; 
	private String employee_comm;
	
	@Override
	public String toString() {
		return "Employee_information [empID=" + empID + ", Employee_name=" + Employee_name + ", employee_designation="
				+ employee_designation + ", Employee_Salary=" + Employee_Salary + ", employee_comm=" + employee_comm
				+ "]";
	}

	public Employee_information(int i, String employee_name, String employee_designation, double employee_Salary,
			String employee_comm) {
		super();
		this.empID = i;
		Employee_name = employee_name;
		this.employee_designation = employee_designation;
		Employee_Salary = employee_Salary;
		this.employee_comm = employee_comm;
	}

	protected int getEmpID() {
		return empID;
	}

	protected void setEmpID(int empID) {
		this.empID = empID;
	}

	protected String getEmployee_name() {
		return Employee_name;
	}

	protected void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}

	protected String getEmployee_designation() {
		return employee_designation;
	}

	protected void setEmployee_designation(String employee_designation) {
		this.employee_designation = employee_designation;
	}

	protected double getEmployee_Salary() {
		return Employee_Salary;
	}

	protected void setEmployee_Salary(double employee_Salary) {
		Employee_Salary = employee_Salary;
	}

	protected String getEmployee_comm() {
		return employee_comm;
	}

	protected void setEmployee_comm(String employee_comm) {
		this.employee_comm = employee_comm;
	}
	
	
	
	
}
