package in.com.capgemini.test;

import java.util.function.Predicate;

public class LamdaExpression {

	public static Predicate<Integer> isEven() {

		Predicate<Integer> predicate = i -> {
			if (i % 2 == 0)
				return true;
			else
				return false;
		};
		return predicate;
	}
	
	public static Predicate<Integer> isOdd() {

		Predicate<Integer> predicate = i -> {
			if (i % 2 == 0)
				return false;
			else
				return true;
		};
		return predicate;
	}

	public static Predicate<Integer> isDivisible_by_6() {

		Predicate<Integer> predicate = i -> {
			if (i % 6 == 0)
				return true;
			else
				return false;
		};
		return predicate;
	}

	public static Predicate<Integer> isless_than_12() {

		Predicate<Integer> predicate = i -> {
			if (i < 12)
				return true;
			else
				return false;
		};
		return predicate;
	}

	public static Predicate<Integer> isgreater_than_50() {

		Predicate<Integer> predicate = i -> {
			if (i > 50)
				return true;
			else
				return false;
		};
		return predicate;
	}
	
}