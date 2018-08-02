package in.com.capgemini.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Employee {

	private HashMap<Employee_information,MMASaving_Account> employeeList = new HashMap<>();
	
	public void add_Entity(Employee_information alfaiz,MMASaving_Account alfaiz2)
	{
		if (alfaiz.getEmployee_name().equals(alfaiz2.getAccountHolder_name()))
				{
						employeeList.put(alfaiz, alfaiz2);
						display_HashMap();
				}
		
	}
	
	public void display_HashMap()
	{
		System.out.println("\n\nUpdated HashMap : ");
		Set<Map.Entry<Employee_information,MMASaving_Account>> values = employeeList.entrySet();//getting all keys for iteration
		
		 for(Map.Entry<Employee_information,MMASaving_Account> map : values)  
		 {
			 System.out.println("\n"+map.getKey() + " Likes "+map.getValue());
		 }
	}
	
}
