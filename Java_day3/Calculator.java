package Java_day3;
import java.util.*;

class Calc{
	int num1,num2,total;
	
	void add() {
		total=num1+num2;
		System.out.println("ADDITION:"+total);
	}
	
	void sub() {
		total=num1 - num2;
		System.out.println("SUBTRACTION:"+total);
	}
	
	void mul() {
		total=num1*num2;
		System.out.println("MULTIPLICATION:"+total);
	}
	
	void div() {
		total=num1/num2;
		System.out.println("DIVISION:"+total);
	}	
}

public class Calculator {
	public static void main(String[] args) {
		Calc c=new Calc();
		c.num1 = 50;
		c.num2 = 50;
		c.add();
		c.sub();
		c.mul();
		c.div();			
	}
}
