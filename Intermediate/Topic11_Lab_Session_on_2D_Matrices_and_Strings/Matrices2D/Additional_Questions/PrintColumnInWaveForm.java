/*
	Approach

	1. Traverse the matrix column by column.

	2. For every even-indexed column, traverse the rows
	   from top to bottom.

	3. For every odd-indexed column, traverse the rows
	   from bottom to top.

	4. This alternating direction creates the required
	   column-wise wave form.

	5. Print every element during the traversal.


	Complexity Analysis

	Time : O(N * M)
		- Every element of the matrix is visited exactly once.

	Space : O(1)
		- No additional data structure is used.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Matrices2D.Additional_Questions;

import java.util.*;

public class PrintColumnInWaveForm {
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

        System.out.println("Column Wave Form: ");
        printWaveArray(mat);

        sc.close();
    }

    public static void printWaveArray(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Traverse through every column.
        for (int j = 0; j < m; j++) { // columns
            // Traverse even-indexed columns from top to bottom.
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) { // rows
                    System.out.print(mat[i][j] + " ");
                }
            }
            // Traverse odd-indexed columns from bottom to top.
            else {
                for (int i = n - 1; i >= 0; i--) { // rows
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}
