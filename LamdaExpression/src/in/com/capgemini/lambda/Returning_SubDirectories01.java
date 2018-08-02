package in.com.capgemini.lambda;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Returning_SubDirectories01 {

    public static void main(String[] args) {
		
    	List<File> list = new ArrayList<File>();
    	File fileArray[] = new File[20];
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter The path : ");
    	String path = scanner.nextLine();
    	File file = new File(path);
    	
    	 fileArray = file.listFiles();
    	
    	 for(int i=0;i<fileArray.length;i++)
    	 {
    		 list.add(fileArray[i]);
    	 }
    		 
    	 list.stream().filter(i-> i.isDirectory()).forEach(System.out::println);	 
    	
	}
	
}
