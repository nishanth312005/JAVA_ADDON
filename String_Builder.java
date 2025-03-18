//Strings are immutable

//String builder(not safe) and buffer(thread safe) are mutable



package java_day2;

import java.util.*;



public class String_Builder {

	public static void main(String[] args) {

		

		StringBuilder sb=new StringBuilder("Hello");

		

		//append

		sb.append(" World");

		System.out.println("String Append:" + sb);

		

		//insert

		sb.insert(5,",");

		System.out.println("String Insert:" + sb);

		

		//replace

		sb.replace(0, 5, "Welcome");

		System.out.println("String replace:" + sb);

		

		//reverse

		sb.reverse();

		System.out.println("String reverse:" + sb);

			

		}

}