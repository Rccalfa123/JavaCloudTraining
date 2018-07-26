
public class TrainingTest {

	private static void getCost(Training training) 
	{	
		System.out.println("Training Order Value is : "+training.getOderValue());
	}
	
	public static void main(String[] args) {
		
		Training publicTraining = new PublicTraining(1,"java",5000,50);
		System.out.println(publicTraining);
		getCost(publicTraining);
		
		System.out.println("");
		
		
		Training corporateTraining = new CorporateTraining(2, "Big Data", 35000, 4);
		System.out.println(corporateTraining);
		getCost(corporateTraining);
		
		
	}

}
