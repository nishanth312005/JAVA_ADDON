//Non-access modifiers
//static , final, abstract, synchronized, volatile, transient, native, strictfp

package Java_day3;
import java.util.*;

class Animal{
	public String name="Panda";   
	private String name1="Zebra";
	protected String name2="Cow";
	String name3="Dog";
	
	void display() {
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);		
	}
}

public class Access_Specifiers {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.display();
		
		System.out.println("Public :"+a.name);
		System.out.println("Default :"+a.name3);
		//System.out.println("Private :"+a.name1);
		//System.out.println("Public :"+a.name4);
		
	}

}


