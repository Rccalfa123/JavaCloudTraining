
public class Vehicle {

	private String OwnerName;
	private double currentSpeed;
	private double currentDirection;
	private static double highestVehicleidentification;
	private int vehicle_id;
	
	
	public Vehicle()
	{
	}
	
	public Vehicle(String OwnerName)
	{
		this.OwnerName = OwnerName;
	}
	
	
	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	
	
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public double getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(double currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	public void changeSpeed(double speed)
	{
		currentSpeed = speed;
	}
	
	public void stop()
	{
		currentSpeed = 0;
	}
	
	public void turnByDegree(double degree)
	{
		 currentDirection += degree; 
	}
	
	public void turnByDirection(String direction)
	{
		if(direction == "left")
		{
			currentDirection += 90;
		}
		if(direction == "right")
		{
			currentDirection -= 90;
		}
		else
			System.out.println("Enter proper Directon...");
	}
	
	public static double getHighestVehicleidentification() {
		return highestVehicleidentification;
	}

	public static void setHighestVehicleidentification(double highestVehicleidentification) {
		Vehicle.highestVehicleidentification = highestVehicleidentification;
	}

	@Override
	public String toString() {
		return "Vehicle [OwnerName=" + OwnerName + ", currentSpeed=" + currentSpeed + ", currentDirection="
				+ currentDirection + ", vehicle_id=" + vehicle_id + ", getVehicle_id()=" + getVehicle_id()
				+ ", getOwnerName()=" + getOwnerName() + ", getCurrentSpeed()=" + getCurrentSpeed()
				+ ", getCurrentDirection()=" + getCurrentDirection() +  ", getHighestVehicle()=" + getHighestVehicleidentification() + "]";
	}
}
