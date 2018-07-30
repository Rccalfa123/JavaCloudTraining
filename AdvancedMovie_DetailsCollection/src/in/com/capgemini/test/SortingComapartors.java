package in.com.capgemini.test;

import java.util.Comparator;

  //Sorting Classes for different Parameters All Implementing Comparator 

	   class SortingByMovie_Name implements Comparator<Movie_Details>
	{
	    // Used for sorting in ascending order of
	    // Movie_Name
	    public int compare(Movie_Details fukrey, Movie_Details hNY) // Overriding Compare method
	    {
	        return fukrey.getMov_name().compareTo(hNY.getMov_name());
	    }
	}
	 
	class SortbyLead_Actor implements Comparator<Movie_Details>
	{
	    // Used for sorting in ascending order of
	    // Lead_Actor
	    public int compare(Movie_Details fukrey, Movie_Details hNY)
	    {
	    	return fukrey.getLead_actor().compareTo(hNY.getLead_actor());
	    }
	}
	
	class SortbyLead_Actress implements Comparator<Movie_Details>
	{
	    // Used for sorting in ascending order of
	    // Lead_Actress
	    public int compare(Movie_Details fukrey, Movie_Details hNY)
	    {
	        return fukrey.getLead_actress().compareTo(hNY.getLead_actress());
	    }
	}
	 
	class SortbyGenre implements Comparator<Movie_Details>
	{
	    // Used for sorting in ascending order of
	    // Genre
	    public int compare(Movie_Details fukrey, Movie_Details hNY)
	    {
	        return fukrey.getGenre().compareTo(hNY.getGenre());
	    }
	}
	
