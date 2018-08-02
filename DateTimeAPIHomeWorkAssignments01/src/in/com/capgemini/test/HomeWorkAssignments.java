package in.com.capgemini.test;

import java.time.LocalDate;

public class HomeWorkAssignments implements Comparable<HomeWorkAssignments>{

	private LocalDate due_Date;
 	private LocalDate issue_date;
 	private String AssignmentName;
	
 	
	public HomeWorkAssignments(LocalDate due_Date, LocalDate issue_date, String assignmentName) {
		super();
		this.due_Date = due_Date;
		this.issue_date = issue_date;
		AssignmentName = assignmentName;
	}

	protected String getAssignmentName() {
		return AssignmentName;
	}

	protected LocalDate getDue_Date() {
		return due_Date;
	}

	protected LocalDate getIssue_date() {
		return issue_date;
	}

	@Override
	public String toString() {
		return "HomeWorkAssignments [due_Date=" + due_Date + ", issue_date=" + issue_date + ", AssignmentName="
				+ AssignmentName + "]";
	}
	

	@Override
	public int compareTo(HomeWorkAssignments arg0) {
		return this.due_Date.compareTo(arg0.getDue_Date());
	} 
 		
	
	
}
