/*
	Approach

	1. An anti-diagonal contains elements where the row index
	   increases by 1 and the column index decreases by 1.

	2. Every anti-diagonal starts either:
	   - From a cell in the first row, or
	   - From a cell in the last column.

	3. First, traverse all cells of the first row from left
	   to right and use each cell as the starting point of
	   an anti-diagonal.

	4. Then, traverse the remaining rows starting from the
	   last column. Start from row 1 because the anti-diagonal
	   starting at mat[0][m-1] was already printed.

	5. For every starting position, use the printDiagonals()
	   method to move:
	   - One row down: i++
	   - One column left: j--

	6. Continue until the row goes outside the matrix or the
	   column becomes negative.


	Complexity Analysis

	Time : O(N * M)
		- Every matrix element is visited exactly once.

	Space : O(1)
		- Only row and column variables are used apart from
		  the input matrix.
*/

package Intermediate.Topic09_2D_Matrices.Homework;

import java.util.*;
public class PrintAllAntiDiagonals {
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

        System.out.println("All Anti Diagonal Elements: ");
        printAllAntiDiagonals(mat);

        sc.close();
    }

    public static void printAllAntiDiagonals(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Start anti-diagonals from every column of the first row (0th row)
        int i = 0;
        for(int j = 0; j < m; j++) {
            printDiagonals(mat, i, j);
            System.out.println();
        }

        // Start remaining anti-diagonals from the last column (m - 1 cols)
        // Start from row 1 because row 0 was already covered.
        int j = m - 1;
        for(i = 1; i < n; i++) {
            printDiagonals(mat, i, j);
            System.out.println();
        }
    }

    public static void printDiagonals(int[][] mat, int i, int j) {
        int n = mat.length;

        // Move down one row and left one column
        while(i < n && j >= 0) {
            System.out.print(mat[i][j] + " ");

            i++;
            j--;
        }
    }
}
