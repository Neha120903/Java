class outer {
	public void display() {
		System.out.println("Inside outer class");
	}
	class inner{
		public void display() {
			System.out.println("Inside the inner class");
		}
	}
}
public class main {
	public static void main(String[] args) {
		outer obj = new outer();
		obj.display();
		//we can not create an object of inner class directly
		outer.inner obj1 = new outer().new inner();
		obj1.display();
	}
}
