import java.util.Scanner;

public class DistanceTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		DistanceCalculator distance1 = new DistanceCalculator();
		DistanceCalculator distance2 = new DistanceCalculator();
		DistanceCalculator distance3 = new DistanceCalculator();
		
		System.out.println("Enter the first Distance");
		distance1.set(scanner.nextInt(), scanner.nextFloat());
		
		System.out.println("Enter the second Distance");
		distance2.set(scanner.nextInt(), scanner.nextFloat());
		
		distance3 =  distance1.sum(distance1, distance2);
		System.out.println(distance3);
		

	}

}
