package Assingment1;
//Write a program to create a class named shape. It should contain 2 methods, draw() and erase()
//that prints “Drawing Shape” and “Erasing Shape” respectively.
class Shape{
	//Static methods can be called without creating objects
	static void draw() {
		System.out.println("Drawing Shape");
	}
	static void erase() {
		System.out.println("Erasing Shape");
	}
}
public class Question1 {
	public static void main(String[] args) {
	Shape.draw();
	Shape.erase();
	}
}
