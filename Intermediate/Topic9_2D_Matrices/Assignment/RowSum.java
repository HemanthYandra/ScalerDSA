/*
   Approach

   1. Create a result array whose size is
      equal to the number of rows.

   2. Traverse each row of the matrix.

   3. For every row, initialize 'sum' to 0.

   4. Traverse all the elements of the
      current row and add them to 'sum'.

   5. Store the row sum in the
      corresponding index of the result array.

   6. Return the result array.

   Time Complexity  : O(N × M)
   Space Complexity : O(N)
 */

package Intermediate.Topic9_2D_Matrices.Assignment;

import java.util.*;

public class RowSum {
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

        // Find the sum of each row
        int[] result = solve(A);

        // Print the result
        System.out.println("Row Sums:");
        for (int sum : result) {
            System.out.print(sum + " ");
        }

        sc.close();
    }

    public static int[] solve(int[][] A) {
        // Result array to store row sums
        int[] result = new int[A.length];

        // Traverse each row
        for (int i = 0; i < A.length; i++) {
            // Store the sum of the current row
            int sum = 0;
            // Traverse all columns in the current row
            for (int j = 0; j < A[i].length; j++) {
                sum += A[i][j];
            }
            // Store the row sum
            result[i] = sum;
        }

        // Return the result array
        return result;
    }
}
