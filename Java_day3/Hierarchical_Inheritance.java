package Java_day3;

class Flower{
	void petals() {
		System.out.println("Flowers have lot of petals");
	}	
}

class Lotus extends Flower{
	void color() {
		System.out.println("Lotus is Pink in color");
	}
}

class Sunflower extends Flower{
	void color() {
		System.out.println("Sunflower is Yellow in color");
	}
}

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		Flower f=new Flower();
		Sunflower s=new Sunflower();
		Lotus l=new Lotus();
		
		f.petals();
		s.color();
		l.color();
	}
}
