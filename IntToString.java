package hackerrank;
import java.util.*;
public class IntToString {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner obj = new Scanner(System.in);
	        int n = obj.nextInt();
	        if (n>=-100 && n<=100){
	             String s= String.valueOf(n);
	             System.out.println("Good job");
	             
	        }
	        else
	        System.out.println("Wrong answer.");
	    }

}
