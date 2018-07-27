//Test Class for Games
public class Demo {

	public static void perform(Game game)
	{
		game.play();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game cricket = new Cricket();
		perform(cricket);
		
		Game football = new Football();
		perform(football);
		
		Game tennis = new Tennis();
		perform(tennis);
	}

}
