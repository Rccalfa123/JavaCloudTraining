
public abstract class Training {

	private int id;
	private String subject;
	private double fees;
	
	  
	public Training(int id, String subject, double fees) {
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getSubject() {
		return subject;
	}
	protected void setSubject(String subject) {
		this.subject = subject;
	}
	protected double getFees() {
		return fees;
	}
	protected void setFees(double fees) {
		this.fees = fees;
	}
	
	
	public abstract double getOderValue();
	 

	@Override
	public String toString() {
		return "Training [id=" + id + ", subject=" + subject + ", fees=" + fees + "]";
	}
}
