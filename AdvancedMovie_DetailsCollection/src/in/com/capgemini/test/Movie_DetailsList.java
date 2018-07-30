package in.com.capgemini.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie_DetailsList {
//Creating ArrayList
	List<Movie_Details> arrayList = new ArrayList<>();

	// Add method to add a movie in ArrayList
	public void add_movie(Movie_Details alfaiz) {
		arrayList.add(alfaiz);
		System.out.println("\nAfter Adding Movie : " + alfaiz.getMov_name());
		arrayList.stream().forEach((arrayListList) -> System.out.println(arrayListList));// printing ArrayList

	}

	// Remove method to remove a movie from ArrayList
	public void remove_movie(Movie_Details alfaiz) {
		arrayList.remove(alfaiz);
		System.out.println("\nAfter Removing Movie :  " + alfaiz.getMov_name());
		arrayList.stream().forEach((arrayListList) -> System.out.println(arrayListList));

	}

	// Remove method to remove all movies
	public void remove_AllMovies() {
		arrayList.removeAll(arrayList);
		System.out.println("\nAfter Removing All Movies ");
		arrayList.stream().forEach((arrayListList) -> System.out.println(arrayListList));
	}

	// find by name method to find movie object by name Name Attribute
	public Movie_Details find_by_movie_name(String Movie_Name) {
		for (Movie_Details movie : arrayList) {
			if (movie.getMov_name().equals(Movie_Name)) { // if Movie Name is Equal to passes movie name then return
															// object of that movie
				return movie;
			}
		}
		return null;
	}

	public Movie_Details find_by_movie_Genre(String Movie_Genre) {

		for (Movie_Details movie : arrayList) {
			if (movie.getGenre().equals(Movie_Genre)) { // if Movie Genre Equal to passes movie Genre then return object
														// of that movie
				return movie;
			}
		}
		return null;
	}

	// method for Sorting ArrayList on a Particular Field
	public void SortingParameter(String parameter) {
		if (parameter.equals("Movie_Name")) { // if Passed parameter is equal to Movie_Name
			Collections.sort(arrayList, new SortingByMovie_Name());// Call sort method of Collections with arrayList and
																	// object of Required class which implements
																	// Comparator
			arrayList.stream().forEach((arrayListList) -> System.out.println(arrayListList));

		} else if (parameter.equals("Lead_Actor")) { // if Passed parameter is equal to Lead_Actor
			Collections.sort(arrayList, new SortbyLead_Actor()); // Call sort method of Collections with arrayList and
																	// object of Required class which implements
																	// Comparator
			arrayList.stream().forEach((arrayListList) -> System.out.println(arrayListList));

		} else if (parameter.equals("Lead_Actress")) {
			Collections.sort(arrayList, new SortbyLead_Actress());
			arrayList.stream().forEach((arrayListList) -> System.out.println(arrayListList));

		} else if (parameter.equals("Genre")) {
			Collections.sort(arrayList, new SortbyGenre());
			arrayList.stream().forEach((arrayListList) -> System.out.println(arrayListList));

		} else {
			System.out.println("Invalid Parameter Entered");

		}

	}

}
