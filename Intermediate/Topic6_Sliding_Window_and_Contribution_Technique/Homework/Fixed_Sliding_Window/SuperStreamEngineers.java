/*
   Approach

   1. If the array is empty or the window size is invalid,
      return 0 because no valid subarray can exist.

   2. Build the first window of size B
      and calculate its sum.

   3. Check whether the average of the first window
      is less than or equal to C.
      - Average = sum / B
      - Instead of performing division,
        compare sum <= (B * C).
      - This avoids division and prevents
        precision issues.

   4. Slide the window one element at a time.
      - Remove the leftmost element from the sum.
      - Add the next element to the sum.
      - Check whether the new window satisfies
        the required average condition.

   5. If any window satisfies the condition,
      return 1 immediately.

   6. If no valid window is found after checking
      all possible windows, return 0.

   Complexity Analysis

   Time  : O(N)
           - One traversal to build and slide
             the window.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class SuperStreamEngineers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the subarray size: ");
        int B = sc.nextInt();
        System.out.print("Enter the average of subarray: ");
        int C = sc.nextInt();
        long result = slidingWindow(A, B, C);
        System.out.println(result);

        sc.close();
    }

    public static long slidingWindow(int[] A, int B, int C) {
        // An empty array or an invalid window size
        // cannot contain a valid subarray.
        if (A.length == 0 || B <= 0 || B > A.length) {
            return 0;
        }

        int n = A.length;

        // Stores the sum of the current window.
        long sum = 0;

        // Step 1: Build the first window
        int i = 0;
        while (i < B) {
            sum += A[i];
            i++;
        }

        // Step 2: Check the first window.
        if (sum <= (long) B * C) {
            return 1;
        }

        // Step 3: Slide the window.
        int s = 1;
        int e = B;
        while (e < n) {
            sum = sum - A[s - 1] + A[e];

            // Check the current window.
            if (sum <= (long) B * C) {
                return 1;
            }

            s++;
            e++;
        }

        // No valid subarray found.
        return 0;
    }
}
