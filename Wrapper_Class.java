package java_day2;



public class Wrapper_Class {

	public static void main(String[] args) {

		//boxing

		Integer myint=Integer.valueOf(66);

		Double mydouble=Double.valueOf(12.22);

		Float myfloat=Float.valueOf(12);

		Character mychar=Character.valueOf('K');

		Boolean mybool=Boolean.valueOf(false);

		//or autoboxing

		Integer my_int=66;

		Double my_double=12.22;

		Character my_char='K';

		Boolean my_bool=false;

		//unwrapping

		int intval=myint;

	}



}