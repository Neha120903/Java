/*store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
display all colours repeatedly by generating colour index from Random class. If the random colour index matches to red stop display.
Note: perform this task by implementing Runnabe interface*/
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

