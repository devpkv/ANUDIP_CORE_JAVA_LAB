package question2;

import java.sql.*; 

public class ReadInformation {

	public static void main(String[] args) throws SQLException {
		
		String port = "9909"; 
		String database = "sakila";
		String username = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:"+port+"/"+database;
		 
		Connection conn = DriverManager.getConnection(url, username, password);
		
		Statement stmt = conn.createStatement();
		
		String sql = "SELECT author_id,name,city FROM author WHERE city LIKE 'S%'";
		
		ResultSet rs = stmt.executeQuery(sql);
		 
		while(rs.next())
		{
			System.out.println(rs.getInt(1) +"  "+ rs.getString(2) +" "+rs.getString(3));
		}
		
		
		

	}

}
