package Basics;
import java.util.*;
import java.util.ArrayList;
class Studs implements Comparable<Studs>
{
	int rollno;
	String name;
	int marks;
	public Studs(int rollno , String name, int marks)
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	public int compareTo(Studs s) 
	{
		return marks>s.marks?1:-1;
	}
}
public class ComparableInterface {
public static void main(String[] args) {
	List<Studs> stu = new ArrayList<>();	
	stu.add(new Studs(01,"Neha",55));
	stu.add(new Studs(02,"Reema",45));
	stu.add(new Studs(01,"Laxy",52));
	Collections.sort(stu);
	for(Studs s : stu) {
		System.out.println(s);
	}
	}
}
