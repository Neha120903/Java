package hackerrank;
import java.io.*;
import java.util.*;
interface AdvancedArithmetic{
    public int signature(int a);
}
class Mycalc implements AdvancedArithmetic
{
    public int signature(int a)
    {
        int count =0;
        if(a<=1000)
        {
            for (int i=1 ; i<=a ;i++)
            {
                if(a/i==0)
                
                    count = count+i;
            }
            System.out.println("I implemented: AdvancedArithmetic");
           
        }
       // System.out.print(false);
        return count;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Mycalc obj = new Mycalc();
        obj.signature(n);
        
    }
}

