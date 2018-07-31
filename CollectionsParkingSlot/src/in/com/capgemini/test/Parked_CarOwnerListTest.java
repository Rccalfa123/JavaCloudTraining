package in.com.capgemini.test;

public class Parked_CarOwnerListTest {

	public static void main(String[] args) {

		Parked_CarOwner_Details alfaiz = new Parked_CarOwner_Details("Alfaiz", "i10", "BH1254", 70012306, "patna");
		Parked_CarOwner_Details saif = new Parked_CarOwner_Details("saif", "i20", "WB2254", 87099492, "kolkata");
		Parked_CarOwner_Details nehal = new Parked_CarOwner_Details("nehal", "ferrari", "MH1458", 12345678, "pune");

		Parked_CarOwnerList parked_CarOwnerList = new Parked_CarOwnerList();

		//Adding Objects 
		parked_CarOwnerList.add_new_car(alfaiz);
		parked_CarOwnerList.add_new_car(nehal);
		parked_CarOwnerList.add_new_car(saif);
		
		//removing Objects 
		parked_CarOwnerList.remove_car(saif);
		
		

	}

}
