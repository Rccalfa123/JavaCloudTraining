import java.util.*;
public class CountryTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Countries : ");
		int noOfCountries = scanner.nextInt();
		
		Country A[] = new Country[noOfCountries];
		
		for(int i=0;i<A.length;i++)
		{
			System.out.println("\n");
			System.out.println("Enter the Country Name "+(i+1)+": ");
			String CountryName = scanner.next();
			
			System.out.println("Enter the Country Population : ");
			double CountryPopulation = scanner.nextDouble();
			
			System.out.println("Enter the Country Area : ");
			double CountryArea = scanner.nextDouble();
			
			A[i] = new Country();
			A[i].setName(CountryName);
			A[i].setPopulation(CountryPopulation);
			A[i].setArea(CountryArea);
		}
		
		  Country largestArea = A[0].largestArea(A);
		  Country largestPopulation = A[0].largestPopulation(A);
		  Country largestPopulationDensity = A[0].largestPopulationDensity(A);
		  
		  System.out.println("largest Area : "+largestArea);
		  System.out.println("largest population : "+largestPopulation);
		  System.out.println("largest PopulationDensity : "+largestPopulationDensity);
		  
        
	}
}

