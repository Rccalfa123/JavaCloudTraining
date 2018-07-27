package in.com.capgemini.test;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Factorial factorial = new Factorial();
	   
		System.out.println("Enter the number u want find the factorial : ");
	    
		long getfact = scanner.nextLong();
	    
		long fact = 0;
		
		try {
			fact = factorial.getFactorial(getfact);
			System.out.println("The Factorial of given number is : "+fact);
		} catch (InvalidInputException | FactorialException e) { // Multiple Catch
			e.printStackTrace();
		}
        
	    
	}

}
