/*
   Approach

   1. Build the first window of size B
      and calculate its sum.

   2. Assume the first window has the
      minimum sum.
      - Since all windows have the same size,
        the window with the minimum sum also
        has the minimum average.

   3. Slide the window one element
      at a time.
      - Remove the leftmost element.
      - Add the next element.
      - If the current window has a smaller
        sum, update the minimum sum and its
        starting index.

   4. Return the starting index of the
      subarray having the least average.

   Complexity Analysis

   Time  : O(N)
           - One traversal to build and
             slide the window.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class SubarrayWithLeastAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the window size (B): ");
        int B = sc.nextInt();
        int result = solve(A, B);
        System.out.println(result);

        sc.close();
    }

    public static int solve(int[] A, int B) {
        // An empty array or an invalid window size
        // cannot form a valid subarray.
        if (A.length == 0 || B <= 0 || B > A.length) {
            return -1;
        }

        // Stores the sum of the current window.
        long sum = 0;

        // Step 1: Build the first window.
        int i = 0;
        while (i < B) {
            sum += A[i];
            i++;
        }

        // Step 2: Initialize the minimum sum
        // and its starting index.
        long minSum = sum;
        int minIdx = 0;

        // Step 3: Slide the window one element
        // at a time and update the minimum sum.
        int s = 1;
        int e = B;
        while (e < A.length) {
            sum = sum - A[s - 1] + A[e];

            // If the current window has a smaller sum,
            // update the minimum sum and its starting index.
            if (sum < minSum) {
                minSum = sum;
                minIdx = s;
            }

            s++;
            e++;
        }

        // Return the starting index of the
        // subarray with the least average.
        return minIdx;
    }
}
