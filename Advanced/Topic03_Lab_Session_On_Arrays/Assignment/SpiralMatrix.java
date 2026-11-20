/*
	Approach

	Spiral Traversal Using Four Directions

	1. Calculate the number of rows (N) and columns (M) in the
	   given matrix.

	2. Create a result array of size N × M to store all the
	   elements in spiral order.

	3. Initialize three variables:

	   - i   : represents the current row index.
	   - j   : represents the current column index.
	   - idx : represents the current position in the result array.

	   Initially, i = 0, j = 0, and idx = 0.

	4. Continue the traversal while both dimensions are greater
	   than zero:

	   N > 0 && M > 0

	5. Handle the single-row edge case:

	   If N == 1, traverse all remaining elements from left to
	   right and store them in the result array.

	   After storing the elements, break the loop because
	   no other traversal is required.

	6. Handle the single-column edge case:

	   If M == 1, traverse all remaining elements from top to
	   bottom and store them in the result array.

	   After storing the elements, break the loop because
	   no other traversal is required.

	7. Traverse the top boundary from left to right.

	   Traverse M - 1 elements, storing each element in the
	   result array and incrementing j.

	   The top-right corner is excluded because it will be
	   included in the next traversal.

	8. Traverse the right boundary from top to bottom.

	   Traverse N - 1 elements, storing each element in the
	   result array and incrementing i.

	   The bottom-right corner is excluded because it will be
	   included in the next traversal.

	9. Traverse the bottom boundary from right to left.

	   Traverse M - 1 elements, storing each element in the
	   result array and decrementing j.

	   The bottom-left corner is excluded because it will be
	   included in the next traversal.

	10. Traverse the left boundary from bottom to top.

	    Traverse N - 1 elements, storing each element in the
	    result array and decrementing i.

	    The top-left corner is excluded because it has already
	    been included in the first traversal.

	11. Move to the next inner layer of the matrix:

	    - Increment i to move one row downward.
	    - Increment j to move one column rightward.
	    - Decrease N by 2 to exclude the top and bottom rows.
	    - Decrease M by 2 to exclude the left and right columns.

	    This ensures that the next iteration processes only
	    the remaining inner portion of the matrix.

	12. Repeat the same four directional traversals until
	    all elements have been stored in the result array.

	13. Return the result array containing all matrix elements
	    in spiral order.

	Complexity Analysis

	Time : O(N × M)
		Every element of the matrix is visited exactly once.
		There are N × M elements in total.

	Space : O(1)
		Only a constant number of variables are used for
		traversal. The output array is not considered
		auxiliary space.

		Output Space : O(N × M)
		The result array stores all N × M elements in
		spiral order.
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

        int[] result = spiralOrder(A);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] spiralOrder(final int[][] A) {
        int N = A.length;
        int M = A[0].length;

        int[] ans = new int[N * M];

        int i = 0;
        int j = 0;
        int idx = 0;

        while (N > 0 && M > 0) {
            // Edge Case (Single Row)
            if (N == 1) {
                for (int k = 0; k < M; k++) {
                    ans[idx] = A[i][j];
                    idx++;
                    j++;

                }
                break;
            }

            // Edge Case (Single Col)
            if (M == 1) {
                for (int k = 0; k < N; k++) {
                    ans[idx] = A[i][j];
                    idx++;
                    i++;
                }
                break;
            }

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

            // Move to Inner Layer
            i++;
            j++;

            // Reduce the dimensions by 2 to exclude the outer layer
            N -= 2;
            M -= 2;
        }

        return ans;
    }
}
