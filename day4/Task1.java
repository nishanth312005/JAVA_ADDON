package day4;

class Overload{
	public void talk() {
	 System.out.println("Hello");
	}
	public void talk(String name) {
		System.out.println("Hello "+name);		
	}
}
public class Task1 {
	public static void main(String[] args) {
		Overload o=new Overload();
		o.talk("Sruthi");
	}
}