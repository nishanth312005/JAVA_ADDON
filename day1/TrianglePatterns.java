package day1;
import java.util.Scanner;

public class TrianglePatterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       
        System.out.print("Enter the number of rows for the patterns: ");
        int rows = s.nextInt();

        // Right-Angle Triangle Pattern
        System.out.println("Right-Angle Triangle Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }

        // Left-Angle Triangle Pattern
        System.out.println("\nLeft-Angle Triangle Pattern:");
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Double space for uniformity
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
