package jdbc;

import java.sql.*;

public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "Dipa@HzTech17");
			//String sql="UPDATE patient SET name=? WHERE name=?";
			
			//PreparedStatement pstmt=con.prepareStatement(sql);
	 
			
			//System.out.println("Patient name updated successfully");
			
				
				String sql = "UPDATE patient SET disease = ? WHERE name = ? AND age = ?";
				           PreparedStatement pstmt = con.prepareStatement(sql);
				          String[][] data = 
				            	{
								    {"Diya", "22", "Typhoid"},
								    {"Ashwarya", "22", "Migraine"},
						};
				            for (String[] row : data) {
				               pstmt.setString(1, row[2]);             
				                pstmt.setString(2, row[0]);                    
				                pstmt.setInt(3, Integer.parseInt(row[1]));  
				                pstmt.executeUpdate();
				           }

				           System.out.println("Updated successfully");
								con.close();
							    }
						catch (Exception e)
						{
						e.printStackTrace();
						}
	}
}
						 
						
						 