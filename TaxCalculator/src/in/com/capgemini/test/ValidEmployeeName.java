package in.com.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import in.com.capgemini.app.CountryNotValidException;
import in.com.capgemini.app.Employee;
import in.com.capgemini.app.EmployeeNameInvalidException;
import in.com.capgemini.app.TaxNotEligleException;


public class ValidEmployeeName {

	@Test
	public void testEmployeeName() throws EmployeeNameInvalidException, TaxNotEligleException, CountryNotValidException {
	Employee emp = new Employee();	
	double tax=emp.calculateTax("Saif",1521,true);
	Assert.assertEquals(0, tax , 0);
	
	}

}
