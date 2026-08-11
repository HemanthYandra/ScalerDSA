/*
	Approach

	1. Start from the top-left corner of the matrix,
	   which is the first element of the principal diagonal.

	2. Use two pointers:
	   - i represents the row index.
	   - j represents the column index.

	3. For every principal diagonal element, both the row
	   and column indices increase by 1.

	4. Continue until either the row index reaches the
	   number of rows or the column index reaches the
	   number of columns.

	5. Print each element mat[i][j] while traversing
	   the principal diagonal.


	Complexity Analysis

	Time : O(min(N, M))
		- We visit each element of the principal diagonal once.

	Space : O(1)
		- Only two pointer variables are used.
*/

package Intermediate.Topic09_2D_Matrices.Homework;

import java.util.*;
public class PrintPrincipalDiagonal {
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

        System.out.println("Principal Diagonal Elements: ");
        printPrincipalDiagonal(mat);
        
        sc.close();

    }

    public static void printPrincipalDiagonal(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Start from the top-left corner
        int i = 0;
        int j = 0;

        // Traverse diagonally by increasing both indices
        while(i < n && j < m) {
            System.out.print(mat[i][j] + " ");
            i++;
            j++;
        }
    }
}
