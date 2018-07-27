package in.com.capgemini.apk.test;



import org.junit.Assert;
import org.junit.Test;

import in.com.capgemini.test.Factorial;
import in.com.capgemini.test.FactorialException;
import in.com.capgemini.test.InvalidInputException;


public class TestFactorial {

	@Test
	public void lessthanTwo() throws InvalidInputException, FactorialException {
		Factorial factorial = new Factorial();
		long fact = factorial.getFactorial(100l);
		Assert.assertEquals((long)Double.POSITIVE_INFINITY, fact, 0);
		
	}

}
