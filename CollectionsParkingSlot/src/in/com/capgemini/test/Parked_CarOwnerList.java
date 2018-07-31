package in.com.capgemini.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Parked_CarOwnerList {
//Total capacity of Parking Area
    private static final int TOTAL_AVAILABLE_SPACE = 240;

    Consumer<Parked_CarOwner_Details> paConsumer = System.out::println;

	private  List parkingArea;
	
	private int noOfAvailableSlots = 240;
	
	public Parked_CarOwnerList() {
		parkingArea = new ArrayList<>(TOTAL_AVAILABLE_SPACE);
		for(int i=0;i<TOTAL_AVAILABLE_SPACE;i++)
		{
			parkingArea.add(i,Parked_CarOwner_Details.checkingObject);
		}
		
	}

	public int add_new_car(Parked_CarOwner_Details parked_owner_Details) throws parkingAreaNotAvailableException 
	{
		int token = 0;
		if(noOfAvailableSlots==0)
		{
			throw new parkingAreaNotAvailableException("No Space Available for Parking");
		}
		else
		{
			for(int i = 0; i<parkingArea.size();i++)
			{
				if(parkingArea.get(i).equals(Parked_CarOwner_Details.checkingObject))
				{
					parkingArea.add(i, parked_owner_Details);
					parkingArea.stream().forEach(paConsumer);
					token = parkingArea.indexOf(parked_owner_Details);
					noOfAvailableSlots--;
					return token+1;
					
				}
				
			}
			
			throw new parkingAreaNotAvailableException("No Space Available for Parking");
		}
		
	}
	
	public void remove_car(Parked_CarOwner_Details parked_owner_Details) throws CarNotFoundException
	{
		int index = parkingArea.indexOf(parked_owner_Details);
		if(index == -1)
		{
			throw new CarNotFoundException("Unable to find Car with given Details.....");
		}
		else
		{
			//parkingArea.stream().forEach(paConsumer);
			parkingArea.add(index, Parked_CarOwner_Details.checkingObject);
			noOfAvailableSlots++;
		}
		
	}
	
	public int[] get_parked_car_location(int token) throws InvalidTokenException
	{
		if(parkingArea.get(token-1).equals(Parked_CarOwner_Details.checkingObject) || token < 0)
		{
			throw new InvalidTokenException("Invalid Token....");
		}
		else
		{
			int A[] = new int[10];
			A[0] = token%80;
			A[1] = token%20;
			A[3] = parkingArea.get(token-1).hashCode();
			return A;
		}
		
	}
}
