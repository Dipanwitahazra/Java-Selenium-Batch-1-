package wd;

public class OnlineCourse {
    String courseName; // instance variable
    static String platform = "Gate Forum"; // static variable
    public OnlineCourse(String name) {
    	courseName = name;
    }
    	 public void showCourse() {
    	        
    	        int durationWeeks = 8;// Local variable

    	        System.out.println("Course Name: " + courseName);
    	        System.out.println("Duration: " + durationWeeks + " weeks");
    	        System.out.println("Platform: " + platform);
    	    }
    	
	public static void main(String[] args) {
		OnlineCourse course = new OnlineCourse("Java for Beginners");
		course.showCourse();
		// TODO Auto-generated method stub

	}

}
