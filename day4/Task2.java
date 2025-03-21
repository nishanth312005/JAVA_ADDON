package day4;

class Music{
	void rythm() {
		System.out.println("Music is a good friend");
	}	
}

class Sound extends Music{
	void rythm() {
		System.out.println("The sound of music heels pain");
	}
}

public class Task2 {
	public static void main(String[] args) {
		Music m=new Music();
		Sound s=new Sound();
		
		m.rythm();
		s.rythm();
	}
}
