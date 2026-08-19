/*
    Approach

    Staircase Search from Top-Right

    1. Since every row and column is sorted in ascending order, start
       from the top-right corner of the matrix (i = 0, j = m-1). This
       position is the largest element in its row and the smallest
       element in its column, which lets us eliminate a row or column
       on every step.

    2. At each cell A[i][j], compare it with B:
       - If A[i][j] == B, we found it, return true.
       - If A[i][j] < B, everything in this row to the left of j is
         even smaller, so B can't be here; move down (i++).
       - If A[i][j] > B, everything in this column below i is even
         bigger, so move left (j--) to a smaller value.

    3. Repeat until i goes out of bounds (i >= n) or j goes out of
       bounds (j < 0), meaning the whole matrix has been eliminated.

    4. Return false if the loop ends without finding B.

    Complexity Analysis

    Time : O(N + M)
        Each step either increases i by 1 or decreases j by 1, so the
        walk takes at most N + M steps before exiting the matrix.

    Space : O(1)
        Only a constant number of extra variables (i, j) are used.
*/

package Advanced.Topic02_Two_Dimensional_Arrays.Assignment;

import java.util.*;
public class SearchInRowwiseAndColwiseSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row size(N): ");
        int n = sc.nextInt();

        System.out.print("Enter the col size(M): ");
        int m = sc.nextInt();

        int[][] A = new int[n][m];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element you want to search(B): ");
        int B = sc.nextInt();

        System.out.println(solveFromTopRight(A, B));

        sc.close();
    }

    // starts top-right (i = 0, j = m - 1)
    public static boolean solveFromTopRight(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;

        int i = 0;      // start row: top
        int j = m - 1;  // start col: rightmost

        while(i < n && j >= 0) {
            if(A[i][j] == B) {
                // Element found
                return true;
            }
            else if(A[i][j] < B) {
                // Current value is too small, move down
                i++;
            }
            else {
                // Current value is too large, move left
                j--;
            }
        }

        return false;
    }
}
