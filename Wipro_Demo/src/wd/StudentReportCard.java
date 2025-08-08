package wd;

public class StudentReportCard {

	

	    public static void main(String[] args) {
	        
	        String studentName = "Dipanwita Hazra";    
	        int rollNumber = 25;                   
	        char grade = 'A';                       
	        float mathMarks = 88.5f;                
	        float scienceMarks = 91.0f;             
	        float englishMarks = 84.75f;            
	        double totalMarks;                      
	        double percentage;                     	        
	        boolean passed;                         

	       
	        totalMarks = mathMarks + scienceMarks + englishMarks;
	        percentage = (totalMarks / 300) * 100;
	        passed = percentage >= 40;
	        
	        System.out.println(".... Student Report Card.... ");
	        System.out.println("Name       : " + studentName);
	        System.out.println("Roll No.   : " + rollNumber);
	        System.out.println("Grade      : " + grade);
	        System.out.println("------------------------------------------");
	        System.out.println("Math       : " + mathMarks);
	        System.out.println("Science    : " + scienceMarks);
	        System.out.println("English    : " + englishMarks);
	        System.out.println("------------------------------------------");
	        System.out.println("Total Marks: " + totalMarks + " / 300");
	        System.out.printf ("Percentage : %.2f%%\n", percentage);
	        System.out.println("Result     : " + (passed ? "Pass" : "Fail"));
	        
	    }
	}
		
		// TODO Auto-generated method stub

	


