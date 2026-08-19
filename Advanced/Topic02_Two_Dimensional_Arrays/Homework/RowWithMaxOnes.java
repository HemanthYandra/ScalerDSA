/*
    Approach

    Staircase Search from Top-Right

    1. Since the matrix is a square N x N matrix and each row is sorted
        (0s before 1s), start from the top-right corner using two pointers:
        i = 0 for the first row and j = n - 1 for the last column.

    2. At each step, check A[i][j]:
        - If A[i][j] == 1:
          This row has a 1 at the current column, so it may have more 1s
          than the previously selected row. Update bestRow = i and move
          j one position left to look for more 1s in the same row.

        - If A[i][j] == 0:
          Since the row is sorted, all elements to the left of j are also
          0. Therefore, this row cannot have more 1s, so move to the next
          row by incrementing i.

    3. The column pointer j is never reset when moving to the next row.
        Therefore, j can move left at most n times, while i can move down
        at most n times.

    4. When i reaches n or j becomes -1, stop. bestRow contains the index
        of the row with the maximum number of 1s.

        Since bestRow is updated only when a row extends the 1s boundary
        further left, an earlier row remains selected when two rows have
        the same maximum number of 1s.

    Complexity Analysis

    Time : O(n)
        i moves down at most n times and j moves left at most n times.
        Therefore, the total number of pointer movements is at most 2n,
        which simplifies to O(n).

    Space : O(1)
        Only a fixed number of variables (bestRow, i, j) are used.
        No additional data structure is required.
*/

package Advanced.Topic02_Two_Dimensional_Arrays.Homework;

import java.util.*;
public class RowWithMaxOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the matrix size(N): ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];

        System.out.println("Enter the binary elements: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int result = solve(A);

        System.out.println(result);

        sc.close();
    }

    public static int solve(int[][] A) {
        int n = A.length;

        // stores index of row with max 1s seen so far
        int bestRow = 0;

        int i = 0;      // start row: top
        int j = n - 1;  // start col: rightmost

        while(i < n && j >= 0) {
            // consume all trailing 1s in the current row, moving j left
            if(A[i][j] == 1){
                // this row has extended the 1s boundary, update ans
                bestRow = i;
                j--;
            }
            else {
                // move to the next row, j is not reset
                i++;
            }
        }

        return bestRow;
    }
}
