package Java_day3;

class Data{
	
	private String name;
	
	public String getter() {
		
		return name;
	
	}

	public void setter(String name) {

		if(name!=null && !name.isEmpty()) {

			this.name=name;
		}
		else {

			System.out.println("Invalid name");
		}
	}
}

public class GetSet {

	public static void main(String[] args) {

		Data d=new Data();

		d.setter("Sruthi");

		System.out.println("Name is "+d.getter());
	}
}