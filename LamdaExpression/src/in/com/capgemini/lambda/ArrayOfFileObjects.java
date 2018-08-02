package in.com.capgemini.lambda;

import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArrayOfFileObjects {

	public static void main(String[] args) {  
    	File fileArray[] = new File[20];
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter The path : ");
    	String path = scanner.nextLine();
    	
    	 File file = new File(path);
    	 fileArray = file.listFiles();
    	
    	Set<File> treeSet = new TreeSet<File>( (f1,f2)->{
    			if(f1.isDirectory() && !f2.isDirectory())
    				return -1;
    			else
    				return f1.compareTo(f2);
    	});
    			
    	 for(int i=0;i<fileArray.length;i++)
    	 {
    		 treeSet.add(fileArray[i]);
    	 }
    	 
    	 treeSet.stream().forEach(System.out::println);	 
   }
}
