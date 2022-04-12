import java.sql.*;
import java.io.*;

public class select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/movies";
		String user ="root";
		String pass = "";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		String query = "select*from movies";
		
		Statement stm = con.createStatement();
		ResultSet set  = stm.executeQuery(query);
		
		while(set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String actor = set.getString(3);
			String actress = set.getString(4);
			String director = set.getString(5);
			int year = set.getInt(6);
			
			System.out.println(id+":"+name+":"+actor+":"+actress+":"+director+":"+year);
		}
		con.close();
		
	}

}
