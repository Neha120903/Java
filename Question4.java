/*Write a Program that accepts two Strings as command line arguments and generate the output in the required format. 
Example1)
If the two command line arguments are GLA and Mathura then the output generated should be GLA University Mathura.
Example2)
If the command line arguments are AAA and Delhi then the output generated should be AAA Technologies Delhi 
[Note: It is mandatory to pass two arguments in command line]*/
package Assingment1;

public class Question4 {
	public static void main(String[] args) {
		if(args[0].compareTo("GLA")==0 && args[1].compareTo("Mathura")==0)
			System.out.print(args[0]+" University "+args[1]);
		else
			System.out.println(args[0]+" Technologies "+args[1]);
	}
}
