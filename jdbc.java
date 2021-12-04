package Basics;

	
import java.sql.*;
import java.util.Properties;
public class jdbc {
	public static void main(String[] args) throws Exception
		{
		try 
		{	
		String query ="select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","");
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(query);
		rs.next();
		String name = rs.getString("username");
		System.out.println(name);
		st.close();
		con.close();
		}
		catch(Exception e) {
			System.out.println("Successful connection...");
		}
		}
	}


