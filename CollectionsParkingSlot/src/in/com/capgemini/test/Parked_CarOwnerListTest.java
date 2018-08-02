package in.com.capgemini.test;

public class Parked_CarOwnerListTest {

	public static void main(String[] args) throws CarNotFoundException, parkingAreaNotAvailableException, InvalidTokenException {

		Parked_CarOwner_Details alfaiz = new Parked_CarOwner_Details("Alfaiz", "i10", "BH1254", 70012306, "patna");
		Parked_CarOwner_Details saif = new Parked_CarOwner_Details("saif", "i20", "WB2254", 87099492, "kolkata");
		Parked_CarOwner_Details nehal = new Parked_CarOwner_Details("nehal", "ferrari", "MH1458", 12345678, "pune");

		Parked_CarOwnerList parked_CarOwnerList = new Parked_CarOwnerList();
		
		//Adding Objects 
try {
		int token = parked_CarOwnerList.add_new_car(alfaiz);
		System.out.println("\nYour Token number for Car number "+alfaiz.getCarNO()+" is "+ token);
		
		token = parked_CarOwnerList.add_new_car(saif);
		System.out.println("\nYour Token number for Car number "+saif.getCarNO()+" is "+ token);
		
		token = parked_CarOwnerList.add_new_car(nehal);
		System.out.println("\nYour Token number for Car number "+nehal.getCarNO()+" is "+ token);
		
}catch (parkingAreaNotAvailableException e) {
		e.printStackTrace();
	}	
		//removing Objects 
	try {	
		  parked_CarOwnerList.remove_car(saif);
	}catch (CarNotFoundException e) {
	   e.printStackTrace();
	} 
		
		int a[] = parked_CarOwnerList.get_parked_car_location(1);
		System.out.println("\nThe Floor number is : " + a[0]);
		System.out.println("The Section number is : " + a[1]);
		System.out.println("In That Section Address is : "+a[2]);
		
		
		int b[] = parked_CarOwnerList.get_parked_car_location(3);
		System.out.println("\nThe Floor number is : " + b[0]);
		System.out.println("The Section number is : " + b[1]);
		System.out.println("In That Section Address is : "+b[2]);
		

	}

}
