package WritingFile1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingText2 {

	public static void main(String[] args) throws IOException {
		//Stream Connectivity
		File fis = new File ("C:\\Eclipe Workspace 2\\FileText.txt");
		FileWriter fw= new FileWriter(fis,false);
		BufferedWriter writer= new BufferedWriter(fw);
		
		
		
		// Writing inside the file
		/*writer.newLine();
		writer.write("My first line added");
		writer.newLine();
		writer.write("This is my second line");
		writer.newLine();
		writer.write("Third new line");*/
		
		//Method 2 writing inside the table
		
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++) {
				int num = (int) (Math.random()*100);
			writer.write(num + "\t");
		}}
		
		
		
		// Closing Stream
		writer.close();
		System.out.println("File is created");
		
	}

}
