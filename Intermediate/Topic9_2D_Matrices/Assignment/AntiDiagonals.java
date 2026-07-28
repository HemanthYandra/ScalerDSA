/*
   Approach

   1. Create a result matrix of size
      (2 × N - 1) × N.

   2. The first N anti-diagonals start
      from every element in the first row.

   3. The remaining (N - 1) anti-diagonals
      start from every element in the last
      column (excluding the first row).

   4. From each starting position,
      move diagonally down-left
      (row++, col--) until the matrix
      boundary is reached.

   5. Store each anti-diagonal in the
      corresponding row of the result
      matrix. The remaining positions
      automatically remain 0.

   6. Return the result matrix.

   Time Complexity  : O(N²)
   Space Complexity : O(N²)
 */

package Intermediate.Topic9_2D_Matrices.Assignment;

import java.util.*;

public class AntiDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the square matrix.
        System.out.print("Enter Matrix Size: ");
        int n = sc.nextInt();

        // Input matrix.
        int[][] A = new int[n][n];

        System.out.println("Enter the Matrix Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Find the anti-diagonals.
        int[][] result = diagonal(A);

        // Print the result matrix.
        System.out.println("Anti-Diagonals:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int[][] diagonal(int[][] A) {

        // Size of the square matrix.
        int n = A.length;

        // Total number of anti-diagonals.
        int totalDiagonals = 2 * n - 1;

        // Result matrix.
        int[][] result = new int[totalDiagonals][n];

        // Traverse every anti-diagonal.
        for (int d = 0; d < totalDiagonals; d++) {

            // Starting row of the current anti-diagonal.
            int row = (d < n) ? 0 : d - (n - 1);

            // Starting column of the current anti-diagonal.
            int col = (d < n) ? d : n - 1;

            // Column index in the result matrix.
            int idx = 0;

            // Traverse diagonally down-left.
            while (row < n && col >= 0) {
                result[d][idx] = A[row][col];
                row++;
                col--;
                idx++;
            }
        }

        // Return the result matrix.
        return result;
    }
}
