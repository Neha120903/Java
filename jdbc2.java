package Basics;
import java.sql.*;
public class jdbc2 {
	public static void main(String[] args) throws Exception
	{
		String query ="insert into student values ('madhavi','sharma','madhvi_sharma',04)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","");
		Statement s = cn.createStatement();
		int count = s.executeUpdate(query);
		System.out.println(count+"Row's affected");
		s.close();
		cn.close();
	}

}
