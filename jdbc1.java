package Basics;
import java.sql.*;
import java.sql.DriverManager;

public class jdbc1 {
	public static void main (String[] args) throws Exception
	{
		
			String query = "select * from student";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			String userdata ="";
			while(rs.next()) 
			{
		    userdata = rs.getString(1) + " : " + rs.getString(2)+ " : " +rs.getString(3)+" : "+rs.getInt(4);
			System.out.println(userdata);
			}
			st.close();
			cn.close();
		}
	}

