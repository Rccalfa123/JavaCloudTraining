import java.util.Scanner;
class Armstrong{
	
     static void Armstrong(int a){
		 
		 int k = a;
		 int sum=0,j;
		 while(a!=0)
		 {
			 j = a%10;
			 System.out.println("j = "+ j);
			 sum +=j*j*j;
			  System.out.println("Sum = "+ sum);
			 a = a/10;
		 }
		 
		if(sum == k)
			System.out.println("Armstrong Number.....");
		else
			System.out.println("Not an Armstrong Number.....");
	}
	
	public static void main(String args[]){
	    Scanner a = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int i = a.nextInt();
		Armstrong(i);
	}
}