/*
	Approach

	Boundary Traversal Using Four Boundaries

	1. Since the matrix is a square matrix of size N × N,
	   maintain four boundaries to represent the current
	   unvisited portion of the matrix:
	   
	   - T (Top)    : topmost unvisited row.
	   - B (Bottom) : bottommost unvisited row.
	   - L (Left)   : leftmost unvisited column.
	   - R (Right)  : rightmost unvisited column.

	2. Initially, the boundaries cover the complete matrix:
	   
	   - T = 0
	   - B = N - 1
	   - L = 0
	   - R = N - 1

	3. Traverse the top boundary from left to right.
	   
	   Print all elements in row T from column L to R.
	   After printing the top row, increment T because this
	   row has already been processed.

	4. Traverse the right boundary from top to bottom.
	   
	   Print the elements in column R from row T to B.
	   The top-right corner is not printed again because the
	   top row has already been traversed.
	   
	   After printing the right column, decrement R because
	   this column has already been processed.

	5. Traverse the bottom boundary from right to left.
	   
	   Before traversing, check T <= B to make sure that a
	   valid unvisited row still exists.
	   
	   Print the elements in row B from column R to L.
	   After printing the bottom row, decrement B.

	6. Traverse the left boundary from bottom to top.
	   
	   Before traversing, check L <= R to make sure that a
	   valid unvisited column still exists.
	   
	   Print the elements in column L from row B to T.
	   After printing the left column, increment L.

	7. The boundary checks are important for handling special
	   cases such as a 1 × 1 matrix or a matrix with only one
	   remaining row or column. They prevent the same elements
	   from being printed more than once.

	8. By moving the four boundaries inward after processing
	   each side, every boundary element is printed exactly
	   once.

	Complexity Analysis

	Time : O(N)
		There are 4N - 4 boundary elements in an N × N matrix.
		Each boundary element is visited exactly once.
		Therefore, the time complexity is O(N).

	Space : O(1)
		Only a constant number of variables are used for the
		boundaries and traversal indices.
		No additional data structure is used.
*/

package Advanced.Topic03_Lab_Session_On_Arrays.Homework;

import java.util.*;

public class PrintBoundaryElementsOfSquareMatrix {
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

        solve(A);

        sc.close();
    }

    public static void solve(int[][] A) {
        int n = A.length;

        int T = 0; 			// top row index
        int B = n - 1; 		// bottom row index

        int L = 0; 			// left column index
        int R = n - 1; 		// right column index

        // Traverse top row: left to right
        int row = T;
        for (int col = L; col <= R; col++) {
            System.out.print(A[row][col] + " ");
        }
        T++;

        // Traverse right column: top to bottom
        int col = R;
        for (row = T; row <= B; row++) {
            System.out.print(A[row][col] + " ");
        }
        R--;

        // Traverse bottom row: right to left
        if (T <= B) {
            row = B;
            for (col = R; col >= L; col--) {
                System.out.print(A[row][col] + " ");
            }
            B--;
        }
        
        // Traverse left column: bottom to top
        if (L <= R) {
            col = L;
            for (row = B; row >= T; row--) {
                System.out.print(A[row][col] + " ");
            }
            L++;
        }
    }
}
