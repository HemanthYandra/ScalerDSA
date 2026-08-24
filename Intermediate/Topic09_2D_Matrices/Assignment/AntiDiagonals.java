/*
    Approach

    Anti-Diagonal Traversal from Boundary Cells

    1. An N x N matrix has exactly (2N - 1) anti-diagonals, since the value
       of (row + column) ranges from 0 to 2N - 2. Create a result matrix of
       size (2N - 1) x N to hold them, using row index d to track which
       anti-diagonal is currently being filled.

    2. Every anti-diagonal starts at either the first row or the last column.
        - Diagonals starting at (0, 0), (0, 1), ..., (0, N-1) cover all
          anti-diagonals that begin along the top row.
        - Diagonals starting at (1, N-1), (2, N-1), ..., (N-1, N-1) cover
          the rest, beginning along the last column (row 0 is skipped here
          since (0, N-1) was already covered above).

    3. For each starting cell (i, j), walk the diagonal by moving one row
       down and one column left at a time (i++, j--) until either index
       goes out of bounds. Write each visited element into result[d],
       filling positions left to right.

    4. Since diagonal length varies (1 up to N, then back down to 1), any
       unused trailing positions in a row of the result matrix are left as
       their default value, 0 — which doubles as the required padding.

    5. Increment d after each diagonal so the next one is written to the
       next row of the result matrix. After both loops complete, all
       (2N - 1) diagonals have been collected.


    Complexity Analysis

    Time : O(N^2)
        Every cell of the input matrix is visited exactly once across all
        diagonal traversals.

    Space : O(N^2)
        The result matrix has (2N - 1) rows and N columns.
*/

package Intermediate.Topic09_2D_Matrices.Assignment;

import java.util.*;

public class AntiDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the square matrix
        System.out.print("Enter Matrix Size: ");
        int n = sc.nextInt();

        // Input matrix
        int[][] A = new int[n][n];

        System.out.println("Enter the Matrix Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Find the anti-diagonals
        int[][] result = diagonal(A);

        // Print the result matrix
        System.out.println("Anti-Diagonals:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    // Collects all anti-diagonals of A into a (2N-1) x N matrix
    public static int[][] diagonal(int[][] A) {

        int n = A.length;

        // Create a result matrix with 2*N - 1 rows
        // and N columns to store all anti-diagonals.
        int[][] result = new int[2 * n - 1][n];

        // Tracks which row of result the current
        // anti-diagonal is being written into.
        int d = 0;

        // Start the first N anti-diagonals from
        // every element of the first row.
        for (int j = 0; j < n; j++) {
            printDiagonals(A, result, d, 0, j);
            d++;
        }

        // Start the remaining N - 1 anti-diagonals from
        // every row of the last column, excluding the first row.
        for (int i = 1; i < n; i++) {
            printDiagonals(A, result, d, i, n - 1);
            d++;
        }

        return result;
    }

    // Walks one anti-diagonal from (i, j) and writes it into result[d]
    public static void printDiagonals(
            int[][] A,
            int[][] result,
            int d,
            int i,
            int j) {

        int n = A.length;

        // Tracks the next column position to fill
        // within the current anti-diagonal's row.
        int idx = 0;

        // Traverse the anti-diagonal by moving
        // one row down and one column left.
        while (i < n && j >= 0) {
            // Store the current element in the
            // corresponding row of the result matrix.
            result[d][idx] = A[i][j];

            i++;
            j--;
            idx++;
        }
    }
}
