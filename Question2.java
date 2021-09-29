package Assingment1;
import java.util.Scanner;
/*Design a class that can be used by a health care professional to keep track of 
a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),weight(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for 
computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.*/
class Patient{
	String name;
	double height;
	double weight;
	public void computeBMI() {
		double answer = weight /(height*height);
		System.out.println(answer);
	}
}
public class Question2 {
	public static void main(String[] args) {
		Patient obj = new Patient();
		Scanner sc = new Scanner(System.in);
		obj.name= sc.next();
		obj.height = sc.nextDouble();
		obj.weight =sc.nextDouble();
		obj.computeBMI();
		
	}
	
}
