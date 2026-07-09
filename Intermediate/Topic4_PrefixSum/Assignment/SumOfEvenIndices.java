/*
   Approach

   1. Create a Prefix Sum array (pSum):
      - pSum[i] stores the sum of elements at even indices
        from index 0 to i.

   2. Build the Prefix Sum array:
      - Initialize pSum[0] = A[0] since index 0 is even.
      - If the current index is even:
          pSum[i] = pSum[i - 1] + A[i]
      - Otherwise:
          pSum[i] = pSum[i - 1]

   3. For each query [L, R]:
      - If L == 0:
          Sum = pSum[R]
      - Otherwise:
          Sum = pSum[R] - pSum[L - 1]

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

public class SumOfEvenIndices {
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
        long[] res = rangeSum(A, B);
        System.out.println(Arrays.toString(res));

        sc.close();
    }

    public static long[] rangeSum(int[] A, int[][] B) {
        if (A.length == 0) {
            return new long[0];
        }

        long[] pSum = new long[A.length];
        // Initialize with the first element since index 0 is an even index.
        pSum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            // If the current index is even, add its value to the prefix sum.
            // Otherwise, carry forward the previous prefix sum unchanged.
            if (i % 2 == 0)
                pSum[i] = pSum[i - 1] + A[i];
            else
                pSum[i] = pSum[i - 1];
        }

        long[] result = new long[B.length];
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
