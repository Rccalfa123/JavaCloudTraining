import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Time time1 = new Time();
		Time time2 = new Time();
		Time time3 = new Time();
		
		System.out.println("Enter the first time");
		time1.set(scanner.nextInt(), scanner.nextInt());
		
		System.out.println("Enter the second time");
		time2.set(scanner.nextInt(), scanner.nextInt());
		
		time3 =  time1.sum(time1, time2);
		System.out.println(time3);
		

	}

}
