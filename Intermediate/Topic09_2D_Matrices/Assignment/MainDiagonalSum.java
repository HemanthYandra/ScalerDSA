/*
   Approach

   1. Initialize a variable 'sum' to 0.

   2. Traverse the main diagonal of the
      matrix using a single loop.

   3. For every index i, add the element
      A[i][i] to 'sum'.

   4. Return the final value of 'sum'.

   Time Complexity  : O(N)
   Space Complexity : O(1)
 */

package Intermediate.Topic09_2D_Matrices.Assignment;

import java.util.*;

public class MainDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the number of rows and columns
        System.out.print("Enter Row Size: ");
        int rows = sc.nextInt();

        System.out.print("Enter Col Size: ");
        int cols = sc.nextInt();

        // Input matrix
        int[][] A = new int[rows][cols];

        System.out.println("Enter the Matrix Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Find the sum of the main diagonal
        int sum = solve(A);

        // Print the result
        System.out.println("Main Diagonal Sum: " + sum);
        
        sc.close();
    }

    public static int solve(int[][] A) {
        // Store the sum of the main diagonal
        int sum = 0;

        // Traverse the main diagonal
        int i = 0;
        while (i < A.length) {
            // Add the current diagonal element
            sum += A[i][i];
            i++;
        }

        // Return the final sum
        return sum;
    }
}
