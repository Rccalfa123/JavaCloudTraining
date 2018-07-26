
public class PublicTraining extends Training{

	private int partcipants;
	
	
	public PublicTraining(int id, String subject, double fees,int participants) {
		super(id, subject, fees);
		this.partcipants = participants;
		// TODO Auto-generated constructor stub
	}

	 
	 public double getOderValue()
	 {
	   return  partcipants * getFees();
		 
	 }


	@Override
	public String toString() {
		return "PublicTraining [partcipants=" + partcipants + ", getOderValue()=" + getOderValue() + ", getId()="
				+ getId() + ", getSubject()=" + getSubject() + ", getFees()=" + getFees() + "]";
	}
}
