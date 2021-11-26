/*Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join.     (use of join method and thread control mechanism)*/
package Thread;

public class t3 {
	public static void main(String[] args) throws Exception
	{
		Runnable obj = new Runnable()
				{
					public void run()
					{
						for(int i =0 ; i<=10; i=i+2) 
						{
							//Thread.currentThread().setPriority(1);
							System.out.println(i);
							try {Thread.sleep(500);} catch(Exception e) {}
							
						}
				}
				};
		Runnable obj2 = () ->{
							for(int i=1; i<=10; i=i+2)
							{
								Thread.currentThread().setPriority(5);
								System.out.println(i);
								try {Thread.sleep(500);} catch(Exception e) {}
							}
							};
		Thread t1 = new Thread(obj);
		t1.start();
		t1.join();
		try {Thread.sleep(500);} catch(Exception e) {}
		Thread t2 = new Thread(obj2);
		t2.start();
		try {Thread.sleep(500);} catch(Exception e) {}
	}
}
