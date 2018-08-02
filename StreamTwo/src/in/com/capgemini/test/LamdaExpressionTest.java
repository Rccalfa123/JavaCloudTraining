package in.com.capgemini.test;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionTest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i < 1001; i++) {
			list.add(i);
		}

		System.out.println("\nOdd Number in 1-1000");
		
		list.stream().filter(LamdaExpression.isOdd()).forEach(System.out::println);

		System.out.println("\nPrime Numbers in 1-1000");
		
		list.stream().filter(LamdaExpression.isPrime()).forEach(System.out::println);
		
		System.out.println("\nPalindrome NUmbers in 1-1000");
		
		list.stream().filter(LamdaExpression.isPalindrome()).forEach(System.out::println);

	}

}
