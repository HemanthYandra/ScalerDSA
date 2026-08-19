/*
    Approach

    Contribution Technique (Per-Cell Multiplier)

    1. For every cell A[i][j], determine how many submatrices contain it.
       - topLeft = (i+1) * (j+1)
         Number of ways to choose the top boundary (any row from 0..i)
         combined with the left boundary (any column from 0..j).
       - bottomRight = (N-i) * (M-j)
         Number of ways to choose the bottom boundary (any row from i..N-1)
         combined with the right boundary (any column from j..M-1).
    2. Multiply topLeft * bottomRight to get the total number of
       submatrices that include A[i][j].
    3. Multiply this count by A[i][j] itself and add to a running sum.
       - This sum accumulates each cell's contribution across all
         submatrices it belongs to.
    4. Return the total sum after processing every cell.

    Complexity Analysis

    Time : O(N x M)
        Single pass over all cells of the N x M matrix.

    Space : O(1)
        Only a running sum variable is used, no extra data structures.
*/

package Advanced.Topic02_Two_Dimensional_Arrays.Assignment;

import java.util.*;
public class SumOfAllSubmatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size(N): ");
        int n = sc.nextInt();

        System.out.print("Enter Col size(N): ");
        int m = sc.nextInt();

        int[][] A = new int[n][m];

        System.out.println("Enter the matrix elements: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int result = solve(A);

        System.out.println(result);

        sc.close();
    }

    public static int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        // accumulates the final answer, using long to avoid overflow
        long total = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                // top-left boundary choices
                long topLeft = (long) (i + 1) * (j + 1);

                // bottom-right boundary choices
                long bottomRight = (long) (n - i) * (m - j);

                // Total submatrices containing (i, j) = topLeft * bottomRight
                long contribution = topLeft * bottomRight;

                // Add this cell's contribution (count * value) to the running total
                total += contribution * A[i][j];
            }
        }

        return (int) total;
    }
}
