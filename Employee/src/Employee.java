//Employee Class 
public class Employee {
	private String id;
	private String name;
	private double MonthlyBasic;
	private double hra;
	private final static double medical = 1250;
	private final static double conveyance = 800;
	private static double pf ;
	private static double pfRate;
	private double esic;
	private double profTax;
	
	
	public Employee(double Monthlybasic, double pfRate)// parametarised Constructor 
	{
        this.MonthlyBasic = Monthlybasic;    // Setting each value
        setPfRate(pfRate);
        if(.1*Monthlybasic < 6500)
        {
        	pf = .1*Monthlybasic;
        }
        else
        {
        	pf = 6500;
        }
        setHra();
        setEsic();
        setProfTax();
        	
	}
	
	public double getHra() {
		return hra;
	}

	public void setHra() {
		hra = .5*MonthlyBasic;
	}


	
	public static double getPf() {
		return pf;
	}
	
	
	public static double getPRate() {
		return pfRate;
	}
	public static void setPfRate(double pf) {  // Set PF Rate
		Employee.pfRate = pf;
	}

	
	public double getEsic() {
		return esic;
	}
	public void setEsic() {
		if(MonthlyBasic <= 5000)
	    {
	    	esic = .0475*MonthlyBasic;
	    }
	    else
	    	{
	    	esic = 0;
	    	}
	    
	}
	public double getProfTax() {
		return profTax;
	}
	public void setProfTax() {
		if(MonthlyBasic <= 10000)
	    {
	    	profTax = 50;
	    }
	    else
	    	{
	    		profTax = 100;
	    	}
	}
	
	
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
		return 12*getMonthlyGrossSalary();
	}
	
	public double getMonthlyDeductions()
	{
		return pf+esic+profTax;
	}
	
	public double getMonthlyTakeHome()
	{
		return getMonthlyGrossSalary() - getMonthlyDeductions();
	}
	
	public double getAnuualTakeHome()
	{
		return 12*getMonthlyTakeHome();
	}
	
	public String toString()  // override toString function.
	{
		return "Employee Details : AnnualBasic: "+ getAnnualBasic() +" MonthlyGrossSalary :"+ getMonthlyGrossSalary()+" AnnualGrossSalary : "+getAnnualGrossSalary()+"  MonthlyDeductions : "+getMonthlyDeductions()+"   MonthlyTakeHome : "+getMonthlyTakeHome()+"  MonthlyDeductions "+getMonthlyDeductions()+"    AnuualTakeHome :"+ getAnuualTakeHome()+"";
	}
	
	
}
