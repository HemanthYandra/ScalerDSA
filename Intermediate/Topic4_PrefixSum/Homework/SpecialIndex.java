/*
   Approach

   1. Build two Prefix Sum arrays:
      - evenPrefix[i] stores the sum of elements at even indices
        from index 0 to i.
      - oddPrefix[i] stores the sum of elements at odd indices
        from index 0 to i.

   2. Traverse each index i assuming A[i] is removed.

   3. After removing A[i]:
      - Elements before index i keep their original parity.
      - Elements after index i shift one position left,
        so their parity changes.
      - Calculate:
          evenSum = sum of even-indexed elements after removal.
          oddSum  = sum of odd-indexed elements after removal.

   4. If evenSum == oddSum,
      increment the count.

   5. Return the total count of special indices.

   Complexity Analysis

   Time  : O(N)
           - O(N) to build the even prefix array.
           - O(N) to build the odd prefix array.
           - O(N) to check every index.

   Space : O(N)
           - Two Prefix Sum arrays.
*/

import java.util.*;

public class SpecialIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.close();
    }

    public static int solve(int[] A) {
        // An empty array has no special indices.
        if (A.length == 0) {
            return 0;
        }

        // Build prefix sums for even and odd indices separately.
        int[] prefixSumEven = evenPrefixArray(A);
        int[] prefixSumOdd = oddPrefixArray(A);
        int count = 0;
        int N = A.length;

        // Assume A[i] is removed and calculate the new even and odd sums.
        for (int i = 0; i < N; i++) {
            int evenSum = 0;
            int oddSum = 0;

            if (i == 0) {
                // Removing the first element shifts all remaining elements left,
                // so even and odd positions are swapped.
                evenSum = prefixSumOdd[N - 1] - prefixSumOdd[i];
                oddSum = prefixSumEven[N - 1] - prefixSumEven[i];
            } else {
                // Elements before i keep their parity.
                // Elements after i shift left, so even and odd positions swap.
                evenSum = prefixSumEven[i - 1] + (prefixSumOdd[N - 1] - prefixSumOdd[i]);
                oddSum = prefixSumOdd[i - 1] + (prefixSumEven[N - 1] - prefixSumEven[i]);
            }

            // If the sums of even and odd indexed elements are equal
            // after removing A[i], then i is a special index.
            if (evenSum == oddSum) {
                count++;
            }
        }
        // Return the total number of special indices.
        return count;
    }

    // Builds and returns the prefix sum array for elements at even indices.
    public static int[] evenPrefixArray(int[] A) {
        int[] evenPrefix = new int[A.length];
        // Initialize with the first element since index 0 is an even index.
        evenPrefix[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            // If the current index is even, add its value to the prefix sum.
            // Otherwise, carry forward the previous prefix sum.
            if (i % 2 == 0) {
                evenPrefix[i] = evenPrefix[i - 1] + A[i];
            } else {
                evenPrefix[i] = evenPrefix[i - 1];
            }
        }
        // Return the prefix sum array for even indices.
        return evenPrefix;
    }

    // Builds and returns the prefix sum array for elements at odd indices.
    public static int[] oddPrefixArray(int[] A) {
        int[] oddPrefix = new int[A.length];
        // Initialize with 0 since index 0 is not an odd index.
        oddPrefix[0] = 0;

        for (int i = 1; i < A.length; i++) {
            // If the current index is odd, add its value to the prefix sum.
            // Otherwise, carry forward the previous prefix sum.
            if (i % 2 != 0) {
                oddPrefix[i] = oddPrefix[i - 1] + A[i];
            } else {
                oddPrefix[i] = oddPrefix[i - 1];
            }
        }
        // Return the prefix sum array for odd indices.
        return oddPrefix;
    }
}
