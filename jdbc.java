package Basics;

	
import java.sql.*;
import java.util.Properties;
public class jdbc {
	public static void main(String[] args) throws Exception
		{
		try 
		{	
		String query ="select username form student where user_id=2";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","");
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(query);
		rs.next();
		String name = rs.getString(0);
		System.out.println(name);
		st.close();
		con.close();
		}
		catch(Exception e) {
			System.out.println("Successful connection...");
		}
		}
	}


