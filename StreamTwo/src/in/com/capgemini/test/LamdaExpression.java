package in.com.capgemini.test;

import java.util.function.Predicate;

public class LamdaExpression {

	public static Predicate<Integer> isOdd() {

		Predicate<Integer> predicate = i -> {
			if (i % 2 == 0)
				return false;
			else
				return true;
		};
		return predicate;
	}

	public static Predicate<Integer> isPrime() {

		Predicate<Integer> predicate = i -> {
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					return false;
			}
			return true;
		};
		return predicate;
	}

	public static Predicate<Integer> isPalindrome() {

		Predicate<Integer> predicate = i -> {
			int Initial = i;
			int sum = 0;
			
			while (i != 0) {
				int k = i % 10;
				sum = (sum * 10) + k;
				i = i / 10;
			}
			if (Initial == sum)
				return true;
			else
				return false;
		};
		return predicate;
	}

}