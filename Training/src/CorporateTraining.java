
public class CorporateTraining extends Training{
	

	private int days;
	
	
	public CorporateTraining(int id, String subject, double fees,int days) {
		super(id, subject, fees);
	    this.days = days;	
	
	}

	@Override
	public double getOderValue() {
		// TODO Auto-generated method stub
		return days * getFees();
	}
	
	@Override
	public String toString() {
		return "CorporateTraining [days=" + days + ", getOrderValue()=" + getOderValue() + ", getId()=" + getId()
				+ ", getSubject()=" + getSubject() + ", getFees()=" + getFees() + "]";
	}

	

	
}
