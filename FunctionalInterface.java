package Basics;
/*Types of Interfaces
1- Normal
2-Single abstract method :having only one abstract method But it is also named as Functional Interface
3-MarkerInterface : no method in it.
*/
interface abc{
	void run();
}
public class FunctionalInterface {
	public static void main(String[] args) {
		abc obj = () -> System.out.println("run method using lambda function");
						
					
	}

}
