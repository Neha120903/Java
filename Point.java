
public class Point {
	private int x;
	private int y;
	public Point() {
		System.out.println("Inside the constructor");
	}
	public Point(int x,int y) {
		x = 10;
		y=20;
	}
	public void setX(int x) {
		this.x= x;
	}
	public void setY(int y) {
		this.y= y;
	}
	public void setXY(int x, int y) {
		this.x= x;
		this.y= y;
	}
}
class testPoint{
	public static void main(String[] args) {
		Point obj = new Point(5,8);
		obj.setX(12);
		obj.setY(32);
		
	}
}
