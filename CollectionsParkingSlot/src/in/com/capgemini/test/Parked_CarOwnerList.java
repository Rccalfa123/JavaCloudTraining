package in.com.capgemini.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Parked_CarOwnerList {
//Total capacity of Parking Area
    private static final int TOTAL_AVAILABLE_SPACE = 240;

    Consumer<Parked_CarOwner_Details> paConsumer = System.out::println;

	private  List parkingArea;
	
	public Parked_CarOwnerList() {
		parkingArea = new ArrayList<>(TOTAL_AVAILABLE_SPACE);
		for(int i=0;i<TOTAL_AVAILABLE_SPACE;i++)
		{
			parkingArea.add(i,Parked_CarOwner_Details.checkingObject);
		}
		
	}

	public void add_new_car(Parked_CarOwner_Details parked_owner_Details)
	{
		
		
	}
	
	public void remove_car(Parked_CarOwner_Details parked_owner_Details)
	{
		
	}
	
	public String get_parked_car_location(int token)
	{
		
		return "al";
	}
}
