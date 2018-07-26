
public class DistanceCalculator {
	
	private int feet ;
	private float inch;
	
	
	//Set function
	public void set(int feet,float inch)
	{
		this.feet = feet;
		this.inch = inch;
	}
	
	//sum function
	public DistanceCalculator sum(DistanceCalculator distance1, DistanceCalculator distance2)
	{
	     distance1.feet = distance1.feet+distance2.feet;
	     distance1.inch = distance1.inch+distance2.inch;
	     if(distance1.inch>=12)
	     {
	    	 int j = (int) (distance1.inch/12);
	    	 distance1.feet += j;
	    	 distance1.inch = distance1.inch%12;
	     }
		 return distance1;
	}
	@Override
	public String toString() {
		return "Distance [feet = "+ feet + ", inch =  " + inch + "]";
	}
	

}
