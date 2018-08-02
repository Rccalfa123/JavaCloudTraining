package in.com.capgemini.test;
import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 2540886854814342193L;
	private int id;
	private String name;
	private double salary;
	 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected double getSalary() {
		return salary;
	}
	protected void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
