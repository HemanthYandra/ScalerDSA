/*
   Approach

   1. Create a Prefix Sum array (pSum):
      - pSum[i] stores the count of even numbers
        from index 0 to i.

   2. Build the Prefix Sum array:
      - Initialize pSum[0]:
          - If A[0] is even, set pSum[0] = 1.
          - Otherwise, set pSum[0] = 0.
      - For each remaining element:
          - If A[i] is even:
              pSum[i] = pSum[i - 1] + 1
          - Otherwise:
              pSum[i] = pSum[i - 1]

   3. For each query [L, R]:
      - If L == 0:
          Count = pSum[R]
      - Otherwise:
          Count = pSum[R] - pSum[L - 1]

   4. Store the answer for each query in the result array.

   5. Return the result array.

   Complexity Analysis

   Time  : O(N + Q)
           - O(N) to build the Prefix Sum array.
           - O(Q) to answer all queries.

   Space : O(N)
           - Prefix Sum array.
*/

import java.util.*;

public class EvenNumbersInRange {
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
        // An empty array has no even numbers to count.
        if (A.length == 0) {
            return new int[0];
        }

        int[] pSum = new int[A.length];
        // Initialize the prefix count based on whether the first element is even.
        if (A[0] % 2 == 0)
            pSum[0] = 1;
        else
            pSum[0] = 0;
        for (int i = 1; i < A.length; i++) {
            // If the current element is even, increment the count.
            // Otherwise, carry forward the previous count.
            if (A[i] % 2 == 0)
                pSum[i] = pSum[i - 1] + 1;
            else
                pSum[i] = pSum[i - 1];
        }

        int[] result = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            int L = B[i][0];
            int R = B[i][1];

            if (L == 0)
                result[i] = pSum[R];
            else
                result[i] = pSum[R] - pSum[L - 1];
        }
        // Return the count of even numbers for each query.
        return result;
    }
}
