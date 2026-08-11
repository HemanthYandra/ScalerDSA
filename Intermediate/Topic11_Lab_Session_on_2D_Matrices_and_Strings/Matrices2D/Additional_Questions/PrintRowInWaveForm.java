/*
	Approach

	1. Traverse the matrix row by row.

	2. For every even-indexed row, traverse the columns
	   from left to right.

	3. For every odd-indexed row, traverse the columns
	   from right to left.

	4. This alternating direction creates the required
	   row-wise wave form.

	5. Print every element during the traversal.


	Complexity Analysis

	Time : O(N * M)
		- Every element of the matrix is visited exactly once.

	Space : O(1)
		- No additional data structure is used.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Matrices2D.Additional_Questions;

import java.util.*;
public class PrintRowInWaveForm {
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

        System.out.println("Row Wave Form: ");
        printWaveArray(mat);

        sc.close();
    }

    public static void printWaveArray(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        // Traverse through every row
        for (int i = 0; i < n; i++) {   // rows
            // Traverse even-indexed rows from left to right
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {   // columns
                    System.out.print(mat[i][j] + " ");
                }
            } 
            // Traverse odd-indexed rows from right to left
            else {
                for (int j = m - 1; j >= 0; j--) {  // columns
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}
