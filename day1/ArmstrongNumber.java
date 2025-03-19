package day1;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = s.nextInt();

        int originalNumber = number;
        int result = 0;

        // Find the number of digits (order)
        int digits = String.valueOf(number).length();

        // Calculate the sum of digits raised to the power of 'digits'
        while (number != 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, digits);
            number /= 10;
        }

        // Check if the original number equals the result
        if (originalNumber == result) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}

