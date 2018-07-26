
public class DateTest {

	public static void main(String[] args) {
	
		Date date1 = new Date(23, 7, 2018);
	    System.out.println(date1);
	    System.out.print("is Number Smmaller ?  ");
	    System.out.println(date1.isSmaller(new Date(20, 07, 2018)));
	    int a[] = new int[5];
	    a = date1.diff(new Date(20, 8, 2014));
	    System.out.println("The Difference of dates is : "+a[0]+" days "+a[1]+" months "+a[2]+" Years ");
	}

}
