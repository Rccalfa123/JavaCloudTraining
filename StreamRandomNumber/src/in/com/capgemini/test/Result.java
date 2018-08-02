package in.com.capgemini.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Result {

	public static void main(String[] args) throws IOException {

		File file = new File("boy.txt");
		FileWriter fileWriter = new FileWriter(file);

		for (int i = 0; i < 100; i++) {
			int random = (int) (Math.random() * (49 - 1));
			if(random == 0)
			{
			  ++random;
			}
			fileWriter.write(random + "\n");
		}
		fileWriter.close();
		System.out.println("Write Success");

		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		Set<Integer> treeSet = new TreeSet<Integer>();

		String line = null;

		while ((line = bufferedReader.readLine()) != null) {

			  treeSet.add(Integer.valueOf(line));
		}

		treeSet.stream().forEach(i->System.out.println(i));
		
		bufferedReader.close();
	}
     
	   
}
