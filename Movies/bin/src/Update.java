
import java.sql.*;
import java.io.*;

public class Update {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 
		String url = "jdbc:mysql://localhost:3306/movies";
		String user ="root";
		String pass = "";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		String sq = "update movies set release_year=?, where film_id=?";
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter correct year :");
		int year = Integer.parseInt(bf.readLine());
		
		System.out.println("Enter film id :");
		int filmid = Integer.parseInt(bf.readLine());
		
		PreparedStatement stm = con.prepareStatement(sq);
		stm.setInt(1, year);
		stm.setInt(2, filmid);
		
		stm.executeUpdate();
		con.close();
	}

}
