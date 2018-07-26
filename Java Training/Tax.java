import java.util.Scanner;
class Tax{
	
     static void tax(double a){
		 if(a>=0 && a<=180000)
		 System.out.println("Nil");
		else if(a>=180001 && a<=300000)
		  System.out.println("TAX = "+ .1*a);
		else if(a>=300000 && a<=500000)
		  System.out.println("TAX = "+ .2*a);
	    else if(a>=500001 && a<=1000000)
		  System.out.println("TAX = "+ .3*a);
	  else if(a>1000000)
		  System.out.println("Income toooooooo high......");
		else
		  System.out.println("Invalid input"); 			
	}
	
	public static void main(String args[]){
	    Scanner a = new Scanner(System.in);
		System.out.println("Enter the Income : ");
		double i = a.nextDouble();
		tax(i);
	}
}