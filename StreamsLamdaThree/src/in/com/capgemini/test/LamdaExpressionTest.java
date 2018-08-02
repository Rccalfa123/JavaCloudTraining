package in.com.capgemini.test;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionTest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i < 101; i++) {
			list.add(i);
		}
		System.out.println("Displaying the List : ");
		list.stream().forEach(System.out::println);

		System.out.println("\nEven Numbers in 1-100");
		
		list.stream().filter(LamdaExpression.isEven()).forEach(System.out::println);

		System.out.println("\nOdd Numbers in 1-100");
		
		list.stream().filter(LamdaExpression.isOdd()).forEach(System.out::println);
		
		System.out.println("\nAll NUmbers divisible by 6 in 1-100");
		
		list.stream().filter(LamdaExpression.isDivisible_by_6()).forEach(System.out::println);

		System.out.println("\nAll NUmbers less than 12 in 1-100");
		
		list.stream().filter(LamdaExpression.isless_than_12()).forEach(System.out::println);

		System.out.println("\nAll NUmbers greater than 50 in 1-100");
		
		list.stream().filter(LamdaExpression.isgreater_than_50()).forEach(System.out::println);

	}

}
