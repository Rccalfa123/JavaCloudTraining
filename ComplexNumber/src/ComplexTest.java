import java.util.*;
public class ComplexTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
			Complex complex1 = new Complex();
			Complex complex2 = new Complex();
			Complex complex3 = new Complex();
			
			System.out.println("Enter the first Complex Number");
			complex1.set(scanner.nextFloat(), scanner.nextFloat()); 
			
			System.out.println("Enter the second Complex Number");
			complex2.set(scanner.nextFloat(), scanner.nextFloat());
			
			complex3 =  complex1.sum(complex1, complex2);
			System.out.println(complex3);
			
		}
		
		
	}


