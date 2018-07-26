import java.util.Scanner;
class Date{
	
     static void date(int d,int m,int y){
	     String k;
		   if(m == 1)
		     k="January";
	     else if(m == 2) 
		     k="February";
		 else if(m == 3) 
		     k="March";
		 else if(m == 4) 
		     k="April";
	     else if(m == 5) 
		     k="May";
		 else if(m == 6) 
		     k="June";
		 else if(m == 7) 
		     k="July";
		 else if(m == 8) 
		     k="August";
		 else if(m == 9) 
		     k="September";
		 else if(m == 10) 
		     k="October";
		 else if(m == 11) 
		     k="November";
		 else  
		     k="December";
	    
		if(d<10)	 
		 System.out.println("Date : 0"+d+"/"+k+"/"+y);
	    else
		  System.out.println("Date : "+d+"/"+k+"/"+y);	
	}
	
	public static void main(String args[]){
	    Scanner a = new Scanner(System.in);
		System.out.println("Enter DD : ");
		int d = a.nextInt();
		if(d <= 0 && d>31)
		{
			System.out.println("Invalid DD");
			java.lang.System.exit(0);
		}
		System.out.println("Enter MM : ");
		int m = a.nextInt();
				if(m <= 0 && m>12)
		{
			System.out.println("Invalid MM");
			java.lang.System.exit(0);
		}
		System.out.println("Enter YYYY : ");
		int y = a.nextInt();
				if(y <= 0)
		{
			System.out.println("Invalid MM");
			java.lang.System.exit(0);
		}
	
		date(d,m,y);
	}
}