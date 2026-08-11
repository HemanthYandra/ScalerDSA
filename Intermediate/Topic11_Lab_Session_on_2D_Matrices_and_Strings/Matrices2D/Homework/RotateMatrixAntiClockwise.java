/*
	Approach

	1. Transpose the square matrix in-place.
	   - Swap A[i][j] with A[j][i].
	   - Traverse only the upper triangular part.

	2. Reverse the order of the rows.
	   - Swap the first row with the last row.
	   - Continue moving towards the center.

	3. After these two operations, the matrix is
	   rotated by 90 degrees anti-clockwise.

	Complexity Analysis

	Time : O(N²)
	- Transposing the matrix takes O(N²).
	- Reversing the order of rows takes O(N).

	Space : O(1)
	- The rotation is performed in-place without
	  using an additional matrix.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Matrices2D.Homework;

import java.util.*;
public class RotateMatrixAntiClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        rotateAntiClockwise(mat);

        System.out.println("Matrix after 90 degree anti-clockwise rotation: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void rotateAntiClockwise(int[][] A) {
        // Transpose the matrix
        transpose(A);

        // Reverse the order of rows
        reverseRowOrder(A);
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

    public static void reverseRowOrder(int[][] A) {
        int n = A.length;

        int top = 0;
        int bottom = n - 1;

        // Reverse the order of rows
        while (top < bottom) {
            int[] temp = A[top];
            A[top] = A[bottom];
            A[bottom] = temp;

            top++;
            bottom--;
        }
    }
}
