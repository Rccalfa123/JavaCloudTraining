package in.com.capgemini.test;

import java.io.File;
import java.util.Scanner;

public class FileExists {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Path");
		String path = scanner.nextLine();
		
		File file  = new File(path);
			
		if(file.exists() && !file.isDirectory())
			System.out.println("File Exists.....");
		else
			System.out.println("File Doesn't Exist.....");
	
	}

}
