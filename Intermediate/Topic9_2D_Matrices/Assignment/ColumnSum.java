/*
   Approach

   1. Create a result array whose size is
      equal to the number of columns.

   2. Traverse each column of the matrix.

   3. For every column, initialize 'sum' to 0.

   4. Traverse all the rows for the
      current column and add the elements
      to 'sum'.

   5. Store the column sum in the
      corresponding index of the result array.

   6. Return the result array.

   Time Complexity  : O(N × M)
   Space Complexity : O(M)
 */

package Intermediate.Topic9_2D_Matrices.Assignment;

import java.util.*;

public class ColumnSum {
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

        // Find the sum of each column
        int[] result = solve(A);

        // Print the result
        System.out.println("Column Sums:");
        for (int sum : result) {
            System.out.print(sum + " ");
        }
        
        sc.close();
    }

    public static int[] solve(int[][] A) {
        // Number of rows
        int rows = A.length;

        // Number of columns
        int cols = A[0].length;

        // Result array to store column sums
        int[] result = new int[cols];

        // Traverse each column
        for (int j = 0; j < cols; j++) {
            // Store the sum of the current column
            int sum = 0;
            // Traverse all rows for the current column
            for (int i = 0; i < rows; i++) {
                sum += A[i][j];
            }
            // Store the column sum
            result[j] = sum;
        }

        // Return the result array
        return result;
    }
}
