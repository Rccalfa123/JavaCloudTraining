import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// taking pfRate from user 
		System.out.println("Enter pfRate : ");
	    double pfRate = scanner.nextDouble();
		Employee Alfaiz = new Employee(10000,pfRate);// passing Employee Monthly basic and Pf Rate;
		System.out.println(Alfaiz);
	}

}
