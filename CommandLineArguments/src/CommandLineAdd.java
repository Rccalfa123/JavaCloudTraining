
public class CommandLineAdd {

	public static void main(String []add)
	{
	    double sum = 0; 
		for(int i=0;i<add.length;i++)
	   {
		   sum = sum + Double.parseDouble(add[i]); //  Converting String input into double
	   }
		System.out.println("The Sum is : "+sum);
	}
}
