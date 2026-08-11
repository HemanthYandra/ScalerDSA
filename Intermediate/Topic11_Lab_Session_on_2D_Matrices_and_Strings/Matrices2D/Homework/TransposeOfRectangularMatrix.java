/*
	Approach

	1. Since the matrix is rectangular, its number of rows
	   and columns can be different.

	2. If the original matrix has N rows and M columns,
	   create a new matrix of size M x N.

	3. Traverse every element of the original matrix.

	4. For every element at position (i, j), place it at
	   position (j, i) in the result matrix.

	5. After processing all elements, the result matrix
	   will be the transpose of the original matrix.

	6. Return the result matrix.


	Complexity Analysis

	Time : O(N * M)
		- Every element of the original matrix is visited once.

	Space : O(N * M)
		- A new matrix of size M x N is created to store
		  the transpose.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Matrices2D.Homework;

import java.util.*;
public class TransposeOfRectangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter no. of cols: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[][] result = transpose(mat);

        System.out.println("Transpose of the matrix: ");

        // Print the transposed matrix.
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }

    public static int[][] transpose(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Create a matrix of size M x N.
        int[][] result = new int[m][n];

        // Traverse through every element of the original matrix.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Place A[i][j] at result[j][i].
                result[j][i] = mat[i][j];
            }
        }

        // Return the transposed matrix.
        return result;
    }
}
