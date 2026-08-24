/*
	Approach

	Spiral Traversal Using Four Boundaries

	1. Maintain four boundary markers to represent the current
	   unvisited portion of the matrix:

	   - T (Top)    : topmost unvisited row.
	   - B (Bottom) : bottommost unvisited row.
	   - L (Left)   : leftmost unvisited column.
	   - R (Right)  : rightmost unvisited column.

	2. Initialize the boundaries to cover the complete matrix:

	   - T = 0
	   - B = N - 1
	   - L = 0
	   - R = M - 1

	   Also create a result array of size N × M to store the
	   elements in spiral order.

	3. Continue the traversal while there is at least one
	   unvisited row and one unvisited column:

	   L <= R && T <= B

	4. Traverse the top boundary from left to right.

	   Store all elements from A[T][L] to A[T][R].
	   After processing the top row, increment T because this
	   row has been completely traversed.

	5. Traverse the right boundary from top to bottom.

	   Store all elements from A[T][R] to A[B][R].
	   After processing the right column, decrement R because
	   this column has been completely traversed.

	6. Traverse the bottom boundary from right to left.

	   This traversal is performed only when T <= B, ensuring
	   that an unvisited row still exists.

	   Store all elements from A[B][R] to A[B][L].
	   After processing the bottom row, decrement B.

	7. Traverse the left boundary from bottom to top.

	   This traversal is performed only when L <= R, ensuring
	   that an unvisited column still exists.

	   Store all elements from A[B][L] to A[T][L].
	   After processing the left column, increment L.

	8. Repeat the same four traversals for the remaining
	   inner portion of the matrix.

	   After every complete cycle, the four boundaries move
	   inward:

	   - T moves downward.
	   - R moves left.
	   - B moves upward.
	   - L moves right.

	9. The boundary checks before traversing the bottom row
	   and left column are important. They prevent duplicate
	   elements when the remaining portion of the matrix has
	   only one row or one column.

	10. Continue until all N × M elements have been stored in
	    the result array.

	Complexity Analysis

	Time : O(N × M)
		Every element of the matrix is visited exactly once.
		There are N × M elements in total.

	Space : O(N × M)
		The result array stores all N × M elements in spiral
		order.
*/

package Advanced.Topic03_Lab_Session_On_Arrays.Assignment;

import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter no. of cols: ");
        int m = sc.nextInt();
        int[][] A = new int[n][m];

        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int[] result = solve(A);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        // Create a result array to store all matrix elements in spiral order
        int[] result = new int[n * m];
        int idx = 0;

        int T = 0;          // top row index
        int B = n - 1;      // bottom row index

        int L = 0;          // left column index
        int R = m - 1;      // right column index

        // Continue until all rows or columns have been traversed
        while(L <= R && T <= B) {
            // Traverse the top row from left to right
            int row = T;
            for(int col = L; col <= R; col++) {
                result[idx] = A[row][col];
                idx++;
            }
            T++;    // Move the top boundary down

            // Traverse the right column from top to bottom
            int col = R;
            for(row = T; row <= B; row++) {
                result[idx] = A[row][col];
                idx++;
            }
            R--;    // Move the right boundary left

            // Traverse the bottom row from right to left
            // Check that an unvisited row still exists
            if (T <= B) {
                row = B;
                for (col = R; col >= L; col--) {
                    result[idx] = A[row][col];
                    idx++;
                }
                B--;    // Move the bottom boundary up
            }

            // Traverse the left column from bottom to top
            // Check that an unvisited column still exists
            if (L <= R) {
                col = L;
                for (row = B; row >= T; row--) {
                    result[idx] = A[row][col];
                    idx++;
                }
                L++;    // Move the left boundary right
            }
        }

        return result;
    }
}
