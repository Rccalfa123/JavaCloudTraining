
public class PersonTest {

	public static void main(String[] args) {

		Person Alfaiz = new Person("Alfaiz",14,8,1996);
		Alfaiz.Display();
		Person Abhirup = new Person("Abhirup",4,4,1995);
		Abhirup.Display();
		System.out.println("");
		System.out.println(Alfaiz.olderOne(Alfaiz, Abhirup));
	}

}
