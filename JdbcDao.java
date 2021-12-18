package Basics;

import java.sql.*;

//Data Access object
public class JdbcDao {
	public static void main(String[] args) throws Exception
	{
		StudentDAO dao = new StudentDAO();
		Student s1 = dao.getStudent(1);
		//if we want to get the name of student of roll no 12
		System.out.print(s1.username);
		//here we dont have getName method so we define it inside any class
		
	}
}
class StudentDAO
{
	public Student getStudent(int user_id) throws Exception 	
	{
		Student s = new Student();
		s.user_id = user_id;
		//we don't know the sname so we want to fetch the database 
		String Query = "select username from student where user_id = "+user_id;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","");
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery(Query);
		rs.next();
		String name = rs.getString(1);
		s.username = name;
		return s;
		
	}
}
class Student
{
	int user_id;
	String username;
}
