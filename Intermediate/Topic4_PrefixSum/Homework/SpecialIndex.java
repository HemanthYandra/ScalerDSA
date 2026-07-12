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
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int result = countSpecialIndices(A);
        System.out.println(result);

        sc.close();
    }

    public static int countSpecialIndices(int[] A) {
        int[] prefixSumEven = buildEvenPrefixSum(A);
        int[] prefixSumOdd = buildOddPrefixSum(A);

        int count = 0;
        int N = A.length;

        for (int i = 0; i < N; i++) {
            int evenSum;
            int oddSum;
            /*
               prefixSumEven[i] = sum of all even index elements from 0 to i
               prefixSumOdd[i] = sum of all odd index elements from 0 to i
             */
            if (i == 0) {
                /*
                   If we remove index 0:
                   There are no elements before index 0.
                   evenSum = Sum of odd elements from 1 to N-1
                   oddSum = Sum of even elements from 1 to N-1
                 */
                evenSum = prefixSumOdd[N - 1] - prefixSumOdd[i];
                oddSum = prefixSumEven[N - 1] - prefixSumEven[i];
            } else {
                /*
                   evenSum = prefixSumEven[i - 1] → even elements before i (0 to i - 1)
                   + (prefixSumOdd[N - 1] - prefixSumOdd[i]) → odd elements after i (i + 1 to 
                   N - 1)
                  
                   oddSum = prefixSumOdd[i - 1] → odd elements before i (0 to i - 1)
                   + (prefixSumEven[N - 1] - prefixSumEven[i]) → even elements after i (i + 1 to
                   N - 1)
                 */
                evenSum = prefixSumEven[i - 1]
                        + (prefixSumOdd[N - 1] - prefixSumOdd[i]);
                oddSum = prefixSumOdd[i - 1]
                        + (prefixSumEven[N - 1] - prefixSumEven[i]);
            }

            // If both sums are equal, index i is a special index
            if (evenSum == oddSum)
                count++;
        }

        // Return the total number of special indices.
        return count;
    }

    // Builds and returns the prefix sum array for elements at even indices.
    public static int[] buildEvenPrefixSum(int[] A) {
        int[] evenPrefix = new int[A.length];

        // Index 0 is even, so include arr[0]
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
    public static int[] buildOddPrefixSum(int[] A) {
        int[] oddPrefix = new int[A.length];

        // Index 0 is even, so odd sum starts at 0
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
