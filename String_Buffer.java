//String buffer are thread safe and mutable



package java_day2;

import java.util.*;



public class String_Buffer {

	public static void main(String[] args) {

       StringBuffer sb=new StringBuffer("Hello");

		

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