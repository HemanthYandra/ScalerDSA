/*
   Approach

   1. Create a new matrix 'result' with the same
      number of rows and columns as A.

   2. Traverse every element of both matrices
      using two nested loops.

   3. Add the corresponding elements.

      result[i][j] = A[i][j] + B[i][j]

   4. Return the resulting matrix.

   Time Complexity  : O(N × M)
   Space Complexity : O(N × M)
 */

package Intermediate.Topic9_2D_Matrices.Assignment;

import java.util.*;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the no. of rows and columns
        System.out.print("Enter Row Size: ");
        int rows = sc.nextInt();

        System.out.print("Enter Col Size: ");
        int cols = sc.nextInt();

        // Input matrix A
        int[][] A = new int[rows][cols];

        System.out.println("Enter the 1st 2D Array Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input matrix B
        int[][] B = new int[rows][cols];

        System.out.println("Enter the 2nd 2D Array Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Find the sum of the matrices
        int[][] result = solve(A, B);

        // Print the resulting matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int[][] solve(int[][] A, int[][] B) {
        // No. of rows in the matrices
        int rows = A.length;

        // No. of columns in the matrices
        int cols = A[0].length;

        // Result matrix
        int[][] result = new int[rows][cols];

        // Traverse both matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Add corresponding elements
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        // Return the resulting matrix
        return result;
    }
}
