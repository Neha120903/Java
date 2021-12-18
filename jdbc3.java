package Basics;

import java.sql.*;
import java.sql.DriverManager;

public class jdbc3 {
	public static void main(String[] args) throws Exception
	{
		String firstname = "Neha";
		String lastname = "Sharma";
		String username = "Neha.sharma";
		int userid =01;
		String Query = "insert into student values (?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","");
		PreparedStatement ps = cn.prepareStatement(Query);
		ps.setString(1,firstname);  //here we specify the position of question mark
		ps.setString(2,lastname);
		ps.setString(3, username);
		ps.setInt(4, userid);
		int count = ps.executeUpdate();
		System.out.print(count+" updated");
	}
}
