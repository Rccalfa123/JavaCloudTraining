import java.util.*;
public class TVTest {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int counter=1; // how many times u want to change
		
		TV tv = new TV();
		int on_off = tv.getState(); // get initial state if tv off turn it ON
		if(on_off==0)  
		{
			System.out.println("Tv is turned ON");
		    tv.setState(1);	
		}
		
	 while(counter == 1) // loop for know how many times user wants to change volume or channel
	{
		System.out.println("Do you want change the volume if yes press 1 else any integer: ");
		counter = scanner.nextInt();
		if(counter!=1)
			break;// if user enters other than 1 the volume doesnt change
		System.out.println("Press 1 for Increasing or Press 0 for decreasing the Volume : ");
		int increase_decrease_vol = scanner.nextInt();		
		System.out.println("New Volume is : "+tv.changeVolume(increase_decrease_vol));//display new Volume
	}	
		counter=1;
	 while(counter == 1)
		{
			System.out.println("Do you want change the Channel if yes press 1 else any integer: ");
			counter = scanner.nextInt();
			if(counter!=1)
				break;// if user enters other than 1 the volume doesnt change
	 
	 	System.out.println("Enter the new Channel : ");
		int increase_decrease_Channel = scanner.nextInt();		
		
		System.out.println("New Channel is : "+tv.changeChannel(increase_decrease_Channel));//display new channel
		}
	 
		System.out.println("Do you want to Turn Off the Tv press 1 for NO 0 for Yes");
		int ON_OFF = scanner.nextInt();
		tv.onOFF(ON_OFF);
	}

}
