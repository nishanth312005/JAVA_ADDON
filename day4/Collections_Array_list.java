package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections_Array_list {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist= new ArrayList<>(); //Only integer types are accessed
		arrlist.add(100);
		System.out.println(arrlist);
		System.out.println("\n");
		
		ArrayList <String> arlist= new ArrayList<>();  //Only String types are accessed
		arlist.add("Hello");
		System.out.println(arlist);
		System.out.println("\n");
		
		ArrayList a= new ArrayList<>();  // Any types can be accessed
		a.add(10);
		a.add("JAVA");
		System.out.println(a);
		System.out.println("\n");
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for ( int i=0;i<=n;i++) {
			a1.add(i);
			System.out.println(a1);	
			System.out.println("\n");
		}
	}
}

