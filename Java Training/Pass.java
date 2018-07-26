import java.util.Scanner;
class Pass{
	
     static void pass(int m,int e,int s){
		 if(m<0||m>100||e<0||e>100||s<0||s>100)
			 System.out.println("Invalid Input");
		 else
		 {
		 if(m>60 && e>60 && s>60)
		   System.out.println("Passed");
	     else if(m>60&&e>60&&s<=60 || m>60&&s>60&&e<=60||e>60&&s>60&&m<=60)
		   System.out.println("promoted");
	     else if(m>60&&e<60&&s<=60 || m<60&&s>60&&e<=60||e>60&&s<60&&m<=60)
		   System.out.println("failed");
	     else
		   System.out.println("failed");
		 } 
	}
	
	public static void main(String args[]){
	    Scanner a = new Scanner(System.in);
		System.out.println("Enter marks in Maths : ");
		int m = a.nextInt();
		System.out.println("Enter marks in English : ");
		int e = a.nextInt();
		System.out.println("Enter marks in Science : ");
		int s = a.nextInt();
		pass(m,e,s);
	}
}