//Tv Class for TV basic Implementation
public class TV {

	private int state;
	private int currentVolume;
	private int currentChannel;
	
	
	public int getState() {
		return state;
	}
	public void setState(int state) { //setting status
		this.state = state;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	public int getCurrentChannel() {
		return currentChannel;
	}
	
	public int changeVolume(int vol_inc_dec)
	{
		if(state == 1)
		{
			if(vol_inc_dec == 1)
			{
				currentVolume += 1;	
			}
			else
			{
				currentVolume -= 1;
			}
			
		}
		return currentVolume;
	}
	
	public int changeChannel(int channel_inc_dec)
	{
		if(state == 1)
		{
			currentChannel += channel_inc_dec;
		}
		return currentChannel;
		
	}
	public void onOFF(int status)
	{
		if(status == 1)
		{
			System.out.println("TV is Kept ON..");
			
		}
		else
		{
			System.out.println("Tv is turned OFF");
		}
	}
	
}
