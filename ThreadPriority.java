package Basics;
public class ThreadPriority {
	public static void main(String[] args) throws Exception
	{
		Runnable obj1 = new Runnable()
	      {
			public void run()
			{
				for(int i=0; i<6;i++) 
				{
					System.out.println("Hi "+ Thread.currentThread().getPriority());
					try {Thread.sleep(500);} catch(Exception e) {}
				}
			}
	      };

	      Runnable obj2 = new Runnable()
			{
				public void run()
				{
					for(int i =0; i<=5; i++)
					{
						System.out.println("Hello");
						try {Thread.sleep(500);} catch(Exception e) {}
						}
					}
			};
			
			Thread t1 = new Thread(obj1);
			try {Thread.sleep(500);} catch(Exception e) {}
			Thread t2 = new Thread(obj2);
			t1.setName("hi thread");
			t2.setName("hello thread");
			t1.setPriority(1);
			t2.setPriority(10);
			//we can use either of two ways min priority is 1 and max is 10
			t1.setPriority(Thread.MIN_PRIORITY);
			t2.setPriority(Thread.MAX_PRIORITY);
			System.out.println(t1.getPriority());
			System.out.println(t2.getPriority());
			System.out.println(t1.getName());
			System.out.println(t2.getName());
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println("Bye");

	}
}
