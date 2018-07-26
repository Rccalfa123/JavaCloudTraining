//validating User Login Details
import java.util.Scanner;
class Login{
	
     static int validate(String id,String ps){
		 int flag = 0;
		 String uid = "aullah";  // Temporary database for verification
		 String pwd = "alfa123@"; // Temporary database for verification		 
		  if(uid.equals(id) && pwd.equals(ps))
		  {	
			flag = 1;
			return 1;
		  }
		  else
		  { 
			System.out.println("Incorrect Credentials");
			return 0;
		  }	
	}
	
	public static void main(String args[]){
	    Scanner a = new Scanner(System.in);
		for(int i=0;i<3;i++)//3 Attempts
			{
				System.out.println("Enter User Id : ");
				String id = a.nextLine();
				System.out.println("Enter Password : ");
				String ps = a.nextLine();
				int j = validate(id,ps);
				if(j==1)
				{
					System.out.println("Welcome "+id);
					java.lang.System.exit(0);
				}				
			}
				
			System.out.println("Contact Admin.......");
	}
}