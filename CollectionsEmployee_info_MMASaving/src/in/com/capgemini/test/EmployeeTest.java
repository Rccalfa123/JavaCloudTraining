package in.com.capgemini.test;

public class EmployeeTest {

	public static void main(String[] args) {
	try {	
		Employee_information alfaiz = new Employee_information(155331, "Alfaiz", "Analyst", 20000, "ALFA");
		Employee_information saif = new Employee_information(155334, "Saif", "Analyst", 20500, "CISCO");
		Employee_information nehal = new Employee_information(155336, "Nehal", "Analyst", 21000, "CORP");
		Employee_information rana = new Employee_information(155330, "Rana", "Analyst", 28800, "ZIPS");
		
		
		MMASaving_Account alfaiz2 = new MMASaving_Account(14578,"Alfaiz", 4500, true);
		MMASaving_Account saif2 = new MMASaving_Account(15418,"Saif", 4525, false);
		MMASaving_Account nehal2 = new MMASaving_Account(14589,"Nehal", 5500, true);
		MMASaving_Account rana2 = new MMASaving_Account(14695,"Rana", 6500, true);

		Employee employee = new Employee();
		
		employee.add_Entity(alfaiz, alfaiz2);
		employee.add_Entity(nehal, saif2);
		employee.add_Entity(saif, saif2);
		employee.add_Entity(rana, nehal2);
		employee.add_Entity(rana, rana2);
		employee.add_Entity(saif, alfaiz2);
	}catch (Exception e) {
		e.printStackTrace();
	}	
		
		
	}

}
