import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyExp {
	public static void m1() throws ArithmeticException//InterruptedException
	{
		m2();
	}
	public static void m2() throws ArithmeticException //InterruptedException
	{  
		System.out.println(10/0);
		//Thread.sleep(1000);    //checked exception handled by throws
	}
	public static void main(String[] args) throws ArithmeticException//InterruptedException
	{
		/*Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try(s;br)
		{
			int a = s.nextInt();
			System.out.println(a);
		}
		catch(IOException obj) 
		{
			
		}*/
		m1();
		System.out.println("end of main method");
		catch(ArithmeticException obj) 
		{
			System.out.println(obj);
		}
	}
}}
}
