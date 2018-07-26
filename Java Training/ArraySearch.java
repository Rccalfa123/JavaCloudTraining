//Search an element in an Array
import java.util.Scanner;
class ArraySearch{
	
	public static void main(String args[]){
	    Scanner a = new Scanner(System.in);
		int arr[] = new int[15];
		for(int i=0;i<15;i++)
		 {
			System.out.println("Enter arr["+i+"] : ");
			 arr[i] = a.nextInt();
		 }
		
		System.out.println("Enter the Item to be Searched : ");
		int item =  a.nextInt();
		
		int flag=0; 
		 for(int i=0;i<15;i++)
		 {
			 if(arr[i] == item)
			 { 
				flag = 1;//To indicate item is found
				break;
			 }
		 }
		 if(flag == 1)
			 System.out.println("item is found");
		 else
			 System.out.println("Item is not found");
		
	}
}