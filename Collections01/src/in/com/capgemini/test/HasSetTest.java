package in.com.capgemini.test;

import java.util.HashSet;
import java.util.Set;

public class HasSetTest {

	public static void main(String[] args) {
		
		//Creating Object that is similar just reference name is different for checking duplicate input in set
				Set<Object> hashset = new HashSet<Object>();
				
				Car alto = new Car("Suzuki", "Alto800", 2000, 650000);
				Car altoSet = new Car("Suzuki", "Alto800", 2000, 650000);
				
				Laptop lenovo = new Laptop("Lenono", "thinkpad", "Windows10", "i7" );
				Laptop lenovoSet = new Laptop("Lenono", "thinkpad", "Windows10", "i7" );
				
				Television panasonic = new Television("Panasonic", "LCD", true,	15478);
				Television panasonicSet = new Television("Panasonic", "LCD", true,	15478);
				
				CellPhone redmi = new CellPhone("Redmi", "Redmi3s", "4G Volte Set", "Nouget", 6000);
				CellPhone redmiSet = new CellPhone("Redmi", "Redmi3s", "4G Volte Set", "Nouget", 6000);
				
				School bpps = new School("Bpps", "patna", "BPPS", "patna", "A+");
				School bppsSet = new School("Bpps", "patna", "BPPS", "patna", "A+");
				
				hashset.add(alto);
				hashset.add(altoSet);
				
				
				hashset.add(lenovo);
				hashset.add(lenovoSet);
				
				hashset.add(panasonic);
				hashset.add(panasonicSet);
				
				hashset.add(redmi);
				hashset.add(redmiSet);
				
			    hashset.add(bpps);
				hashset.add(bppsSet);
				
				
				System.out.println("HashSet Output : ");
				for(Object e : hashset)
				{
					System.out.println(e+"\n");
				}

	}

}
