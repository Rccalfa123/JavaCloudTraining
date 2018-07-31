package in.com.capgemini.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrepApplication {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream;	
		InputStreamReader inputStreamReader;
		BufferedReader bufferedReader = null;
		
		File file  = new File(args[1]);
		String line = null;
		int lineNumber=0;
		String tobeMatched = args[0];
		
		
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
			{	lineNumber++;
				if(line.contains(tobeMatched))
				{
					System.out.println("Line Number is : "+lineNumber);
					System.out.println("The Line is : "+line);
				}
			}
		}
	}

}
