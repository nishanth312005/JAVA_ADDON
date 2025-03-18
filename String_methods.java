package java_day2;


public class String_methods {
	public static void main(String[] args) {
		//assign variable
		//String name = "Sruthi";
		String name = new String ("Sruthi");
		System.out.println(name);
		System.out.println("\n");
		
		
		//string length
		String str="Java Programming";
		System.out.println("Length of the string is :"+str.length());
		System.out.println("\n");
		
		//substring
		String s= "Java Programming";
		System.out.println("From Starting index:"+s.substring(3));
		System.out.println("From Starting index & Ending index:"+s.substring(0,7));
		System.out.println("\n");
		
		//indexOf
		String s1="Java Programming";
		System.out.println(s1.indexOf("Prog")); // indicates from start index
		System.out.println(s1.indexOf("s")); //Not found so -1
		System.out.println("\n");
		
		//toUpperCase and toLowerCase
		String a="Java programming";
		System.out.println("Change to Upper:"+a.toUpperCase());
		System.out.println("Change to Lower:"+a.toLowerCase());
		System.out.println("\n");
		
		//replace character
		String b="Java programming";
		System.out.print("Replaced characters:");
		System.out.println(b.replace('a', 'A'));
		System.out.println("\n");
		
		//equals( str 1 = str 2)
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		System.out.println("Strings are equal or not:");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println("\n");
		
		//charAt
		String z="JAVA";
        System.out.println(z.charAt(2));
        System.out.println("\n");

		// String split
        String ss="java,python,c,c++";
        String []languages= ss.split(",");

		for (String ss1:languages) {
			System.out.println(ss1);
             }
         System.out.println("\n");

				
        //concatenation
         String a1="Java";
         String b1=" Programming";
         System.out.println("Concatenation of string :"+ a1.concat(b1));
         System.out.println("\n");

		
         //trim
         String a2="  Java  ";
         System.out.println(a2);
         System.out.println(a2.length());
         String b2=a2.trim(); //removes white spaces
         System.out.println(b2);
         System.out.println(b2.length());
         System.out.println("\n");

		 //compareTo

		 String a3="Java";

		 String b3="Python";

		 String c3="Java";

		 System.out.println(a3.compareTo(b3)); // J < P returns -ve value

		 System.out.println(b3.compareTo(a3)); // p > J returns +ve value

		 System.out.println(a3.compareTo(c3)); //if == then 0

		 System.out.println("\n");

		 
		 //contains

		 String a4="Java Programming";

		 System.out.println(a4.contains("Java")); //present in the sequence

		 System.out.println(a4.contains("C")); // not present

		 System.out.println("\n");

				}
	}


		
		
		
				

