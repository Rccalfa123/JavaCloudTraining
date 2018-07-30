package in.com.capgemini.test;

import java.util.Scanner;

public class Movie_DetailsTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Creating Object of Movie_Details
		Movie_Details Fukrey = new Movie_Details("Fukrey","SRK","Deepika", "Comedy");
		Movie_Details HNY = new Movie_Details("HNY","SRK","Deepika", "Dance");
		Movie_Details Run = new Movie_Details("Run", "Ajay", "Kajol", "LoveStory");
		
		//Creating Objects of Movie_DetailList which will Maintain Movie_Details
		Movie_DetailsList movie_DetailsList = new Movie_DetailsList();
		
		//1.Adding 3 Movies
		movie_DetailsList.add_movie(Fukrey);
		movie_DetailsList.add_movie(HNY);		
		movie_DetailsList.add_movie(Run);
		
		//2.Removing a Movie
		movie_DetailsList.remove_movie(Fukrey);
		
		//3.Removing all Movies
		movie_DetailsList.remove_AllMovies();
		
		
		//4.Adding 2 Movies
		movie_DetailsList.add_movie(HNY);
		movie_DetailsList.add_movie(Fukrey);
		
		
		//Searching on the basis of Movie Name
		System.out.println("\nBy Name HNY : " +movie_DetailsList.find_by_movie_name("HNY"));
		
		//Searching on the Basis of Movie Genre
		System.out.println("\nBy Genre Dance : "+movie_DetailsList.find_by_movie_Genre("Dance"));
		
		//Asking for Parameter from User to Sort
		System.out.println("\nEnter The Parameter you want to sort with Like : 1.Movie_Name  2.Lead_Actor   3.Lead_Actress  4.Genre");
		String parameter = scanner.next();
		movie_DetailsList.SortingParameter(parameter);//Passing Parameter
	}

}
