/*
	Approach

	Spiral Traversal of a Square Matrix Using Four Boundaries

	1. Maintain four boundary markers to represent the current
	   unvisited portion of the matrix:

	   - T (Top)    : topmost unvisited row.
	   - B (Bottom) : bottommost unvisited row.
	   - L (Left)   : leftmost unvisited column.
	   - R (Right)  : rightmost unvisited column.

	2. Initially, the boundaries cover the complete N × N matrix:

	   - T = 0
	   - B = N - 1
	   - L = 0
	   - R = N - 1

	   Create a result array of size N × N to store the elements
	   in clockwise spiral order.

	3. Continue the traversal while there is at least one
	   unvisited row and one unvisited column:

	   L <= R && T <= B

	4. Traverse the top boundary from left to right.

	   Store all elements from A[T][L] to A[T][R].
	   After processing the top row, increment T because the
	   current top row has been completely traversed.

	5. Traverse the right boundary from top to bottom.

	   Store all elements from A[T][R] to A[B][R].
	   After processing the right column, decrement R because
	   the current right column has been completely traversed.

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

	   After each complete layer, the boundaries move inward:

	   - T moves downward.
	   - R moves left.
	   - B moves upward.
	   - L moves right.

	9. The checks before traversing the bottom row and left
	   column prevent duplicate elements when the remaining
	   portion contains only one row or one column.

	10. Continue until all N × N elements have been stored in
	    the result array.

	11. Return the result array containing all elements of the
	    square matrix in clockwise spiral order.

	Complexity Analysis

	Time : O(N²)
		Every element of the N × N matrix is visited exactly once.
		Therefore, the time complexity is O(N²).

	Space : O(N²)
		The result array stores all N² elements in spiral order.
*/

package Advanced.Topic03_Lab_Session_On_Arrays.Homework;

import java.util.*;
public class SpiralSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of square matrix: ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];

        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int[] result = solve(A);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] solve(int[][] A) {
        int n = A.length;

        int[] result = new int[n * n];
        int idx = 0;

        int T = 0;          // top row index
        int B = n - 1;      // bottom row index

        int L = 0;          // left column index
        int R = n - 1;      // right column index

        // Continue until all rows or columns have been traversed
        while (L <= R && T <= B) {
            // Traverse the top row from left to right
            int row = T;
            for (int col = L; col <= R; col++) {
                result[idx] = A[row][col];
                idx++;
            }
            T++; // Move the top boundary down

            // Traverse the right column from top to bottom
            int col = R;
            for (row = T; row <= B; row++) {
                result[idx] = A[row][col];
                idx++;
            }
            R--; // Move the right boundary left

            // Traverse the bottom row from right to left
            // Check that an unvisited row still exists
            if (T <= B) {
                row = B;
                for (col = R; col >= L; col--) {
                    result[idx] = A[row][col];
                    idx++;
                }
                B--; // Move the bottom boundary up
            }

            // Traverse the left column from bottom to top
            // Check that an unvisited column still exists
            if (L <= R) {
                col = L;
                for (row = B; row >= T; row--) {
                    result[idx] = A[row][col];
                    idx++;
                }
                L++; // Move the left boundary right
            }
        }

        return result;
    }
}
