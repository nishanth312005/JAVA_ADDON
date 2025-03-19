package Java_day3;
import java.util.*;

class Student{
	String name,dept;
	int rno;
	
	void display() {                 // method creation
		System.out.println(name);
		System.out.println(rno);
		System.out.println(dept);
		
	}
}
public class Class_Objects {
	public static void main (String [] args) {
		Student s = new Student();   //Object creation
		s.name = "Sruthi";
		s.rno = 223238;
		s.dept = "Software Systems";
		
		/*System.out.println(s.name);
		System.out.println(s.rno);
		System.out.println(s.dept);	*/
		
		s.display();
	}
}
