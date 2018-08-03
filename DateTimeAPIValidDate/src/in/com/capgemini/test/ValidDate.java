package in.com.capgemini.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidDate {

	  public static boolean isValid(String date)
	  {
		  int dateArray[] = new int[10];;
		  while()
		  dateArray = Integer.parseInt(date.split("/"));
		    
		  
	  }
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the date in (dd/mm/yyyy) format : ");
		String date = scanner.nextLine();
	
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate localDate = (LocalDate) dateTimeFormatter.pa
        
        System.out.println(localDate);

	}

}
