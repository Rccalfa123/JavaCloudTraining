package in.com.capgemini.test;

import java.time.LocalDate;
import java.util.TreeSet;

public class AssignmentCollections {

	private LocalDate SortedDueDate[];
	private TreeSet<HomeWorkAssignments> treeSet = new TreeSet<>();
	
	  public void addNewAssignment(HomeWorkAssignments assignments) {
		   		   
		  treeSet.add(assignments);
		  Display();
	   }
	   
	 public void RemoveAnAssignment(HomeWorkAssignments assignments) {
		   
		   treeSet.remove(assignments);
		   Display();   
	   }
	
	 public void Display() {
		   System.out.println("******************************");
		treeSet.stream().forEach(System.out::println);   
	}
	 
	 public HomeWorkAssignments findAnAssignmentEarliestDueDate() {
		 LocalDate EarliestDueDate = LocalDate.now().plusYears(20);
		 for(HomeWorkAssignments values : treeSet)
		 {
			if(values.getDue_Date().isBefore(EarliestDueDate))
			{
				EarliestDueDate = values.getDue_Date();
			}
			
		 }
		 
		 for(HomeWorkAssignments values : treeSet)
		 {
			if(values.getDue_Date().isEqual(EarliestDueDate))
			{
				return values;
			}
			
		 }
		return null;	   
	 }
}
