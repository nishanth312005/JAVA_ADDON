package java_day2;

public class Array_copy {
	public static void main(String [] args) {
		int [] source = {1,2,3,4,5};
		int [] destination = new int [5];
		System.arraycopy(source, 0, destination, 0, source.length);
		for (int num :destination) {
			System.out.print(num + " ");
		}

	}

}
