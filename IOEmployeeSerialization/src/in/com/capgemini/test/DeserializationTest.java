package in.com.capgemini.test;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Employee employee;
		
		FileInputStream fin = new FileInputStream("Employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fin);
		
		employee = (Employee) ois.readObject();
		fin.close();
		
		System.out.println(employee);
		
		System.out.println("Deserialization Successful...");

	}

}
