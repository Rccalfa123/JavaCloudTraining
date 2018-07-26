package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.app.Calculator;


//Subtraction Test class for testing division method
public class Substraction {

	@Test
	public void testSub1stGreaterPositiveAnd2ndPositive() {
		Calculator cal = new Calculator();
		double ans = cal.sub(5, 2);
		Assert.assertEquals(3, ans, 0);
	}

	@Test
	public void testSub1stPositiveAnd2ndGreaterPositive() {
		Calculator cal = new Calculator();
		double ans = cal.sub(5, 10);
		Assert.assertEquals(-5, ans, 0);
	}

	@Test
	public void testSub1stGreaterNegativeAnd2ndNegative() {
		Calculator cal = new Calculator();
		double ans = cal.sub(5, 10);
		Assert.assertEquals(-5, ans, 0);
	}

	@Test
	public void testSub1stNegativeAnd2ndGreaterNegative() {
		Calculator cal = new Calculator();
		double ans = cal.sub(5, 10);
		Assert.assertEquals(-5, ans, 0);
	}

	@Test
	public void testSubTwoZeros() {
		Calculator cal = new Calculator();
		double ans = cal.add(0, 0);
		Assert.assertEquals(0, ans, 0);

	}

	@Test
	public void testSubOneNegativeAndOneZero() {
		Calculator cal = new Calculator();
		double ans = cal.add(-2, 0);
		Assert.assertEquals(-2, ans, 0);

	}

	@Test
	public void testSubOnePositiveAndOneZero() {
		Calculator cal = new Calculator();
		double ans = cal.add(4, 0);
		Assert.assertEquals(4, ans, 0);

	}

}
