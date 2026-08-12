/*
	Approach

	1. Rotate the matrix by 90 degrees clockwise using two
	   in-place operations.

	2. First, call the transpose() method to transpose the
	   matrix in-place.

	3. Then, reverse every row using the reverseRows() method.

	4. The combination of:
	   - Transpose
	   - Reverse every row
	   gives a 90-degree clockwise rotation.

	5. Since both operations modify the original matrix,
	   the rotation is performed in-place.


	Complexity Analysis

	Time : O(N^2)
		- Transposing the matrix takes O(N^2).
		- Reversing every row takes O(N^2).
		- Therefore, the overall time complexity is O(N^2).

	Space : O(1)
		- All operations are performed directly on the
		  original matrix.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Matrices2D.Assignment;

import java.util.*;
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of n x n matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        rotate(mat);

        System.out.println("Matrix after 90 degree clockwise rotation: ");
        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void rotate(int[][] A) {
        // Transpose the matrix
        transpose(A);

        // Reverse every row
        reverseRows(A);
    }

    public static void transpose(int[][] A) {
        int n = A.length;

        // Traverse the upper triangular part of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap A[i][j] with A[j][i]
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }

    public static void reverseRows(int[][] A) {
        int n = A.length;

        // Reverse every row
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = n - 1;
            // Swap elements from both ends of the row
            while (l < r) {
                int temp = A[i][l];
                A[i][l] = A[i][r];
                A[i][r] = temp;

                l++;
                r--;
            }
        }
    }
}
