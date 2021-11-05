//write a program to create interface named test.In this interface the member 
//method is square.Implement this interface in arithmetic class. Create a new 
//class called ToTestInt in this class use the object of arithmetic class
import java.util.Scanner;
 interface test {
	public abstract void square(int a, int b, int c,int d);

}
class arithmetic implements test{
	public int a;
	public int b;
	public int c;
	public int d;
	public void square(int a,int b,int c,int d) {
		if (a==b && b==c && c==d) {
		System.out.println("It is a square");
		}
		else
			System.out.println("It is not a square");
	}
}


public class ToTestInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arithmetic obj  = new arithmetic();
		obj.square(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
}
