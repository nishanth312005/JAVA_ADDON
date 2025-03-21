package day4;


class Greeting{
	void greet() {
		System.out.println("Hello!");
	}
	void greet(String name) {
		System.out.println("Hello "+name);
	}
}

public class Task4 {
	public static void main(String[] args) {
		Greeting g= new Greeting();
		//g.greet();
		g.greet("Sansa");
	}
}
