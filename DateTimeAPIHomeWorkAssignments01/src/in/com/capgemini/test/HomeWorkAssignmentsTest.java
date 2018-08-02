package in.com.capgemini.test;

import java.time.LocalDate;

public class HomeWorkAssignmentsTest {

	public static void main(String[] args) {
		
		HomeWorkAssignments assignmentLambda = new HomeWorkAssignments(LocalDate.now().plusDays(10),LocalDate.now(),"Lambda");
		
		HomeWorkAssignments assignmentInheritance = new HomeWorkAssignments(LocalDate.now().plusDays(15),LocalDate.now(),"Inheritance");				
		
		HomeWorkAssignments assignmentStream = new HomeWorkAssignments(LocalDate.now().plusDays(5),LocalDate.now(),"Stream");
		
		HomeWorkAssignments assignmentLang = new HomeWorkAssignments(LocalDate.now().plusDays(8),LocalDate.now(),"Lang");
		
		AssignmentCollections assignmentCollections = new AssignmentCollections();
		
		System.out.println("\nAdding");
		assignmentCollections.addNewAssignment(assignmentLambda);
		System.out.println("\nAdding");
		assignmentCollections.addNewAssignment(assignmentStream);
		System.out.println("\nAdding");
		assignmentCollections.addNewAssignment(assignmentInheritance);
		System.out.println("\nAdding");
		assignmentCollections.addNewAssignment(assignmentLang);
		
		
		System.out.println("\n Displaying in Sorted order : ");
		assignmentCollections.Display();
		
		
		System.out.println("\nRemoving");
		assignmentCollections.RemoveAnAssignment(assignmentStream);
		
		
		System.out.println("\nFinding");
		HomeWorkAssignments assignments = assignmentCollections.findAnAssignmentEarliestDueDate();
		System.out.println(assignments);
		
		

	}

}
