package day5;
import java.io.*;

public class Buffer_Writer 
{
	public static void main(String[] args) {
		try {
			BufferedWriter w1=new BufferedWriter(new FileWriter("C:\\Users\\Hxtreme\\eclipse-workspace\\Add_On\\src\\Java_day5\\buffer"));
		    w1.write("Java-File handing");
		    w1.newLine();
		    w1.write("Java-Buffer Writer");
		    w1.close();
		    System.out.println("Data written to file");
		 }catch (IOException e) {
			 System.out.println("An error occured "+e.getMessage());
		 }
	}

}
