package in.com.capgemini.test;
//Class to find Factorial of given including exception Handling
public class Factorial {

	private long fact = 1; 

	public long getFactorial(long getfact) throws InvalidInputException, FactorialException {
	 
	  if (getfact < 2)  // if input is less than 2 throw exception 
		{
		  	fact = (long) Double.POSITIVE_INFINITY;
			throw new InvalidInputException();
		} 
	 
	  else 
		 {
		    for (int i = 1; i <= getfact; i++)   
		      {
				  fact *= i;          //Calculating factorial
				  
				  if (fact > 2147483647)  // if factorial range is greater than integer range throw factorial out of bound exception
				    {
					    fact = (long) Double.POSITIVE_INFINITY;
					    throw new FactorialException();
				    }
			  }
		}
	  return fact;
    }

}
