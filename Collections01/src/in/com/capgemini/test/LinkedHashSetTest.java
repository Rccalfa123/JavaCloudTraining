package in.com.capgemini.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {

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
		

	}

}
