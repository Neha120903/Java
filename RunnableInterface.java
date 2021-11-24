package Basics;
class Hi implements Runnable
{
	public void run() {
		for(int i=0; i<=5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
			}
		}
	}
}
class hello implements Runnable
{
	public void run() {
		for(int i=0; i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
			}
		}
	}
}
public class RunnableInterface {
	public static void main(String[] args) {
		Hi obj1 = new Hi();
		hello obj2= new hello();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}
