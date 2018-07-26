import java.util.*;
public class TraingleTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Traingle myTriangle = new Traingle();
		System.out.println("Enter the Sides of Traingle : ");
		myTriangle.setSide_ab(scanner.nextDouble());
		myTriangle.setSide_bc(scanner.nextDouble());
		myTriangle.setSide_ca(scanner.nextDouble());
		System.out.println(myTriangle.isEquilateral());
		System.out.println(myTriangle.isRight());
		System.out.println(myTriangle.isIsoceles());
		System.out.println(myTriangle.isScalene());
	
	}

}
