import java.util.Scanner;
class SC{
	
     static void Sc(double p,double r,double t){
		 double s = (p*r*t)/100;
		 double k=1;
		 for(int i=0;i<t;i++)
		 {
			 k = k*(1+r/100);
			 System.out.println(" K =  "+ k);
		 }
		 double c =  (p*(k) - p);
		 
		 System.out.println(" Simple Interest = "+ s + ", Compound Interest = "+c);
	}
	
	public static void main(String args[]){
	    Scanner a = new Scanner(System.in);
		System.out.println("Enter the Principal : ");
		double p = a.nextDouble();
				System.out.println("Enter the rate : ");
				   double r = a.nextDouble();
						System.out.println("Enter the time : ");
						   double t = a.nextDouble();
		Sc(p,r,t);
	}
}