/*
   Approach

   1. Generate every possible subarray
      using two nested loops.

   2. For each subarray:
      - Calculate its sum.
      - Find its length.

   3. If the length is even and
      the sum is less than B,
      increment the result.

   4. If the length is odd and
      the sum is greater than B,
      increment the result.

   5. Return the total number of
      good subarrays.

   Complexity Analysis

   Time  : O(N²)
           - Generates all subarrays.
           - The running sum is updated
             in constant time while
             extending each subarray.

   Space : O(1)
           - Uses only a few extra
             variables.
*/

package Intermediate.Topic06_Sliding_Window_and_Contribution_Technique.Homework.Mixed;

import java.util.*;

public class GoodSubarrays {
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
        int result = goodSubarrays(A, B);
        System.out.println(result);
        sc.close();
    }

    // Returns the no. of good subarrays.
    public static int goodSubarrays(int[] A, int B) {
        // An empty array has no subarrays.
        if (A.length == 0) {
            return 0;
        }

        // Stores the total no. of good subarrays.
        int result = 0;

        // Select the starting index.
        for (int i = 0; i < A.length; i++) {
            // Stores the sum of the current subarray.
            int sum = 0;

            // Extend the subarray.
            for (int j = i; j < A.length; j++) {
                // Include the current element.
                sum += A[j];

                // Calculate the length of the current subarray.
                int length = j - i + 1;

                // Check whether the current subarray is good.
                if (length % 2 == 0 && sum < B) {
                    result++;
                }

                if (length % 2 != 0 && sum > B) {
                    result++;
                }
            }
        }

        // Return the total no .of good subarrays.
        return result;
    }
}
