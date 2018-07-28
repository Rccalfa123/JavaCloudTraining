package in.com.capgemini.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ListTest {

	public static void main(String[] args) {
		Car alto = new Car("Suzuki", "Alto800", 2000, 650000);
		Car dezire = new Car("Yamaha", "SwiftDezire", 2008, 500000);
		Car sumo = new Car("Mahindra", "TataSumo", 1998, 70000);
		
		Laptop lenovo = new Laptop("Lenono", "thinkpad", "Windows10", "i7" );
		Laptop dell = new Laptop("Dell", "inspiron", "Windows7", "i5" );
		Laptop asus = new Laptop("Asus", "blaze", "Ubuntu", "i3" );
		
		Television panasonic = new Television("Panasonic", "LCD", true,	15478);
		Television samsung = new Television("Samsung", "LED", true,	10000);
		Television hyundai = new Television("Hyundai", "Plasma", false,	12000);
		
		CellPhone redmi = new CellPhone("Redmi", "Redmi3s", "4G Volte Set", "Nouget", 6000);
		CellPhone j7pro = new CellPhone("Samsung", "Sj7pro", "4G Volte Set and good handset", "Oreo", 20000);
		CellPhone nokiaN6 = new CellPhone("Nokia", "NokiaN6", "good camera", "Oreo", 14000);
		
		School bpps = new School("Bpps", "patna", "BPPS", "patna", "A+");
		School don_Bosko = new School("Don Bosko", "kolkata", "Don Bosko", "kolkata", "A++");
		School michaels = new School("Michaels", "delhi", "Michaels", "kolkata", "A");
		
		List arrayList = new ArrayList();
		
		arrayList.add(alto);
		arrayList.add(alto);
		arrayList.add(alto);
		
		arrayList.add(lenovo);
		arrayList.add(dell);
		arrayList.add(asus);
		
		arrayList.add(panasonic);
		arrayList.add(samsung);
		arrayList.add(hyundai);
		
		arrayList.add(redmi);
		arrayList.add(j7pro);
		arrayList.add(nokiaN6);
		
		arrayList.add(bpps);
		arrayList.add(don_Bosko);
		arrayList.add(michaels);
		
		System.out.println("ArrayList Output : ");
		for(Object e : arrayList)
		{
			System.out.println(e+"\n");
		}
		
		Set hashset = new HashSet();
		
		
		//Creating Object that is similar just reference name is different for checking duplicate input in set
		Car altoSet = new Car("Suzuki", "Alto800", 2000, 650000);
		Laptop lenovoSet = new Laptop("Lenono", "thinkpad", "Windows10", "i7" );
		Television panasonicSet = new Television("Panasonic", "LCD", true,	15478);
		CellPhone redmiSet = new CellPhone("Redmi", "Redmi3s", "4G Volte Set", "Nouget", 6000);
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
		
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("Alfaiz");
		linkedHashSet.add("Chandrika");
		linkedHashSet.add("Alfaiz");
		linkedHashSet.add("Saif");
		linkedHashSet.add("Nehal");
		linkedHashSet.add("Nehal");
		linkedHashSet.add("Saif");
		linkedHashSet.add("Nehal");
		linkedHashSet.add("Alfaiz");
		
		System.out.println("LinkedhashSet Output : ");
		for(Object e : linkedHashSet)
		{
			System.out.println(e+"\n");
		}
	
		
		
     Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("Alfaiz");
		treeSet.add("Chandrika");
		treeSet.add("Alfaiz");
		treeSet.add("Saif");
		treeSet.add("Nehal");
		treeSet.add("Nehal");
		treeSet.add("Saif");
		treeSet.add("Nehal");
		treeSet.add("Alfaiz");
		
		System.out.println("TreeSet Output : ");
		for(Object e : treeSet)
		{
			System.out.println(e+"\n");
		}
		
		
		Set<Car> treeset2 = new TreeSet<>(); 
		
		treeset2.add(alto);
		treeset2.add(dezire);
		treeset2.add(sumo);
		
		System.out.println("Treeset2 output for Car Specific : ");
		for(Object e : treeset2)
		{
			System.out.println(e+"\n");
		}
		
		
		//Creating HashMap for Key Value Pair 
		Map<String,String> map = new HashMap<>();
		
		map.put("Alfaiz","Mango"); //adding key value pair into hashMap
		map.put("Amit", "Apple");
		map.put("Sam", "Chikuu");
		map.put("Mehul", "Apple");
		map.put("ChanBane", "Lichi");
		
		Set <Map.Entry<String, String>> values = map.entrySet();  //Getting all entries into Set
		
		
		System.out.println("HashMap output : ");
		for(Map.Entry<String, String> e : values)
		{
			System.out.println(e.getKey()+" : "+e.getValue());	// printing all key value pairs
		}
		
		
		
		
	}

}
