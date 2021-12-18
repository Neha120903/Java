package Basics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionClass {
	public static void main(String[] args) {
		List <Integer> l = new ArrayList<>();
		l.add(3);
		l.add(4);
		l.add(1);
		l.add(2);
		Collections.sort(l);//collections is a class having a sort method which will sort all the
		//elements of list
		for(Integer i :l) {
			System.out.println(i);
		}
		Collections.reverse(l);//it will reverse the order of sorted list
		for(Integer i :l) {
			System.out.println(i);
		}
	}

}
