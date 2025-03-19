package Java_day3;

class Birds{
	void fly() {
		System.out.println("Birds can fly high");
	}
}
	
class Parrot extends Birds{
	void speak() {
		System.out.println("Parrot can speak");
	}
  }

public class Single_Inheritance {
	public static void main(String[] args) {
		Parrot p = new Parrot();
		p.fly();
		p.speak();
	}
}
