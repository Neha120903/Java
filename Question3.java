/*Q3) Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.*/

package Assingment1;
public class Question3 {
	String gender;
	int age;
	public void percentage()
	{
		if(gender.compareTo("Female")==0 && 1<=age && age<=58)
			System.out.println("percentage of interest is 8.2%");
		else if(gender.compareTo("Female")==0 && 59<=age && age<=100)
			System.out.println("percentage of interest is 9.2%");
		else if(gender.compareTo("Male")==0 && 1<=age && age<=58)
			System.out.println("percentage of interest is 8.4%");
		else if(gender.compareTo("Male")==0 && 59<=age && age<=100)
			System.out.println("percentage of interest is 10.5%");
		}
}
class test{
	public static void main(String[] args) {
	Question3 p = new Question3();
	p.age = Integer.parseInt(args[0]);
	p.gender = args[1];
	p.percentage();
}
}

