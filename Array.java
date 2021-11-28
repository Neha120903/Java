package hackerrank;
import java.util.Scanner;
public class Array {
	public static void main(String args[]) {
		 Scanner obj = new Scanner(System.in);
	        int n = obj.nextInt();
	        int [] A = new int[n];
	        for(int i=0; i<n ; i++){
	            A[i]= obj.nextInt();
	        }
	        String result ="";
	        for (int j=n-1; j>=0; j--){
	            result = result + A[j] + " ";
	        }
	        System.out.println(result);
}
}
