/*
	Approach

	1. Start from the top-right corner of the matrix.

	2. At position (i, j), compare the current element
	   with the target value k.

	3. If mat[i][j] < k:
	   - Since the current row is sorted in increasing
	     order, all elements to the left are smaller.
	   - Move down to the next row.

	4. If mat[i][j] > k:
	   - Since the current column is sorted in increasing
	     order, all elements below are greater.
	   - Move left to the previous column.

	5. If mat[i][j] == k, return true because the element
	   has been found.

	6. Continue until we move outside the matrix.

	7. If the loop ends, the element does not exist,
	   so return false.


	Complexity Analysis

	Time : O(N + M)
		- In every step, either i increases or j decreases.
		- i can increase at most N times and j can decrease
		  at most M times.

	Space : O(1)
		- Only a few variables are used.
*/

package Intermediate.Topic12_Problem_Solving_Session_1;

import java.util.*;
public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row size: ");
        int n = sc.nextInt();

        System.out.print("Enter the col size: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the value(k): ");
        int k = sc.nextInt();

        System.out.println(search(mat, k));

        sc.close();
    }

    public static boolean search(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;

        // Start from the top-right corner
        int i = 0;
        int j = m - 1;

        // Search while inside the matrix
        while(i < n && j >=0) {
            // Current element is smaller, move down
            if(mat[i][j] < k) {
                i++;
            }
            // Current element is greater, move left
            else if(mat[i][j] > k) {
                j--;
            }
            // Element found
            else {
                return true;
            }
        }

        // Element not found
        return false;
    }
}
