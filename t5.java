/*Create three threads- with different priorities – MAX, MIN, NORM- and start 
 * the threads at the same time. Observe the completion of the threads.
 *  (Thread priorities concept)*/
package Thread;
class A extends Thread
{
	public void run()
	{
		Thread t1 = new Thread();
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
	}
}
class B extends Thread
{
	public void run()
	{
		Thread t2 = new Thread();
		t2.setPriority(MIN_PRIORITY);
		System.out.println(t2.getPriority());
	}
}
class C extends Thread
{
	public void run()
	{
		Thread t3 = new Thread();
		t3.setPriority(NORM_PRIORITY);
		System.out.println(t3.getPriority());
	}
}
public class t5 {
	public static void main(String[] args)
	{
		A obj = new A();
		obj.start();
		//System.out.println(Thread.currentThread().getPriority());
		B obj2 = new B();
		obj2.start();
		//System.out.println(Thread.currentThread().getPriority());
		C obj3 = new C();
		obj3.start();
		//System.out.println(Thread.currentThread().getPriority());
	}

}
