package day1;

import java.util.*;



public class control_Statement {

	public static void main(String [] args) {

		//if-else

		int a=10;

		int b=20;

		if (a<b) {

			System.out.println("A is less than B");

		}

		else {

			System.out.println("B is less than A");

		}

		

		//nested if

		int x=10;

		if (a<b) {

			if (x%2==0) {

				System.out.println(x+ " is even ");

			}

		}

		

		//ladder if

		int a1=100;

		int a2=200;

		int a3=300;

		if(a1>a2 && a1>a3) {

			System.out.println("A is greater");

			}

		else if(a2>a1 && a2>a3) {

			System.out.println("B is greater");

		}

		else if (a3>a1 && a3>a2) {

			System.out.println("C is greater");

		}

		else {

			System.out.println("All are equal");

		}

		

		//switch case

		//executes one code block among many ,based on the value of an expression

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter num1");
		int x1=s.nextInt();
		System.out.println("Enter num2");
		int x2=s.nextInt();

		char ch;
		
		System.out.println("+,-");
		ch=s.next().charAt(0);
		switch(ch) {
		case '+':
			int x3=x1+x2;
			System.out.println("ADD="+x3);
			break;
		case '-':
			int x4=x1-x2;
			System.out.println("SUB="+x4);
			break;
			default:
				System.out.println("invalid choice");
				break;
		}

		

	}



}