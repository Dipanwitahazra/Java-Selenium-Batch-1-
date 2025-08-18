package studentmarks.module;
import java.io.*;
import java.util.*;

	public class StudentMarksAnalysis {
	    public static void main(String[] args) {
	        List<Integer> marks = new ArrayList<>();

	     
	        String fileName = "C:\\Users\\USER\\OneDrive\\Desktop\\marks.txt";

	        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                try {
	                    marks.add(Integer.parseInt(line.trim()));
	                } catch (NumberFormatException e) {
	                    System.out.println("Skipping invalid entry: " + line);
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	            return;
	        }

	        if (marks.isEmpty()) {
	            System.out.println("No marks found in file.");
	            return;
	        }

	      
	        int total = marks.stream().mapToInt(Integer::intValue).sum();
	        double average = (double) total / marks.size();
	        int highest = Collections.max(marks);
	        int lowest = Collections.min(marks);

	    
	        System.out.println("Number of Students: " + marks.size());
	        System.out.println("Average Marks: " + average);
	        System.out.println("Highest Marks: " + highest);
	        System.out.println("Lowest Marks: " + lowest);
	    }
	}

	