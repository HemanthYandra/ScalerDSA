/*
   Approach

   1. Create a copy array:
      - Store the original value at odd indices.
      - Store 0 at even indices.

   2. Build a Prefix Sum array (pSum):
      - pSum[i] stores the sum of elements (only from odd indices)
        from index 0 to i.

   3. For each query [L, R]:
      - If L == 0:
          Sum = pSum[R]
      - Otherwise:
          Sum = pSum[R] - pSum[L - 1]

   4. Store the answer for each query in the result array.

   5. Return the result array.

   Complexity Analysis

   Time  : O(N + Q)
           - O(N) to create the copy array and build the Prefix Sum.
           - O(Q) to answer all queries.

   Space : O(N)
           - Copy array + Prefix Sum array.
*/

import java.util.*;

public class SumOfOddIndices {
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

        int[] arr_copy = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (i % 2 != 0) {
                arr_copy[i] = A[i];
            } else {
                arr_copy[i] = 0;
            }
        }

        long[] pSum = new long[arr_copy.length];
        pSum[0] = arr_copy[0];

        for (int i = 1; i < arr_copy.length; i++) {
            pSum[i] = pSum[i - 1] + arr_copy[i];
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
