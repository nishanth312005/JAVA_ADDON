package java_programs;

import java.util.Scanner;

public class Mtrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Get the number of rows and columns for the matrix
        System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = s.nextInt();

        
        int[][] matrix = new int[rows][columns];

        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = s.nextInt();
            }
        }

        
        System.out.println("The entered matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
