/*Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.*/
package Thread;
public class t1 {
	public static void main(String[] args)
	{
		Thread t1 = new Thread();
		t1.setName("Scooby");
		System.out.println(t1.getName());
		Thread t2 = new Thread();
		t2.setName("Shaggy");
		System.out.println(t2.getName());
	}
}
