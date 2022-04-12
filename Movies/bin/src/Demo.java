
import java.sql.*;



public class Demo {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/movies";
		String user ="root";
		String pass = "";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		String q = "create table Movies(film_id int (20) primary key auto_increment, "
				+ "name varchar(200), actor varchar(200), actress varchar(200),"
				+ "director varchar(20),release_year int(4))";
		st.executeUpdate(q);
		
		con.close();
				 
		
	}
}
