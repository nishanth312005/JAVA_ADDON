package Java_day3;
import java.util.*;

class Bird{
	String name,color="White";
	
	Bird(){
		name="Dove"; //	default constructor
	}
	
	Bird(String color){  // parameterized constructor
		this.color= color;
	}
	
	void display() {
		System.out.println("The bird name is " + name);
		System.out.println("The bird color is " + color);
		
	}
}

public class Constructor {
	public static void main(String[] args) {
		
		Bird b=new Bird(); // parameterized constructor
		b.name="Dove"; // default constructor
		b.display();
	}
}
