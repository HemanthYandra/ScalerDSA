/*
   Approach

   1. The minor diagonal elements of an N x N
      matrix are present at positions where:

      row + column = N - 1

   2. Traverse each row of the matrix.

   3. For every row index i, the corresponding
      minor diagonal column index is:

      column = N - 1 - i

   4. Add the elements A[i][N - 1 - i]
      to the sum.

   5. Return the final sum.

   Time Complexity  : O(N)
   Space Complexity : O(1)
 */

package Intermediate.Topic9_2D_Matrices.Homework;

import java.util.*;

public class MinorDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the size of the square matrix
        System.out.print("Enter Matrix Size: ");
        int n = sc.nextInt();

        // Input matrix
        int[][] A = new int[n][n];

        System.out.println("Enter the Matrix Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Find the minor diagonal sum
        int result = solve(A);

        // Print the result
        System.out.println("Minor Diagonal Sum: " + result);

        sc.close();
    }

    public static int solve(int[][] A) {   
        // Size of the square matrix
        int n = A.length;

        // Variable to store the diagonal sum
        int sum = 0;

        // Traverse the rows of the matrix
        for (int i = 0; i < n; i++) {
            // Add the minor diagonal element
            // Column index decreases as row index increases.
            sum += A[i][n - 1 - i];
        }

        // Return the final sum
        return sum;
    }
}
