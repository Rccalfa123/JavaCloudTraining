import java.util.Scanner;
class Armstrong2{
	
     static void Armstrong2(int a){
		 
		 int k = a;
		 int sum=0,j;
		 while(a!=0)
		 {
			 j = a%10;
			 //System.out.println("j = "+ j);
			 sum +=j*j*j;
			  //System.out.println("Sum = "+ sum);
			 a = a/10;
		 }
		 
		if(sum == k)
			System.out.println(k +"  is an Armstrong Number.....");
	
	}
	
	public static void main(String args[]){
	    for(int i=100;i<1000;i++)
		  Armstrong2(i);
	}
}