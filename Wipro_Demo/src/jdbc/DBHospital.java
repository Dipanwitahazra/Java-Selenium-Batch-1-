package jdbc;
import java.sql.*;
import java.util.Scanner;

public class DBHospital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.print("Enter Patient Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Age: ");;
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("Enter Disease: ");
				String disease = sc.nextLine();
				
				System.out.print("Enter Admission Date (YYYY-MM-DD): ");
				String admissionDate = sc.nextLine();
				System.out.print("Enter Doctor Assigned: ");
				String doctor = sc.nextLine();
				
		      String url = "jdbc:mysql://localhost:3306/Hospital";
		      String user = "root";
		      String password = "Dipa@HzTech17";
		
	
		// TODO Auto-generated method stub
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the database successfully!");

	String createTable = "CREATE TABLE IF NOT EXISTS patients (" + "id INT AUTO_INCREMENT PRIMARY KEY," + 
	"name VARCHAR(100)," + "age INT," + "disease VARCHAR(100)," + "admission_date DATE," + "doctor_assigned VARCHAR(100))";
	Statement stmt = con.createStatement();
	stmt.executeUpdate(createTable);

	String insertSQL = "INSERT INTO patients (name, age, disease, admission_date, doctor_assigned) VALUES(?, ?, ?, ?, ?)";
	PreparedStatement pstmt = con.prepareStatement(insertSQL);
	pstmt.setString(1, name);
	pstmt.setInt(2, age);
	pstmt.setString(3,  disease);
	pstmt.setDate(4, Date.valueOf(admissionDate));
	pstmt.setString(5, doctor);
	 pstmt.executeUpdate();
	 System.out.println("Patient registered successfully!");
	 
	 
	 System.out.print("Enter name to delete: ");;
	 String delName = sc.nextLine();
	 String delete = "DELETE FROM patients WHERE name = ?";
	 PreparedStatement delStmt = con.prepareStatement(delete);
	 delStmt.setString(1,  delName);
	 int rows = delStmt.executeUpdate();
	 if(rows > 0)
		 System.out.println("Patient deleted.");
	 else
		 System.out.println("Patient not found.");
	 
	 pstmt.close();
	 stmt.close();
	 con.close();
	 sc.close();
		}
		catch (Exception e) {
			System.out.println("Error occurred:" + e.getMessage());
					e.printStackTrace();
		}
				
					
		}
	
	

}
