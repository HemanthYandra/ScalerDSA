/*
   Approach

   1. Build a variable-size sliding window
      by expanding the right pointer.

   2. Add the current element to the
      window sum.

   3. If the window sum becomes greater
      than or equal to B, shrink the
      window from the left until the
      sum becomes less than B.

   4. Once the window is valid:
      - Every subarray ending at the
        current right pointer and
        starting from s to e is valid.
      - Number of such subarrays is
        (e - s + 1).

   5. Add this value to the result.

   6. Return the total number of
      valid subarrays.

   Complexity Analysis

   Time  : O(N)
           - Each element enters and
             leaves the window at
             most once.

   Space : O(1)
           - Uses only a few extra
             variables.
*/

package Intermediate.Topic06_Sliding_Window_and_Contribution_Technique.Homework.Variable_Sliding_Window;

import java.util.*;

public class CountingSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the value of B: ");
        int B = sc.nextInt();
        int result = countSubarrays(A, B);
        System.out.println(result);
        sc.close();
    }

    // Returns the no. of subarrays
    // whose sum is less than B.
    public static int countSubarrays(int[] A, int B) {
        // An empty array has no subarrays.
        if (A.length == 0) {
            return 0;
        }

        // Stores the sum of the current window.
        int sum = 0;

        // Stores the total no. of valid subarrays.
        int result = 0;

        // Left and right pointers of the sliding window.
        int s = 0;
        int e = 0;

        // Expand the window.
        while (e < A.length) {

            // Include the current element.
            sum += A[e];

            // Shrink the window until
            // the sum becomes valid.
            while (sum >= B) {
                sum -= A[s];
                s++;
            }

            // Count all valid subarrays
            // ending at the current
            // right pointer.
            result += (e - s + 1);

            // Expand the window.
            e++;
        }

        // Return the total no. of valid subarrays.
        return result;
    }
}