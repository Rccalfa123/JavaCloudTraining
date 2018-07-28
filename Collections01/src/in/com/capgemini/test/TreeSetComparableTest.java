package in.com.capgemini.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparableTest {

	public static void main(String[] args) {
		
		//Creating treeset for Sorting Car Object by some parameter
		Set<Car> treeSetCar = new TreeSet<>();
		
		Car alto = new Car("Suzuki", "Alto800", 2000, 650000);
		Car dezire = new Car("DezireMaker", "SwiftDezire", 2008, 650000);
		Car sumo = new Car("Mahindra", "TataSumo", 1998, 650000);
		
		treeSetCar.add(alto);
		treeSetCar.add(dezire);
		treeSetCar.add(sumo);
		
		for(Object o : treeSetCar)
		{
			System.out.println(o);
		}
		
	}

}
