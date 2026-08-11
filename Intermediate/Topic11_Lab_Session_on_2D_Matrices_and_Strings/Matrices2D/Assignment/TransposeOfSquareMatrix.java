/*
	Approach

	1. Since the matrix is square, its number of
	   rows and columns are equal.

	2. Traverse only the upper triangular part
	   of the matrix.

	3. For every element at position (i, j),
	   swap it with the element at position (j, i).

	4. Start j from i + 1 so that:

	   - The diagonal elements are not changed.
	   - Each pair of elements is swapped only once.

	5. After all the required swaps, the matrix
	   becomes its transpose.

	6. Return the modified matrix.

	Complexity Analysis

	Time  : O(N²)
	- Traverse approximately half of the
	  N × N matrix.

	Space : O(1)
	- The transpose is performed in-place
	  without using an additional matrix.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Matrices2D.Assignment;

import java.util.*;
public class TransposeOfSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row size: ");
        int n = sc.nextInt();

        System.out.print("Enter the col size: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        // Read the matrix elements
        System.out.println("Enter the matrix elements: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Transpose the square matrix
        int[][] res = transpose(mat);

        System.out.println("Transpose of Square Matrix: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int[][] transpose(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Traverse only the upper triangular part
        // of the square matrix.
        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {

                // Swap mat[i][j] with mat[j][i]
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Return the transposed matrix
        return mat;
    }
}
