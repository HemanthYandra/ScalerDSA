/*
	Approach

	1. Traverse the matrix column by column.

	2. For every column, use two pointers:
	   - l starts from the first row.
	   - r starts from the last row.

	3. Swap the elements at positions l and r
	   in the current column.

	4. Move l forward and r backward until they meet.

	5. This reverses every column in-place without creating
	   an additional matrix.


	Complexity Analysis

	Time : O(N * M)
		- Every element is visited at most once while
		  reversing the columns.

	Space : O(1)
		- The reversal is performed directly in the
		  original matrix.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Matrices2D.Additional_Questions;

import java.util.*;
public class ReverseEachColumn {
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

        reverseEachColumn(mat);

        // Print the modified matrix
        System.out.println("Matrix after reversing each column: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int[][] reverseEachColumn(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        // Traverse every column
        for (int j = 0; j < m; j++) {
            int l = 0;
            int r = n - 1;

            // Reverse the current column
            while (l < r) {
                int temp = A[l][j];
                A[l][j] = A[r][j];
                A[r][j] = temp;

                l++;
                r--;
            }
        }

        return A;
    }
}
