package in.com.capgemini.test;

public class Movie_Details implements Comparable<Movie_Details>{

	private String mov_name;
	private String lead_actor;
	private String lead_actress;
	private String genre;
	
	
	public Movie_Details(String mov_name, String lead_actor, String lead_actress, String genre) {
		this.mov_name = mov_name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}
	
	protected String getMov_name() {
		return mov_name;
	}
	protected void setMov_name(String mov_name) {
		this.mov_name = mov_name;
	}
	protected String getLead_actor() {
		return lead_actor;
	}
	protected void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	protected String getLead_actress() {
		return lead_actress;
	}
	protected void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}
	protected String getGenre() {
		return genre;
	}
	protected void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	@Override
	public String toString() {
		return "Movie_Details [mov_name=" + mov_name + ", lead_actor=" + lead_actor + ", lead_actress=" + lead_actress
				+ ", genre=" + genre + "]";
	}

	@Override
	public int compareTo(Movie_Details arg0)
	{
		
		return this.mov_name.compareTo(arg0.mov_name);
	}
	
	
	
}
