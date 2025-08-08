package input_output;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        BufferedReader reader = null; 

        try {
            reader = new BufferedReader(new FileReader("text.txt")); 

            String line;
            while ((line = reader.readLine()) != null) {  
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();  
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}


