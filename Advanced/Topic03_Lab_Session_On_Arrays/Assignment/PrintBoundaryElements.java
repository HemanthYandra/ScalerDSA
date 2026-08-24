/*
	Approach

	Boundary Traversal Using Four Boundaries

	1. Maintain four boundary markers to represent the current
	   unvisited boundary of the matrix:
	   
	   - T (Top)    : represents the topmost unvisited row.
	   - B (Bottom) : represents the bottommost unvisited row.
	   - L (Left)   : represents the leftmost unvisited column.
	   - R (Right)  : represents the rightmost unvisited column.

	2. Initially, the boundaries are:
	   
	   - T = 0
	   - B = n - 1
	   - L = 0
	   - R = m - 1
	   
	   These boundaries represent the complete matrix.

	3. Traverse the top boundary from left to right.
	   
	   Print all elements from A[T][L] to A[T][R].
	   After completing the traversal, increment T because
	   the current top row has already been printed.

	4. Traverse the right boundary from top to bottom.
	   
	   Print all elements from A[T][R] to A[B][R].
	   The top-right corner is not printed again because T has
	   already been incremented after traversing the top row.
	   
	   After completing the traversal, decrement R because
	   the current right column has already been printed.

	5. Traverse the bottom boundary from right to left.
	   
	   This traversal is performed only if T <= B, ensuring
	   that a valid unvisited row still exists.
	   
	   Print all elements from A[B][R] to A[B][L].
	   After completing the traversal, decrement B because
	   the current bottom row has already been printed.

	6. Traverse the left boundary from bottom to top.
	   
	   This traversal is performed only if L <= R, ensuring
	   that a valid unvisited column still exists.
	   
	   Print all elements from A[B][L] to A[T][L].
	   After completing the traversal, increment L because
	   the current left column has already been printed.

	7. The boundary checks before traversing the bottom row and
	   left column are important for handling matrices with a
	   single row or a single column. They prevent elements from
	   being printed multiple times.

	8. By shrinking the boundaries after traversing each side,
	   every boundary element is printed exactly once.

	Complexity Analysis

	Time : O(N × M)
		Every element on the boundary is visited at most once.
		For an N × M matrix, the traversal takes O(N × M) in
		the general case.

	Space : O(1)
		Only a constant number of variables are used to maintain
		the four boundaries and traversal indices.
*/

package Advanced.Topic03_Lab_Session_On_Arrays.Assignment;

import java.util.*;
public class PrintBoundaryElements {
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

        solve(A);

        sc.close();
    }

    public static void solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int T = 0;          // top row index
        int B = n - 1;      // bottom row index
        
        int L = 0;          // left column index
        int R = m - 1;      // right column index

        // Traverse top row: left to right
        int row = T;
        for(int col = L; col <= R; col++) {
            System.out.print(A[row][col] + " ");
        }
        T++;    // Move the top boundary down

        // Traverse right column: top to bottom
        int col = R;
        for(row = T; row <= B; row++) {
            System.out.print(A[row][col] + " ");
        }
        R--;    // Move the right boundary left

        // Traverse the bottom row from right to left
        // Check that an unvisited row still exists
        if (T <= B) {
            row = B;
            for (col = R; col >= L; col--) {
                System.out.print(A[row][col] + " ");
            }
            B--;    // Move the bottom boundary up
        }

        // Traverse the left column from bottom to top
        // Check that an unvisited column still exists
        if (L <= R) {
            col = L;
            for (row = B; row >= T; row--) {
                System.out.print(A[row][col] + " ");
            }
            L++;    // Move the left boundary right
        }
    }
}
