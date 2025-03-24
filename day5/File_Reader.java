package day5;
import java.io.*;

public class File_Reader {
	public static void main(String []args) {

		try {

			FileReader reader = new FileReader("C:\\Users\\Hxtreme\\eclipse-workspace\\Add_On\\src\\Java_day5\\example.txt");

			int character;

			System.out.println("File contents:");

			while((character = reader.read()) != -1) {

				System.out.print((char) character);
			}

			reader.close();

		} catch(IOException e) {

			System.out.println("Error "+e.getMessage());
		}
	}
}

