import java.util.*;
public class VehicleTest {

	public static void main(String[] args) {
		int ch;
		Scanner scanner = new Scanner(System.in);
		Vehicle porshe = new Vehicle("Alfaiz");
		porshe.setVehicle_id(100);
		porshe.setHighestVehicleidentification(47854);
		System.out.println(porshe);
		do
		{
			System.out.println("Press 1 to Check Owner Name");
			System.out.println("Press 2 for Changing Owner Name : ");
			System.out.println("Press 3 to Check CurrentSpeed : ");
			System.out.println("Press 4 to change speed : ");
			System.out.println("Press 5 to Stop the vehicle : ");
			System.out.println("Press 6 for Cheking Current Direction : ");
			System.out.println("Press 7 for Changing direction by degree");
			System.out.println("Press 8 for Changing direction by left/right turn");
			System.out.println("Press 9 to get highest vehicle identification number : ");
			System.out.println("Press 10 to get Vehicle id number : ");
			System.out.println("\nPlease Enter your Choice : ");
		    ch = scanner.nextInt();
			
		switch(ch)
		  {
		  case 1 : System.out.println(porshe.getOwnerName());
		  		   break;
  
		  case 2 : System.out.println("Enter New name : ");
 		   		   porshe.setOwnerName(scanner.next());
 		   		   System.out.println(porshe.getOwnerName());
 		   		   break;
		  
		  case 3 : System.out.println(porshe.getCurrentSpeed());
		  		   break;
		  
		  
		  case 4 : porshe.changeSpeed(scanner.nextDouble());
		  			System.out.println(porshe.getCurrentSpeed());	
		  		   break;
		  		   
		  case 5 : porshe.stop();
		  		   System.out.println(porshe.getCurrentSpeed());
		  		   break;
		  
		  case 6 : porshe.getCurrentDirection();
                   break;
           
		  case 7 : System.out.println("Enter the degree to turn : ");
		           porshe.turnByDegree(scanner.nextDouble());
		           System.out.println(porshe.getCurrentDirection());
		           break;
		           
		  case 8 : System.out.println("Enter the how to turn : ");
          		   porshe.turnByDirection(scanner.nextLine());
          		   System.out.println(porshe.getCurrentDirection());
          		   break;
		  case 9 : System.out.println(porshe.getHighestVehicleidentification());
		  		   break;
		  		   
		 case 10 : System.out.println(porshe.getVehicle_id());
 		           break;   
 		  
		  }
		  }while(ch<=10);
	
		
		}	

}
