package day5;
import java.io.*;

public class Buffer_Reader {
	public static void main(String[] args) {
		try {
			BufferedReader r1=new BufferedReader(new FileReader("C:\\Users\\Hxtreme\\eclipse-workspace\\Add_On\\src\\Java_day5\\buffer"));
		    String line;
		    System.out.println("Reading file");
		    while ((line = r1.readLine()) != null) {
		    	System.out.println(line);
		    }
		    r1.close();
		   }catch (IOException e) {
			   System.out.println("Error reading file :"+e.getMessage());
		   }
		
	}

}
