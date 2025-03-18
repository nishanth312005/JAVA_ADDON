package java_programs;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);

        // Get the range from the user
        System.out.print("Enter the starting number of the range: ");
        int start = s.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = s.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        // Loop through the range to find prime numbers
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible, so it's not prime
            }
        }

        return true; // Number is prime
    }
}

