package Basics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Collection1 {
	public static void main(String[] args) {
		Collection values = new ArrayList(); 
		//By default the type of values is Object.
		values.add(2);
		values.add(4);
		values.add("Neha");
		values.add(3.24);
		System.out.println(values);
		//here we can have different datatypes in our collection but if we want only
		//a particular type of then we have to use the concept of generic in it.
		//if we want to print all values one by one we use Iterator interface for it
		Iterator it = values.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}
}


