
public class Employee {
	private final String id;
	private final String name;
	private double MonthlyBasic;
	private double hra;
	private double medical;
	private double conveyance;
	
	
	public double getMonthlyBasic() {
		return MonthlyBasic;
	}
	public void setMonthlyBasic(double monthlyBasic) {
		MonthlyBasic = monthlyBasic;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public double getAnnualBasic()
	{
		return 12*MonthlyBasic;
	}
	
	public double getMonthlyGrossSalary()
	{
		return MonthlyBasic+hra+medical+conveyance;
	}
	public double getAnnualGrossSalary()
	{
		return 12*(MonthlyBasic+hra+medical+conveyance);
	}
	public double getMonthlyDeductions()
	{
		
	}
	
	
	
}
