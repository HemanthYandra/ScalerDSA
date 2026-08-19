/*
    Approach 
    
    Staircase Search from Top-Right

    1. Since every row and column is sorted in non-decreasing order,
       start from the top-right corner of the matrix (i = 0, j = m-1).
       This position is the largest element in its row and the smallest
       element in its column, which lets us eliminate a row or column
       on every step.

    2. At each cell A[i][j], compare it with B:
       - If A[i][j] == B, we've found the topmost row containing B
         (since i only ever increases, no earlier row could hold it).
         Duplicates of B in a sorted row are contiguous, so scan left
         from j while the neighboring cell still equals B, to find the
         leftmost occurrence in this row. Return immediately using
         that leftmost column (1-based index).
       - If A[i][j] < B, the entire current column above is even smaller,
         so B can't be in this row anymore; move down (i++).
       - If A[i][j] > B, the entire current column below is even bigger,
         so move left (j--) to a smaller value.

    3. Repeat until i goes out of bounds (row exhausted) or j goes out
       of bounds (column exhausted), meaning B was never found.

    4. Return the answer as soon as the topmost row's leftmost matching
       column is found, or -1 if B is never found.

    Complexity Analysis

    Time : O(N + M)
        The staircase walk moves down or left at most N + M times total.
        The inner leftward scan for duplicates runs at most M times in
        the worst case, but only once (not per outer step), so the
        overall bound stays O(N + M).

    Space : O(1)
        Only a constant number of extra variables are used.
*/

package Advanced.Topic02_Two_Dimensional_Arrays.Assignment;

import java.util.*;
public class SearchInRowwiseAndColwiseSortedMatrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row size(N): ");
        int n = sc.nextInt();

        System.out.print("Enter the col size(M): ");
        int m = sc.nextInt();

        int[][] A = new int[n][m];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element you want to search(B): ");
        int B = sc.nextInt();

        System.out.println(solveFromTopRight(A, B));

        sc.close();
    }

    // starts top-right (i = 0, j = m - 1)
    public static int solveFromTopRight(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;

        int i = 0;      // start row: top
        int j = m - 1;  // start col: rightmost

        while(i < n && j >= 0) {
            if(A[i][j] == B) {
                // Found B — since i only increases, this is the topmost
                // row that can contain B. Now find the leftmost duplicate
                // of B within this row.
                int col = j;
                while (col - 1 >= 0 && A[i][col - 1] == B) {
                    col--; // keep moving left while duplicates of B continue
                }

                // Convert 0-based index to 1-based index and return immediately
                return (i + 1) * 1009 + (col + 1);
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

        return -1;
    }
}
