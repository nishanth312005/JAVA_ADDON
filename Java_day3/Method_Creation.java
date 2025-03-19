package Java_day3;
import java.util.*;

public class Method_Creation {
	public static int add(int a, int b) {
		return a+b;
	}
	
public static void main(String[] args) {
	
	//System.out.println(add(10,10));	
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter values");
	int num1=s.nextInt();
	int num2=s.nextInt();
	System.out.println(add(num1,num2));
   }
}
