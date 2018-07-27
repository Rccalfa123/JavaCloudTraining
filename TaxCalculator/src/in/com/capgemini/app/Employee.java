package in.com.capgemini.app;
// Employee Class properties and Behaviours
public class Employee {

	//method for calculating tax throws ecxception if input is not valid for software
	public double calculateTax(String EmpName, double salary, boolean isIndian) throws EmployeeNameInvalidException, TaxNotEligleException, CountryNotValidException {
		double taxAmount = 0.0;  
		
		try {
			if(EmpName.equals(null)|| EmpName.isEmpty())  //Name cannot be Empty
			{
				throw new EmployeeNameInvalidException();
			}
			
			else if(salary < 10000)
			{
				throw new TaxNotEligleException(); //Tax below salary 10000  is not eligible
			}
			
			else if(isIndian == false)
			{
				throw new CountryNotValidException();  //If not Indian no Tax Applicable
			}
			
			else if(salary >=100000 && isIndian == true)  
			{
				taxAmount = (8*salary)/100;
			}

			else if(salary < 100000 && salary >= 50000 && isIndian == true)
			{
				taxAmount = (6*salary)/100;
			}
			
			
			else if(salary >=30000 && salary < 50000 &&isIndian == true)
			{
				taxAmount = (5*salary)/100;
			}
			
			
			else if(salary >=1000 && salary <30000 && isIndian == true)
			{
				taxAmount = (4*salary)/100;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	
		return taxAmount;
	}
	

	

}
