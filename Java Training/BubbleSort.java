//Search an element in an Array
import java.util.Scanner;
class BubbleSort{
	
	public static void main(String args[]){
	    Scanner a = new Scanner(System.in);
		int arr[] = new int[15];
		int temp;
		for(int i=0;i<8;i++)
		 {
			System.out.println("Enter arr["+i+"] : ");
			 arr[i] = a.nextInt();
		 }
		 
		System.out.println("Created Array is : ");
		for(int i=0;i<15;i++)
		 {
			System.out.print(" "+arr[i]+" ");
		 }
		
		for(int i=0;i<15;i++)
		{
			for(int j=i+1;j<15;j++)
			{
				if(arr[i]>arr[j])
				{
				    temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;	
				}
			}
		}
		System.out.println("");
		System.out.println("Sorted Array is : ");
		for(int i=0;i<15;i++)
		 {
			System.out.print(" "+arr[i]+" ");
		 }
		
		
	}
}