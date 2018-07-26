package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;
import in.co.capgemini.app.Calculator;

//Division Test class for testing division method

public class DivisionTest {

	@Test
	public void testDivTwoPositive() {
		Calculator cal = new Calculator();
		double ans = cal.Div(5, 2);
		Assert.assertEquals(2.5, ans, 0);

	}

	@Test
	public void testDivTwoNegative() {
		Calculator cal = new Calculator();
		double ans = cal.Div(-2, -2);
		Assert.assertEquals(1, ans, 0);
	}

	@Test
	public void testDivTwoZeros() {
		Calculator cal = new Calculator();
		double ans = cal.Div(0, 0);
		Assert.assertEquals(Double.NaN, ans, 0);
	}

	@Test
	public void testDivOneZeroByNonZero() {
		Calculator cal = new Calculator();
		double ans = cal.Div(0, 30);
		Assert.assertEquals(0, ans, 0);
	}

	@Test
	public void testDivOneNegativeAndPositive() {
		Calculator cal = new Calculator();
		double ans = cal.Div(-6, 2);
		Assert.assertEquals(-3, ans, 0);

	}

	@Test
	public void testDivOneNegativeAndOneZero() {
		Calculator cal = new Calculator();
		double ans = cal.Div(-2, 0);
		Assert.assertEquals(Double.NEGATIVE_INFINITY, ans, 0);

	}

	@Test
	public void testDivOnePositiveAndOneZero() {
		Calculator cal = new Calculator();
		double ans = cal.Div(4, 0);
		Assert.assertEquals(Double.POSITIVE_INFINITY, ans, 0);

	}

}
