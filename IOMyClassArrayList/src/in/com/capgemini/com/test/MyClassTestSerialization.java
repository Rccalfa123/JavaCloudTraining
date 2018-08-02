package in.com.capgemini.com.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MyClassTestSerialization {

	public static void main(String[] args) {
     MyClass alfaiz = new MyClass("Alfaiz", 5);
     MyClass saif = new MyClass("Saif", 6);
     MyClass nehal = new MyClass("Nehal", 2);
     MyClass rana = new MyClass("Rana", 9);
     MyClass sam = new MyClass("Sam", 1);
     
     List<MyClass> arrayList = new ArrayList<>();
     arrayList.add(sam);
     arrayList.add(rana);
     arrayList.add(nehal);
     arrayList.add(saif);
     arrayList.add(alfaiz);
     
     
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("myClass.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(arrayList);
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
