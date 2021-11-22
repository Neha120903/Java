class mythread implements Runnable{
	@override
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("ghdf");
		}
	}
}
public class Multithreading {
	public static void main(String[] args) {
		Thread obj1= new Thread(new Runnable());
			
		@override
		//Thread obj1= new Thread(new mythread());
		obj1.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main thread"+i);
		}
	}
	

}
