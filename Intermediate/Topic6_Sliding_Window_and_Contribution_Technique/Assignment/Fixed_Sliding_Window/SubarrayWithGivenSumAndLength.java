/*
   Approach

   1. Build the first window of size B
      and calculate its sum.

   2. If the first window sum equals C,
      return 1.

   3. Slide the window one element at a time:
      - Remove the leftmost element.
      - Add the next element.
      - Check if the new window sum equals C.

   4. If any window has sum C,
      return 1.

   5. If no such window exists,
      return 0.

   Complexity Analysis

   Time  : O(N)
           - Each element is processed at most once.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class SubarrayWithGivenSumAndLength {
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
        System.out.print("Enter the required sum: ");
        int C = sc.nextInt();
        int result = solve(A, B, C);
        System.out.println(result);

        sc.close();
    }
    
    public static int solve(int[] A, int B, int C) {
        // An empty array or an invalid window size
        // cannot contain a valid subarray.
        if (A.length == 0 || B <= 0 || B > A.length) {
            return 0;
        }

        // Stores the sum of the current window.
        int sum = 0;

        // Step 1: Build the first window
        int i = 0;
        while (i < B) {
            sum += A[i];
            i++;
        }

        // Step 2: Check the first window.
        if (sum == C) {
            return 1;
        }

        // Step 3: Slide the window.
        int s = 1;
        int e = B;
        while (e < A.length) {
            sum = sum - A[s - 1] + A[e];

            // Check the current window.
            if (sum == C) {
                return 1;
            }

            s++;
            e++;
        }

        // No valid subarray found.
        return 0;
    }
}
