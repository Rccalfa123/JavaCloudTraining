package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.app.Calculator;;

//Addition Test class for testing division method
public class AdditionTest {

	@Test
	public void testAddTwoPositive() {
		Calculator cal = new Calculator();
		double ans = cal.add(2, 2);
		Assert.assertEquals(4, ans, 0);

	}

	@Test
	public void testAddTwoNegative() {
		Calculator cal = new Calculator();
		double ans = cal.add(-2, -2);
		Assert.assertEquals(-4, ans, 0);

	}

	@Test
	public void testAddTwoZeros() {
		Calculator cal = new Calculator();
		double ans = cal.add(0, 0);
		Assert.assertEquals(0, ans, 0);

	}

	@Test
	public void testAddOneGreaterNegativeAndPositive() {
		Calculator cal = new Calculator();
		double ans = cal.add(-6, 2);
		Assert.assertEquals(-4, ans, 0);

	}

	@Test
	public void testAddOneNegativeAndGreaterPositive() {
		Calculator cal = new Calculator();
		double ans = cal.add(-2, 6);
		Assert.assertEquals(4, ans, 0);

	}

	@Test
	public void testAddOneNegativeAndOneZero() {
		Calculator cal = new Calculator();
		double ans = cal.add(-2, 0);
		Assert.assertEquals(-2, ans, 0);

	}

	@Test
	public void testAddOnePositiveAndOneZero() {
		Calculator cal = new Calculator();
		double ans = cal.add(4, 0);
		Assert.assertEquals(4, ans, 0);

	}

}
