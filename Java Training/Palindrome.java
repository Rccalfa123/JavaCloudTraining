import java.util.Scanner;
class Palindrome{
	
	public static void main(String args[]){
	    Scanner a = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = a.nextInt();
		if(n<0)
		{
			System.out.println("No it is not a Palindrome number.");
		}
		else
		{		
		
		int sum=0;
		int x = n;//Store value before using
		while(n!=0)
		{
			int k = n%10;
			sum = sum*10+k;
			System.out.println("Sum : "+ sum);
			n=n/10;
		}
		if(sum == x)
			System.out.println("Yes it is a Palindrome number.");
		else
			System.out.println("No it is not a Palindrome number.");
	}
	}
}