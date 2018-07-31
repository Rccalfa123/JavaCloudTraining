package in.com.capgemini.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Path");
		String path = scanner.nextLine();
		
		FileInputStream fileInputStream;	
		BufferedReader bufferedReader = null;
		InputStreamReader inputStreamReader;
		
		File file  = new File(path);
		String line = null;
		int wordCount=0;
		
		if(file.exists() && !file.isDirectory())
		{
			try {
				   
				   fileInputStream = new FileInputStream(file);
				   inputStreamReader = new InputStreamReader(fileInputStream);
				  bufferedReader = new BufferedReader(inputStreamReader);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			while((line = bufferedReader.readLine())!=null)
			{
					String []WordList = line.split(" ");
					wordCount += WordList.length;	
			}
			System.out.println("The NUmber of Words in File is : "+wordCount);
		}
		else
		{
			System.out.println("File Doesn't Exist....");
		}
		
			
	
	}

}
