package input_output;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("text.txt", true));
			writer.write("Hello Learners ");
			writer.newLine();
			System.out.println("Successfully written to file");
		}
		catch(IOException e) 
		{
			System.out.println("An error occured while writing to the file: " + e.getMessage());
			
		}
		finally {
			try 
			{
				if (writer!= null)
					writer.close();
			}
			catch(IOException e)
			{
				System.out.println("Error while closing the writer: " +e.getMessage());
			}
		}
	}
}
	



