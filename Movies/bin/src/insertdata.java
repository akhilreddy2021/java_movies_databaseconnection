
import java.sql.*;
import java.io.*;

public class insertdata {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/movies";
		String user ="root";
		String pass = "";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		
		String s = "INSERT INTO movies(name,actor,actress,director,release_year) values (?,?,?,?,?)";
		
		PreparedStatement stm = con.prepareStatement(s);
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter movie name :");
		String movie = bf.readLine();
		
		System.out.println("Enter actor name :");
		String actor = bf.readLine();
		
		System.out.println("Enter actress name :");
		String actress = bf.readLine();
		
		System.out.println("Enter director name :");
		String director = bf.readLine();
		
		System.out.println("Enter release year :");
		int year = Integer.parseInt(bf.readLine());
		
		stm.setString(1, movie);
		stm.setString(2, actor);
		stm.setString(3, actress);
		stm.setString(4, director);
		stm.setInt(5, year);
		
		stm.executeUpdate();
		
		con.close();
		
	}

}
