/*
   Approach

   1. Since all array elements are positive,
      use the Sliding Window technique.

   2. Expand the window by moving the right pointer.

   3. Add the current element to the window sum.

   4. If the window sum exceeds B,
      shrink the window from the left
      until the sum becomes less than or equal to B.

   5. After every valid window,
      update the maximum sum.

   6. Return the maximum valid subarray sum.

   Complexity Analysis

   Time  : O(N)
           - Each element enters and leaves
             the window at most once.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int A = sc.nextInt();
        System.out.print("Enter the max sum limit: ");
        int B = sc.nextInt();
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] C = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            C[i] = sc.nextInt();
        }
        int result = maxSubarray(A, B, C);
        System.out.println(result);

        sc.close();
    }

    public static int maxSubarray(int A, int B, int[] C) {
        // An empty array has no subarrays.
        if (A == 0) {
            return 0;
        }

        // Stores the current window sum.
        int sum = 0;

        // Stores the maximum valid subarray sum.
        int maxSum = 0;

        // Left and right pointers of the sliding window.
        int s = 0;
        int e = 0;

        // Expand the window.
        while (e < A) {

            // Include the current element.
            sum += C[e];

            // Shrink the window until
            // the sum becomes valid.
            while (sum > B && s <= e) {
                sum -= C[s];
                s++;
            }

            // Update the answer.
            if (sum <= B) {
                maxSum = Math.max(maxSum, sum);
            }

            // Expand the window.
            e++;
        }

        // Return the maximum valid sum.
        return maxSum;
    }
}
