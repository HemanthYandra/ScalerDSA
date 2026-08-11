/*
	Approach

	1. Initialize a variable max with the first element
	   of the matrix.

	2. Traverse every row of the matrix.

	3. For every row, traverse all the columns.

	4. Compare the current element A[i][j] with max.

	5. If A[i][j] is greater than max, update max.

	6. After traversing the entire matrix, return max.


	Complexity Analysis

	Time : O(N * M)
		- Every element of the matrix is visited exactly once.

	Space : O(1)
		- Only one variable is used to store the maximum element.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Matrices2D.Additional_Questions;

import java.util.*;

public class MaxElementOfMatrix {
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

        System.out.println("Max element of matrix is " + maxOfMatrix(mat));

        sc.close();
    }

    public static int maxOfMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Initialize max with the first element of the matrix
        int max = mat[0][0];

        // Traverse through every row
        for (int i = 0; i < n; i++) {
            // Traverse through every column
            for (int j = 0; j < m; j++) {
                // Update max if the current element is greater
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
        }

        // Return the maximum element
        return max;
    }
}
