package Basics;
//sort method in java only sort the values one the basis of the first digit.
//and if we want to sort then by their last digit then we use comparator interface 
import java.util.*;
public class ComparatorInterface 
{
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		for(int i=100; i<123;i++) {
			values.add(i);
		}
		Comparator<Integer> c = new Comparator<Integer>()
								{
									public int compare(Integer i, Integer j) 
									{
										if(i%10>j%10) //list will be sorted by its last digit
											return 1;
										else
											return -1;
									}
								};
		Collections.sort(values,c); //here we pass the object of comparator interface
		for(Integer o: values) {
			System.out.println(o);
		}
	}
}
