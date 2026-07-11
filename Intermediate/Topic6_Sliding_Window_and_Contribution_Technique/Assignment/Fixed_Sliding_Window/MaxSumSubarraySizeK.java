/*
   Approach

   1. Build the first window of size K
      and calculate its sum.

   2. Store the first window sum as
      the current maximum sum.

   3. Slide the window one element at a time:
      - Remove the leftmost element.
      - Add the next element.
      - Update the maximum sum.

   4. Return the maximum sum.

   Complexity Analysis

   Time  : O(N)
           - One traversal of the array.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class MaxSumSubarraySizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the window size (K): ");
        int K = sc.nextInt();
        int result = slidingWindow(A, K);
        System.out.println(result);

        sc.close();
    }

    public static int slidingWindow(int[] A, int K) {
        // An empty array or an invalid window size
        // has no valid subarray.
        if (A.length == 0 || K <= 0 || K > A.length) {
            return 0;
        }

        // Stores the sum of the current window.
        int sum = 0;

        // Step 1: Build the first window
        int i = 0;
        while (i < K) {
            sum += A[i];
            i++;
        }

        // Step 2: Stores the sum of the first window
        int result = sum;

        // Step 3: Slide the window.
        int s = 1;
        int e = K;
        while (e < A.length) {
            sum = sum - A[s - 1] + A[e];

            // Update result
            result = Math.max(result, sum);

            s++;
            e++;
        }

        // Return the maximum window sum.
        return result;
    }
}
