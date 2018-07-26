
public class Time {
	
	private int hours ;
	private int minutes;
	
	
	//Set function
	public void set(int hours ,int minutes)
	{
		this.hours = hours;
		this.minutes = minutes;
	}
	
	//sum function
	public Time sum(Time time1, Time time2)
	{
	     time1.hours = time1.hours+time2.hours;
	     time1.minutes = time1.minutes+time2.minutes;
	     if(time1.minutes>=60)
	     {
	    	 int j = (int) (time1.minutes/60);
	    	 time1.hours += j;
	    	 time1.minutes = time1.minutes%60;
	     }
		 return time1;
	}
	@Override
	public String toString() {
		return "Time [Hours = "+ hours + ", Minutes =  " + minutes + "]";
	}
	

}
