package in.com.capgemini.test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws IOException {
		
		Employee employee = new Employee(155331, "Alfaiz", 20000);
		
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("Employee.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		 System.out.println("Succesfully Serialized........");	

	}

}
