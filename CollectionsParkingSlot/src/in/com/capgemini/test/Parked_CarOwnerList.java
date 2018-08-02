package in.com.capgemini.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Parked_CarOwnerList {
//Total capacity of Parking Area
	private static final int TOTAL_AVAILABLE_SPACE = 240;

	private List parkingArea;

	private int noOfAvailableSlots = 240;

	public Parked_CarOwnerList() {
		parkingArea = new ArrayList<>(TOTAL_AVAILABLE_SPACE);
		for (int i = 0; i < TOTAL_AVAILABLE_SPACE; i++) {
			parkingArea.add(i, Parked_CarOwner_Details.checkingObject);
		}

	}

	public int add_new_car(Parked_CarOwner_Details parked_owner_Details) throws parkingAreaNotAvailableException {
		int token = 0;
		if (noOfAvailableSlots == 0) {
			throw new parkingAreaNotAvailableException("No Space Available for Parking");
		} else {
			for (int i = 0; i < parkingArea.size(); i++) {
				if (parkingArea.get(i).equals(Parked_CarOwner_Details.checkingObject)) {
					parkingArea.add(i, parked_owner_Details);
					for (Object e : parkingArea) {
						System.out.print("\n" + e);
					}
					token = parkingArea.indexOf(parked_owner_Details);
					noOfAvailableSlots--;
					return token + 1;

				}

			}

			throw new parkingAreaNotAvailableException("No Space Available for Parking");
		}

	}

	public void remove_car(Parked_CarOwner_Details parked_owner_Details) throws CarNotFoundException {
		int index = parkingArea.indexOf(parked_owner_Details);
		if (index == -1) {
			throw new CarNotFoundException("Unable to find Car with given Details.....");
		} else {
			parkingArea.remove(parked_owner_Details);
			parkingArea.add(index, Parked_CarOwner_Details.checkingObject);
			for (Object e : parkingArea) {
				System.out.println("\n" + e);
			}
			noOfAvailableSlots++;
		}

	}

	protected List getParkingArea() {
		return parkingArea;
	}

	public int[] get_parked_car_location(int token) throws InvalidTokenException {
		if (parkingArea.get(token - 1).equals(Parked_CarOwner_Details.checkingObject) || token < 0) {
			throw new InvalidTokenException("Invalid Token....");
		} else {
			int A[] = new int[10];
			if (token < 81) {
				A[0] = 1;
				if (token < 21) {
					A[1] = 1;
				}
				if (token > 20 && token < 41) {
					A[1] = 2;
				}
				if (token > 40 && token < 60) {
					A[1] = 3;
				}
			}
			if (token > 80 && token < 161) {
				A[0] = 2;
				if (token < 121) {
					A[1] = 1;
				}
				if (token > 120 && token < 141) {
					A[1] = 2;
				}
				if (token > 140 && token < 161) {
					A[1] = 3;
				}

			}
			if (token > 160 && token < 240) {
				A[0] = 3;
				if (token < 181) {
					A[1] = 1;
				}
				if (token > 180 && token < 201) {
					A[1] = 2;
				}
				if (token > 200 && token < 241) {
					A[1] = 3;
				}
			}
			
			A[2] = parkingArea.get(token - 1).hashCode();
			
			return A;
		}

	}
}
