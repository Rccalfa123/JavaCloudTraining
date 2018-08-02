package in.com.capgemini.com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<MyClass> arrayList;
	
		FileInputStream fin = new FileInputStream("myClass.txt");
		ObjectInputStream ois = new ObjectInputStream(fin);
		
			arrayList = (ArrayList<MyClass>) ois.readObject();
			fin.close();
		System.out.println(arrayList);
		
		System.out.println("Deserialization Successful...");


	}

}
