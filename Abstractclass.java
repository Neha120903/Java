package hackerrank;
import java.io.*;
import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class Mybook extends Book{
    void setTitle(String s)
    {
        title = s;
    } 
    String getTitle()
    {
    	return title;
       
    }
}



public class Abstractclass {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner s = new Scanner(System.in);
	        Mybook obj = new Mybook();
	        obj.setTitle(s.next());
	        obj.getTitle();
	    }
}
