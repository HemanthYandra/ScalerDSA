/*
	Approach

	Spiral Matrix Generation Using Layer-by-Layer Traversal

	1. Create an empty N × N matrix `ans` and initialize `value = 1`.
	   The values from 1 to N² will be filled in clockwise spiral order.

	2. Maintain `row` and `col` to represent the starting position
	   of the current layer.

	3. Use `A` to represent the number of rows and columns remaining
	   in the current layer.

	4. For every layer, traverse the four sides in clockwise order:
	   - Left -> Right
	   - Top -> Bottom
	   - Right -> Left
	   - Bottom -> Top

	5. Each side is traversed `A - 1` times because the corner
	   element is shared between two consecutive sides.

	6. After completing one layer, move `row` and `col` one step
	   inward and reduce `A` by 2 to process the next inner layer.

	7. If `A` becomes 1, the matrix has an odd dimension and
	   one center cell remains. Place the final value in that cell.

	Complexity Analysis

	Complexity Analysis

	Time : O(N²)
		Every cell of the N × N matrix is filled exactly once.

	Space : O(N²)
		The result matrix requires N × N space.

	Auxiliary Space : O(1)
		Only a constant number of variables are used apart from
		the result matrix.
*/

package Advanced.Topic03_Lab_Session_On_Arrays.Homework;

import java.util.*;

public class SpiralSquareMatrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of square matrix(A): ");
        int A = sc.nextInt();

        int[][] result = solve(A);

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int[][] solve(int A) {
        int[][] ans = new int[A][A];

        int row = 0;
        int col = 0;

        int value = 1;

        while (A > 1) {
            // Left -> Right
            for (int i = 1; i < A; i++) {
                ans[row][col] = value;
                value++;
                col++;
            }

            // Top -> Bottom
            for (int i = 1; i < A; i++) {
                ans[row][col] = value;
                value++;
                row++;
            }

            // Right -> Left
            for (int i = 1; i < A; i++) {
                ans[row][col] = value;
                value++;
                col--;
            }

            // Bottom -> Top
            for (int i = 1; i < A; i++) {
                ans[row][col] = value;
                value++;
                row--;
            }

            // Move to the next inner layer
            row += 1;
            col += 1;
            A -= 2;
        }

        // Handle the center element for odd-sized matrices
        if (A == 1) {
            ans[row][col] = value;
        }

        return ans;
    }
}
