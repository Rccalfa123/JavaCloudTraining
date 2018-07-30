package in.com.capgemini.test;

import java.util.Set;
import java.util.TreeSet;

public class Movie_DetailsList {

	Set<Movie_Details> treeSet = new TreeSet<>();

	public void add_movie(Movie_Details alfaiz) {
		treeSet.add(alfaiz);
		System.out.println("\nAfter Adding Movie : " + alfaiz.getMov_name());
		treeSet.stream().forEach((treeSetList) -> System.out.println(treeSetList));

	}

	public void remove_movie(Movie_Details alfaiz) {
		treeSet.remove(alfaiz);
		System.out.println("\nAfter Removing Movie :  " + alfaiz.getMov_name());
		treeSet.stream().forEach((treeSetList) -> System.out.println(treeSetList));

	}

	public void remove_AllMovies() {

		treeSet.removeAll(treeSet);
		System.out.println("\nAfter Removing All Movies ");
		treeSet.stream().forEach((treeSetList) -> System.out.println(treeSetList));
	}

	public Movie_Details find_by_movie_name(String Movie_Name) {
		  
		for(Movie_Details movie : treeSet) {
		    if(movie.getMov_name().equals(Movie_Name))
		       {
		    	  return movie;
		       }
		}
	  return null;
	}
	
	public Movie_Details find_by_movie_Genre(String Movie_Genre) {
		  
		for(Movie_Details movie : treeSet) {
		    if(movie.getGenre().equals(Movie_Genre))
		       {
		    	  return movie;
		       }
		}
	  return null;
	}
	
	public void SortingParameter(String parameter)
	{
	       
		
		
	}
	
	
}
