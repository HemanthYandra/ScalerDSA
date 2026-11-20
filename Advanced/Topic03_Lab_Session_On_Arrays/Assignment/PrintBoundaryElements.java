/*
	Approach

	Boundary Traversal Using Four Directions

	1. Calculate the number of rows (N) and columns (M) in the
	   given matrix.

	2. Handle the edge cases:

	   - If N == 1, the matrix contains only one row.
	     Copy all elements from left to right into the result array.

	   - If M == 1, the matrix contains only one column.
	     Copy all elements from top to bottom into the result array.

	   These conditions ensure that every element is included
	   exactly once in single-row and single-column matrices.

	3. For a matrix with more than one row and column, calculate
	   the size of the boundary array using:

	   size = 2 * N + 2 * M - 4

	   This formula excludes the four corner duplicates.

	4. Initialize three variables:

	   - i   : represents the current row index.
	   - j   : represents the current column index.
	   - idx : represents the current position in the result array.

	   Initially, i = 0, j = 0, and idx = 0.

	5. Traverse the top boundary from left to right.

	   Start from A[0][0] and traverse M - 1 elements.
	   Store each element in the result array and increment j.

	   The top-right corner is excluded from this traversal
	   because it will be included in the next traversal.

	6. Traverse the right boundary from top to bottom.

	   Traverse N - 1 elements, storing each element in the
	   result array and incrementing i.

	   This includes the top-right corner and excludes the
	   bottom-right corner.

	7. Traverse the bottom boundary from right to left.

	   Traverse M - 1 elements, storing each element in the
	   result array and decrementing j.

	   This includes the bottom-right corner and excludes the
	   bottom-left corner.

	8. Traverse the left boundary from bottom to top.

	   Traverse N - 1 elements, storing each element in the
	   result array and decrementing i.

	   This includes the bottom-left corner and excludes the
	   top-left corner.

	9. Return the result array containing all boundary elements
	   in clockwise direction, starting from the top-left corner.

	10. By excluding the last element of each traversal and
	    including it in the next traversal, every boundary
	    element is stored exactly once without duplication.

	Complexity Analysis

	Time : O(N + M)
		For a matrix with N rows and M columns, only the boundary
		elements are traversed.
		The total number of boundary elements is:
		2 * N + 2 * M - 4.

	Space : O(1)
		  Only a constant number of variables are used for
		  traversal. The output array is not considered
		  auxiliary space.
          
          Output Space : O(N + M)
          The result array requires O(N + M) space, but 
          it is output space, not auxiliary space.
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

        int[] res = BoundaryElements(A);

        System.out.println(Arrays.toString(res));

        sc.close();
    }

    public static int[] BoundaryElements(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        // Edge Case (Single Row)
        if (N == 1) {
            int[] ans = new int[M];

            for (int j = 0; j < M; j++) {
                ans[j] = A[0][j];
            }

            return ans;
        }

        // Edge Case (Single Col)
        if (M == 1) {
            int[] ans = new int[N];

            for (int i = 0; i < N; i++) {
                ans[i] = A[i][0];
            }

            return ans;
        }

        int size = 2 * N + 2 * M - 4;
        int[] ans = new int[size];

        int i = 0;
        int j = 0;
        int idx = 0;

        // Left to Right (Top Wall)
        for (int k = 0; k < M - 1; k++) {
            ans[idx] = A[i][j];
            idx++;
            j++;
        }

        // Top to Bottom (Right Wall)
        for (int k = 0; k < N - 1; k++) {
            ans[idx] = A[i][j];
            idx++;
            i++;
        }

        // Right to Left (Bottom Wall)
        for (int k = 0; k < M - 1; k++) {
            ans[idx] = A[i][j];
            idx++;
            j--;
        }

        // Bottom to Top (Left Wall)
        for (int k = 0; k < N - 1; k++) {
            ans[idx] = A[i][j];
            idx++;
            i--;
        }

        return ans;
    }
}
