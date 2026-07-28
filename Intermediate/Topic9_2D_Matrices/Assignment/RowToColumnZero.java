/*
   Approach

   1. Check whether the first row or the
      first column originally contains a 0.

   2. Traverse the remaining matrix.

   3. Whenever a 0 is found, mark its
      corresponding row and column by
      setting the first element of that
      row and column to 0.

   4. Traverse the matrix again (excluding
      the first row and first column).

   5. If either the row marker or the
      column marker is 0, set the current
      element to 0.

   6. If the first row originally contained
      a 0, make the entire first row 0.

   7. If the first column originally
      contained a 0, make the entire
      first column 0.

   8. Return the modified matrix.

   Time Complexity  : O(N × M)
   Space Complexity : O(1)
 */

package Intermediate.Topic9_2D_Matrices.Assignment;

import java.util.*;

public class RowToColumnZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the number of rows and columns.
        System.out.print("Enter Row Size: ");
        int rows = sc.nextInt();

        System.out.print("Enter Col Size: ");
        int cols = sc.nextInt();

        // Input matrix.
        int[][] A = new int[rows][cols];

        System.out.println("Enter the Matrix Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Modify the matrix.
        int[][] result = solve(A);

        // Print the modified matrix.
        System.out.println("Modified Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static int[][] solve(int[][] A) {
        // No. of rows and columns.
        int rows = A.length;
        int cols = A[0].length;

        // These flags indicate whether the first row
        // or first column originally contains a zero.
        // They are handled separately because they
        // are used as marker arrays later.
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if the first row contains any zero.
        for (int j = 0; j < cols; j++) {
            if (A[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if the first column contains any zero.
        for (int i = 0; i < rows; i++) {
            if (A[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use the first row and first column as markers.
        // If A[i][j] is 0, mark its entire row and
        // column by setting A[i][0] and A[0][j] to 0.
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (A[i][j] == 0) {
                    A[i][0] = 0;
                    A[0][j] = 0;
                }
            }
        }

        // Traverse the remaining matrix.
        // If either the row marker or column marker
        // is 0, set the current cell to 0.
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (A[i][0] == 0 || A[0][j] == 0) {
                    A[i][j] = 0;
                }
            }
        }

        // If the first row originally contained a zero,
        // make the entire first row zero.
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                A[0][j] = 0;
            }
        }

        // If the first column originally contained a zero,
        // make the entire first column zero.
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                A[i][0] = 0;
            }
        }

        // Return the modified matrix.
        return A;
    }
}
