/*Create a thread which prints 1 to 10. After printing 5, there should be a delay
 *  of 5000 milliseconds before printing 6.  ( Thread Control Mechanism concept)
 */
package Thread;
public class t4 {
	public static void main(String[] args)
	{
		Runnable obj = () ->
					{
						for(int i=0; i<=5;i++)
						{
							System.out.println(i);
						}
						try {Thread.sleep(5000);} catch(Exception e) {}
						for(int i =6;i<=10;i++)
						{
							System.out.println(i);
						}
					};
		Thread t1 = new Thread(obj);
		t1.start();
	}
}
