package day1;

public class Operators {

	public static void main(String [] args) {

		//ARITHMETIC

		int a=10;

		int b=20;

		System.out.println(a+b);

		System.out.println(a-b);

		System.out.println(a*b);

		System.out.println(a/b);

		System.out.println(a%b);

		System.out.println("\n");

		//RELATIONAL

		int x=100;

		int y=300;

		System.out.println(x==y);

		System.out.println(x>y);

		System.out.println(x<y);

		System.out.println(x>=y);

		System.out.println(x<=y);

		System.out.println(x!=y);

		System.out.println("\n");

		//LOGICAL

		boolean p=true;

		boolean q=false;

		System.out.println(p&&q); // AND

		System.out.println(p||q); // OR

		System.out.println(p!=q); // NOT

		System.out.println("\n");

		//UNARY

		//Post increment

		int a1=10;

		System.out.println(a1); //10

		System.out.println(a1++); //10

		System.out.println(a1); //11

		System.out.println("\n");

		//Pre increment

		int a2=10;

		System.out.println(a2); //10

		System.out.println(++a2); //11

		System.out.println(a2); //11

		System.out.println("\n");

		//Post decrement

		int b1=10;

		System.out.println(b1); //10

		System.out.println(b1--); //10

		System.out.println(b1); //9

		System.out.println("\n");

	

		//ASSIGNMENT

		int s=100;

		System.out.println(s+=200); // a=a+200 // 300

		System.out.println(s-=200); // a=a-200 // 100

		System.out.println(s*=200); // a=a*200 // 20000

		System.out.println(s/=200); // a=a/200 // 100

		System.out.println(s%=200); // a=a%200 // 100

		System.out.println("\n");

		

		//SWAP 2 VALUES

		int aa=10;

		int bb=20;

		aa=aa+bb;

		bb=aa-bb;

		aa=aa-bb;

		System.out.println(aa);

		System.out.println(bb);

		System.out.println("\n");

		

		//TERNARY

		int age=18;

		String result;

		result= (age>=18)? "Eligible to vote" : "not eligible to vote";

		System.out.println(result);

		System.out.println("\n");

		}
}