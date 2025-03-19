package Java_day3;

interface Youtube{
	void shorts();
}

interface Instagram{
	void reels();
}

class Media implements Youtube , Instagram{
	public void shorts() {
		System.out.println("Youtube has shorts for entertainment");
	}
	
	public void reels() {
		System.out.println("Instagram has reels for entertainment");
		
	}	
}

public class Multiple_Inheritance  {
	public static void main(String[] args) {
		Media m=new Media();
		m.shorts();
		m.reels();
	}

}
