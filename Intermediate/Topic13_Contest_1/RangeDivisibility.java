/*
	Approach

	1. Create a prefix sum array where pSum[i] stores the
	   number of elements divisible by 7 from index 0 to i.

	2. Initialize pSum[0] based on whether A[0] is divisible
	   by 7.

	3. Traverse the remaining elements of A.
	   - If A[i] is divisible by 7, increment the previous
	     prefix count.
	   - Otherwise, carry forward the previous prefix count.

	4. For every query [L, R], find the number of elements
	   divisible by 7 in that range using the prefix sum array.

	   - If L == 0:
	     result = pSum[R]

	   - Otherwise:
	     result = pSum[R] - pSum[L - 1]

	5. Store the answer for every query in the result array.

	6. Return the result array.


	Complexity Analysis

	Time : O(N + Q)
		- O(N) time is required to build the prefix sum array.
		- Each query is answered in O(1) time.
		- For Q queries, the total query time is O(Q).

	Space : O(N + Q)
		- O(N) space is used for the prefix sum array.
		- O(Q) space is used for the result array.
*/

package Intermediate.Topic13_Contest_1;

import java.util.*;
public class RangeDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the Array elements: ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the row size: ");
        int r = sc.nextInt();

        System.out.print("Enter the column size: ");
        int c = sc.nextInt();

        System.out.println("Enter the queries: ");
        int[][] B = new int[r][c];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[] res = solve(A, B);

        System.out.println(Arrays.toString(res));

        sc.close();
    }

    public static int[] solve(int[] A, int[][] B) {
        // An empty array has no numbers to count
        if (A.length == 0) {
            return new int[0];
        }

        int[] pSum = new int[A.length];

        // Initialize the prefix count for the first element
        if (A[0] % 7 == 0)
            pSum[0] = 1;
        else
            pSum[0] = 0;

        // Build the prefix count array
        for (int i = 1; i < A.length; i++) {
            // If the current element is divisible by 7, increment the count.
            // Otherwise, carry forward the previous count.
            if (A[i] % 7 == 0)
                pSum[i] = pSum[i - 1] + 1;
            else
                pSum[i] = pSum[i - 1];
        }

        int[] result = new int[B.length];

        // Process each query
        for (int i = 0; i < B.length; i++) {
            int L = B[i][0];
            int R = B[i][1];

            if (L == 0)
                result[i] = pSum[R];
            else
                result[i] = pSum[R] - pSum[L - 1];
        }

        return result;
    }
}
