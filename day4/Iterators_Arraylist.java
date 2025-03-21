package day4;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators_Arraylist {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Cherry");
		fruits.add("Orange");
		fruits.add("Grapes");
		
		Iterator<String> iterator=fruits.iterator();
		System.out.println("Fruits using iterators");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}		
	}

}
