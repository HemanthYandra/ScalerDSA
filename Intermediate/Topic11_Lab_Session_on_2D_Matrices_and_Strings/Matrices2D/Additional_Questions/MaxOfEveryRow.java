/*
	Approach

	1. Create an array ans of size N to store the maximum
	   element of every row.

	2. Traverse the matrix row by row.

	3. For each row, initialize max with the first element
	   of that row.

	4. Traverse all the columns of the current row and
	   compare every element with max.

	5. If the current element is greater than max, update
	   max.

	6. Store the maximum value of the current row in ans[i].

	7. After processing all rows, return the result array.


	Complexity Analysis

	Time : O(N * M)
		- Every element of the matrix is visited exactly once.

	Space : O(N)
		- A result array of size N is created to store the
		  maximum element of every row.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Matrices2D.Additional_Questions;

import java.util.*;

public class MaxOfEveryRow {
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

        int[] result = maxOfEveryRow(mat);

        System.out.println("Maximum of every row: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }

    public static int[] maxOfEveryRow(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Create an array to store the maximum of every row
        int[] ans = new int[n];

        // Traverse through every row.
        for (int i = 0; i < n; i++) {
            // Initialize max with the first element of the row
            int max = mat[i][0];
            // Traverse through every column of the current row
            for (int j = 0; j < m; j++) {
                // Update max if the current element is greater
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }

            // Store the maximum of the current row
            ans[i] = max;
        }

        // Return the result array
        return ans;
    }
}
