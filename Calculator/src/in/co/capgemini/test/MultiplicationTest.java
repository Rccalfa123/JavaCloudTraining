package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.app.Calculator;

//Multiplication Test class for testing division method
public class MultiplicationTest {

	@Test
	public void testMulTwoPositive() {
		Calculator cal = new Calculator();
		double ans = cal.Mul(2, 2);
		Assert.assertEquals(4, ans, 0);

	}

	@Test
	public void testMulTwoNegative() {
		Calculator cal = new Calculator();
		double ans = cal.Mul(-2, -2);
		Assert.assertEquals(4, ans, 0);

	}

	@Test
	public void testMulTwoZeros() {
		Calculator cal = new Calculator();
		double ans = cal.Mul(0, 0);
		Assert.assertEquals(0, ans, 0);

	}

	@Test
	public void testMulOneNegativeAndOnePositive() {
		Calculator cal = new Calculator();
		double ans = cal.Mul(-6, 2);
		Assert.assertEquals(-12, ans, 0);

	}

	@Test
	public void testMulOneNegativeAndOneZero() {
		Calculator cal = new Calculator();
		double ans = cal.Mul(-2, 0);
		Assert.assertEquals(0, ans, 0);

	}

	@Test
	public void testMulOnePositiveAndOneZero() {
		Calculator cal = new Calculator();
		double ans = cal.Mul(4, 0);
		Assert.assertEquals(0, ans, 0);

	}
}
