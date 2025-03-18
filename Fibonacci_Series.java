package java_programs;
import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        // Get the number of terms from the user
        System.out.print("Enter the numbers: ");
        int n = s1.nextInt();

        // Initial two terms of Fibonacci series
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        // Loop to calculate and print the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
