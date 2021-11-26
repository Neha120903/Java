package Thread;
class random implements Runnable
{
	String colors[] = {"white","blue","black","green","red","yellow"};
	public void run() 
	{
		for(int i =0; i<colors.length;i++) 
		{
			if(colors[i] =="red")
			{
				break;
			}
			else
				System.out.println(colors[i]);
		}
	}
}
public class t2 {
	public static void main(String[] args)
	{
		  String colors[] = {"white","blue","black","green","red","yellow"};
		  random obj = new random();
		  Thread t1 = new Thread(obj);
		  t1.start();
	}
}

