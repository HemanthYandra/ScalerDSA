/*
	Approach

	1. Traverse the matrix row by row.

	2. For every row, use two pointers:
	   - l starts from the first column.
	   - r starts from the last column.

	3. Swap the elements at positions l and r.

	4. Move l forward and r backward until they meet.

	5. This reverses every row in-place without creating
	   an additional matrix.


	Complexity Analysis

	Time : O(N * M)
		- Every element is visited at most once while
		  reversing the rows.

	Space : O(1)
		- The reversal is performed directly in the
		  original matrix.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Matrices2D.Additional_Questions;

import java.util.*;
public class ReverseEachRow {
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

        reverseEachRow(mat);

        // Print the modified matrix
        System.out.println("Matrix after reversing each row: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int[][] reverseEachRow(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        // Traverse every row
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = m - 1;
            // Reverse the current row
            while (l < r) {
                int temp = A[i][l];
                A[i][l] = A[i][r];
                A[i][r] = temp;

                l++;
                r--;
            }
        }

        return A;
    }
}
