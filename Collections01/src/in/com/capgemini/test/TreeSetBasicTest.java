package in.com.capgemini.test;

import java.util.Set;
import java.util.TreeSet;



public class TreeSetBasicTest {

	public static void main(String[] args) {

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
			
			
	}

}
