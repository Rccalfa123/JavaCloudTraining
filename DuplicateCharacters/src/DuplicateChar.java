import java.util.*;;

public class DuplicateChar {

	public static void duplicateRemover(String str)
	{
		char a[] = new char[100];
	    a = str.toCharArray();
        
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<a.length;j++)
	    	{
	    		if(a[j]==a[i])
	    		{
	    			a[j] = '!';
	    		}
	    	}
	    }
	        
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]=='!')
		 {
			 continue;
		 }
		 System.out.print(a[i]);
	 }
		
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String str;

		System.out.println("Enter The String : ");

		str = scanner.nextLine();

		duplicateRemover(str);

//		System.out.println(DistinctString);
	}

}
