import java.util.Scanner;
class Table1{
	
     static void square(int a){
		 System.out.println(a +"*1="+ a +", Square: "+a*a);
	}
	
	public static void main(String args[]){
	    Scanner a = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int i = a.nextInt();
		square(i);
	}
}