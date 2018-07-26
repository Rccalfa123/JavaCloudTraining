//Date Implementation

import java.time.LocalDate;
import java.time.Period;

public class Date {

	private int d;
	private int m;   //Instance Members;
	private int y;
	
	
	public Date(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;          //Paremetarised Constructor
		this.y = y;
	}


	@Override
	public String toString() {
		return "Date [" + d + "/" + m + "/" + y + "]";   //Override toString Function
	}

	public boolean isSmaller(Date date)
	{
		LocalDate SuppliedDate = LocalDate.of(date.y, date.m, date.d); // Conversion of Input date into Local Date Format for finding peroid.
		LocalDate ObjectDate = LocalDate.of(y, m, d);    // Conversion of Input date into Local Date Format for finding peroid.
		Period gap = Period.between(SuppliedDate,ObjectDate);  //Finding Gap between dates  
		if(gap.getDays()>0)  //Checking if gap is Positive or negative if positive then it'smaller
			return true;     
		else
			return false;
	}
	
	public int []diff(Date date)
	{
		LocalDate SuppliedDate = LocalDate.of(date.y, date.m, date.d); 
		LocalDate ObjectDate = LocalDate.of(y, m, d);
		Period gap = Period.between(SuppliedDate,ObjectDate);
		int A[]=new int[5];   // Initializing local Array to hold day, month and year details.
		A[0] = gap.getDays();
		A[1] = gap.getMonths();
		A[2] = gap.getYears();
		
		return A;
	}
	
	
	
}
