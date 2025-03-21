package day4;

import java.util.LinkedList;

public class Collections_Linked_list {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(100);
		l.addFirst(300);
		l.addLast(500);
		l.add(200);
		l.add(400);
		
		//System.out.println(l.get(0));
		//System.out.println(l.size());
		//System.out.println(l.remove(2));
		//System.out.println(l.isEmpty());
		System.out.println(l);		
	}
}
