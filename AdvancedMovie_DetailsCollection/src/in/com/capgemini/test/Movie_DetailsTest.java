package in.com.capgemini.test;

import java.util.Scanner;

public class Movie_DetailsTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Movie_Details Fukrey = new Movie_Details("Fukrey","SRK","Deepika", "Comedy");
		Movie_Details HNY = new Movie_Details("HNY","SRK","Deepika", "Dance");
	
		Movie_DetailsList movie_DetailsList = new Movie_DetailsList();
		
		movie_DetailsList.add_movie(Fukrey);
		movie_DetailsList.add_movie(HNY);		
		
		movie_DetailsList.remove_movie(Fukrey);
		
		movie_DetailsList.remove_AllMovies();
		
		movie_DetailsList.add_movie(HNY);
		movie_DetailsList.add_movie(Fukrey);
		
		System.out.println("\nBy Name HNY : " +movie_DetailsList.find_by_movie_name("HNY"));
		
		System.out.println("\nBy Genre Dance : "+movie_DetailsList.find_by_movie_Genre("Dance"));
		
		
		System.out.println("Enter The Parameter you want to sort with : ");
		String parameter = scanner.next();
		movie_DetailsList.SortingParameter(parameter);
	}

}
