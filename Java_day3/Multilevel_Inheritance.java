package Java_day3;

class Birds1{
	void fly() {
		System.out.println("Birds can fly high");
	}
}
	
class Parrot1 extends Birds1{
	void speak() {
		System.out.println("Parrot can speak");
	}
  }

class Duck extends Parrot1{
	void swim() {
		System.out.println("Duck can Swim");		
	}
}

public class Multilevel_Inheritance {
	public static void main(String[] args) {
		Duck p = new Duck();
		p.fly();
		p.speak();
		p.swim();
		
	}
}
