package Basics;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Collection2wthGenerics {
	public static void main(String[] args) {
		Collection <Integer> value = new ArrayList<>();
		//we can only enter the Integer type values.
		value.add(2);
		value.add(56);
		//value.add("error"); here we get an error.
		//if we want to add number btw 2 and 56 then we can use lsit interface in
		//place of collection
		List  l = new ArrayList();
		//now we can specify any index in add
		l.add(1);//here the 1 is Integer object of wrapper class or autoboxing
		l.add(3);
		l.add(1,2);
		l.add("5");
		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		//enhanced for loop
		for(Object o: l) {
			System.out.println(o);
		}
	}
}
