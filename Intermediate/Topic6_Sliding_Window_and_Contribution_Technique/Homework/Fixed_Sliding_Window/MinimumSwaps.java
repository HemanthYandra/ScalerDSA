/*
   Approach

   1. Count how many elements are less than
      or equal to B.
      - This gives the required window size K.

   2. If there are no such elements,
      return 0 because no swaps are needed.

   3. Build the first window of size K.
      - Count the number of "bad" elements
        (elements greater than B) in this window.

   4. The number of bad elements in a window
      represents the minimum swaps required
      for that window.

   5. Slide the window one element at a time.
      - Add the new element entering the window.
      - Remove the element leaving the window.
      - Update the count of bad elements.
      - Keep track of the minimum bad count.

   6. Return the minimum number of swaps.

   Complexity Analysis

   Time  : O(N)
           - One traversal to count good elements.
           - One traversal to process all windows.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class MinimumSwaps {
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
        int result = solve(A, B);
        System.out.println(result);

        sc.close();
    }

    public static int solve(int[] A, int B) {
        // Count the number of elements
        // less than or equal to B.
        int K = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= B) {
                K++;
            }
        }

        // If there are no such elements,
        // no swaps are required.
        if (K == 0) {
            return 0;
        }

        // Step 1: Build the first window of size K
        // and count the bad elements in it.
        int i = 0;
        int bad = 0;
        while (i < K) {
            if (A[i] > B) {
                bad++;
            }
            i++;
        }

        // Step 2: Initialize the minimum swaps
        // using the bad count of the first window.
        int minSwaps = bad;

        // Step 3: Slide the window one element
        // at a time and update the bad count.
        int s = 1;
        int e = K;
        while (e < A.length) {

            // If the new element entering the window
            // is bad, increase the bad count.
            if (A[e] > B) {
                bad++;
            }

            // If the element leaving the window
            // is bad, decrease the bad count.
            if (A[s - 1] > B) {
                bad--;
            }

            // Update the minimum swaps needed.
            minSwaps = Math.min(minSwaps, bad);

            s++;
            e++;
        }

        // Return the minimum swaps required.
        return minSwaps;

    }
}
