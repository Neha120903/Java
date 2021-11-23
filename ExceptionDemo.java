package Basics;
public class ExceptionDemo{
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[6] = 6;
			int c = 3/0;
			System.out.println(c);
			
		}
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException e){
			System.out.println("Error ");
		}
		finally {
			System.out.println("Bye");
		}
	}
}
		
		
	
