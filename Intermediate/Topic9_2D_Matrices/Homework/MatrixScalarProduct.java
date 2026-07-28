/*
   Approach

   1. Traverse every element of the matrix
      using two nested loops.

   2. Multiply each element of the matrix
      with the given scalar value B.

      A[i][j] = A[i][j] * B

   3. Update the matrix with the multiplied
      values.

   4. Return the modified matrix.

   Time Complexity  : O(N × M)
   Space Complexity : O(1)
 */

package Intermediate.Topic9_2D_Matrices.Homework;

import java.util.*;

public class MatrixScalarProduct {
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

        // Read scalar value.
        System.out.print("Enter Scalar Value: ");
        int B = sc.nextInt();

        // Perform scalar multiplication.
        int[][] result = solve(A, B);

        // Print the resulting matrix.
        System.out.println("Scalar Product Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static int[][] solve(int[][] A, int B) {
        // Traverse every element of the matrix.
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                // Multiply the current element
                // with the scalar value.
                A[i][j] = A[i][j] * B;
            }
        }

        // Return the modified matrix.
        return A;
    }
}
