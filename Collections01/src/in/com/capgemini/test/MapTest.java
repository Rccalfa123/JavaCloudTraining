package in.com.capgemini.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
     //Creating HashMap		
		Map<String,String> hashMap = new HashMap<>();
		
	//Adding Elements	
		hashMap.put("Amit", "Lichi");
		hashMap.put("Abhirup", "Banana");
		hashMap.put("Mehul", "Apple");
		hashMap.put("Alfaiz", "Mango");
		hashMap.put("Moulima", "Chikuu");
		
		
		//Get values for individual Keys
		System.out.println("The favourite Fruit of Amit is "+hashMap.get("Amit"));
		System.out.println("The favourite Fruit of Alfaiz is "+hashMap.get("Alfaiz"));
		System.out.println("\n");

		
		
		
		Set<Map.Entry<String,String>> values = hashMap.entrySet();//getting all keys for iteration
		
		 for(Map.Entry<String, String> map : values)  
		 {
			 System.out.println(map.getKey() + " Likes "+map.getValue());
		 }

	}

}
