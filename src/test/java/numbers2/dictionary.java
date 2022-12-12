package numbers2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class dictionary {

	public static void main(String ... args) throws IOException 
	{		
		String fname = "/Users/Amrit/Desktop/text1.rtf";
		Path filePath = Paths.get(fname);
		if(Files.exists(filePath))
	    {
			System.out.println("File exists!");
			
		}
		else
		{
			System.out.println("File does not exist!");
		}
		///Users/Amrit/Selenium/num/target/newfile3.txt
		String[] names = {"Word1", "Meaning 1", "Meaning 2", "Word2", "Meaning1", "Meaning2"};
 		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/Amrit/Desktop/newfile3.txt"));
			 writer.write("Apple- a fruit, a tech firm");
			 writer.write("\n" +"Table-an object, contains rows and columns when used in context of computers");
			 writer.write("\n" +"Orange-a fruit");
			
			for (String name : names) {
				writer.write("\n" + name);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		///Users/Amrit/Selenium/num/target/newfile3.txt

 		try {
 			BufferedReader reader = new BufferedReader(new FileReader("/Users/Amrit/Desktop/newfile3.txt"));
 			String line;
 			while((line = reader.readLine()) != null)  {
 	 			System.out.println(line);

 			}
 			reader.close();
 		} catch (IOException e) {
			e.printStackTrace();
			
	}
	
	}
}